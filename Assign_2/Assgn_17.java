package Assign_2;

import java.util.Scanner;

public class Assgn_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num=in.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sumOdd=sumOdd+i;
			}
			else {
				sumEven=sumEven+i;
			}
		}
		int a=num/2;
		System.out.println("Average of odd numbers:"+(sumOdd/a));
		System.out.println("Average of even numbers:"+(sumEven/a));
	}

}
