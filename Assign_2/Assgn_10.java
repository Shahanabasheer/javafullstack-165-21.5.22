package Assign_2;

import java.util.Scanner;

public class Assgn_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int palindrome;
		int reverse=0;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		num=in.nextInt();
		
		palindrome=num;
		
		
		while(num>0) {
			int a;
			 a=num % 10;
			 reverse=(reverse*10)+a;
			 num=num/10;
			 
		}
		if(palindrome==reverse) {
			System.out.println("The number "+palindrome+" is palindrome");
		}
		else {
			System.out.println("The number "+palindrome+" is not palindrome");
		}
		
	}

}
