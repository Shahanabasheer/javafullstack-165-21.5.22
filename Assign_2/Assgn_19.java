package Assign_2;

public class Assgn_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
