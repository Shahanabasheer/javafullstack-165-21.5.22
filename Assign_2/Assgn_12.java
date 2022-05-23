package Assign_2;

import java.util.Scanner;

public class Assgn_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" *"+i+" ="+(num*i));
		}
	}

}
