package AssignementFeb21to26;

import java.util.Scanner;

public class WhileLoopFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int facto = 1;
		while(num>0) {
			facto = facto*num;
			num--;	
		}
		System.out.println("The factorial of given number is "+facto);

	}

}
