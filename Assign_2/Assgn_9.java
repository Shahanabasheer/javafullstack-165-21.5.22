package Assign_2;

public class Assgn_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Prime numbers between 1 and 100");
		int prime;
		
		for(int i=2;i<100;i++){
			prime=0;
			
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime=1;
					//System.out.println(i+" "+j);
				}
			}
			if(prime==0) {
			System.out.print(i+" ");
			}
		}
	}

}
