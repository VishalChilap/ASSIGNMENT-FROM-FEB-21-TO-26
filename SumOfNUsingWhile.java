package AssignementFeb21to26;

import java.util.Scanner;

public class SumOfNUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit");
		int ul = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(i<=ul) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum);

	}

}
