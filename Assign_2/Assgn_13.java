package Assign_2;

import java.util.Scanner;

public class Assgn_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int num1=in.nextInt();
		int num2=in.nextInt();
		
		int temp;
		System.out.println("Before swapping:"+num1+" "+num2);
		
		/*
		temp=num1;
		num1=num2;
		num2=temp;
		*/
		
		temp=num1+num2;
		num2=temp-num2;
		num1=temp-num1;
		System.out.println("After swapping:"+num1+" "+num2);
		
		
	}
}
