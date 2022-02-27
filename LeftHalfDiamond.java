package AssignementFeb21to26;

public class LeftHalfDiamond {
	public static void main(String[] args) {
		int st = 1;
		int sp = 4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			if(i<=4) {
				st = st+1;
				sp = sp-1;
			}else {
				sp = sp+1;
				st = st-1;
			}
			System.out.println();
		}
	}

}
