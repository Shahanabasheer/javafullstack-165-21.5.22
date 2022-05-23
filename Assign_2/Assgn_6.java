package Assign_2;

public class Assgn_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pattern a).");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern b).");
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Pattern c).");	
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern d).");	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
					}
			System.out.println();
		}
		
		System.out.println("Pattern e).");	
		
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=5;j>=i;j--) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
