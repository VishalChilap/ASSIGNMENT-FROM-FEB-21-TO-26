package AssignementFeb21to26;

import java.util.Scanner;

public class NumberBetween0To10AndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num>0 && num<=10) {
			if(num%2==0) {
				System.out.println("Number is even");
			}else {
				System.out.println("Number is odd");

			}
		}else {
			System.out.println("Invalid input");

		}

	}

}
