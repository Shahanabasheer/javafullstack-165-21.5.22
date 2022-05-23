package Assign_2;

import java.util.Scanner;

public class Assgn_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		a=in.nextInt();
		
		if(a>0) {
			System.out.println("The number is positive");
		}
		else if(a<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
