package Assign_2;

public class Assgn_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=100;i<=200;i++) {
			if(i%7==0) {
				sum=sum+i;
				//System.out.println("numbers:"+i);
			}
		}
		System.out.println("The sum is:"+sum);
	}

}
