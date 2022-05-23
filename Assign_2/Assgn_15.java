package Assign_2;

import java.util.Scanner;

public class Assgn_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=in.nextInt();
		int amstrong=num;
		
		while(num>0) {
			int a;
			a=num%10;
			sum=sum+a*a*a;
			num=num/10;
		}
		if(amstrong==sum) {
			System.out.println("The number is Amstrong");
		}
	}

}
