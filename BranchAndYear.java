package AssignementFeb21to26;

import java.util.Scanner;

public class BranchAndYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the branch");
		int year = sc.nextInt();
		System.out.println("Enter the year");
		String branch = sc.next();
		switch(year) {
		case 1 :
			System.out.println("All subject are common");
			break;
		case 2 :
		case 3 :
		case 4 :
			switch(branch) {
			case "CS" :
			case "IT" :
				System.out.println("Major subject are from computer");
				break;
			case "ECE" :
			case "EEE" :
				System.out.println("Major subject are from electrical");
				break;
			case "Mechanical" :
				System.out.println("Major subject are from mechanical");
				break;
				default :
					System.out.println("Invalid branch input");		
			}
			break;
			default :
				System.out.println("Invali year input");
		}

	}

}
