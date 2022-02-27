package AssignementFeb21to26;

public class Terms3DisibleBy3 {
	public static void main(String[] args) {
		int n = 3;
		int count = 0;
		for(int i=1;count<n;i++) {
			int sum = ((4*i)+9);
			if(sum%3==0) {
					
				System.out.println(sum);
				count++;

			}
		}
	}
}

