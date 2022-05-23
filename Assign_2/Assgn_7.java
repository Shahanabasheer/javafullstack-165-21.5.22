package Assign_2;

import java.util.Scanner;

public class Assgn_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the limit");
		limit=in.nextInt();
		
		System.out.println("Even numbers are:");
		for(int i=2;i<=limit;i=i+2) {
			System.out.println(i+" ");
		}
	}

}
