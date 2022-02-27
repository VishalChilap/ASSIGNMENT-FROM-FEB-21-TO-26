package AssignementFeb21to26;

public class PantPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=1;
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=i+1;j<=5;j++) {
				System.out.print("*");
			}
			if(i>=1) {
				space = space+2;
			}
			System.out.println();
		}


	}

}
