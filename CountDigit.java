package AssignementFeb21to26;
import java.util.*;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}System.out.println(count);


	}

}
