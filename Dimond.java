package AssignementFeb21to26;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st = 1;
		int sp = 4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++) {
				System.out.print("*");
			}
			if(i<=4) {
				st = st+2;
				sp = sp-1;
			}else {
				sp = sp+1;
				st = st-2;
			}
			System.out.println();
		}
	}
}
