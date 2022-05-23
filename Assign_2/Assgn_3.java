package Assign_2;

import java.util.Scanner;

public class Assgn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the year:");
		year=in.nextInt();
		
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.println("The year:"+year+" is leap year");
		}
		else {
			System.out.println("The year:"+year+" is normal year");
		}
	}

}
