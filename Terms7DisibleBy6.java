package AssignementFeb21to26;

public class Terms7DisibleBy6 {
	public static void main(String[] args) {
		int count = 1;
		int product;
		for(int i=1;count<=7;i++) {
			product = i*6*i;
			if(product%6==0) {
				System.out.println(product);
				count++;
			}
		}
	}

}
