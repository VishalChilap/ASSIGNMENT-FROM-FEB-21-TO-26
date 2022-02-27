package AssignementFeb21to26;
import java.util.*;
public class NumberDivisibleBy2And8Not12 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0 && num%8==0 &&num%12!=0) {
			System.out.println(num);
		}
	}

}
