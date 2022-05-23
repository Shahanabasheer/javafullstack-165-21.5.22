package Assign_2;

import java.util.Scanner;

public class Assgn_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		a=in.nextInt();
		b=in.nextInt();
		
		if(a>b) {
			System.out.println("A:"+a+" is greater than B:"+b);
		}
		else {
			System.out.println("B:"+b+" is greater than A:"+a);
		}
			

	}

}
