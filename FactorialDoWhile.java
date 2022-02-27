package AssignementFeb21to26;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int facto = 1;
		int i = 1;
		do {
			facto = facto*i;
			i++;
		}while(i<=num); 
			System.out.println("The factorial of given number is "+facto);
	}

}
