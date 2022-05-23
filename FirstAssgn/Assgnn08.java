package FirstAssgn;

import java.util.Scanner;

public class Assgnn08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,week,day,numDay;
		
		System.out.println("Enter the number of days:");
		Scanner in=new Scanner(System.in);
		numDay=in.nextInt();
		
		year=numDay/365;
		System.out.println("No of year:"+year);
		
		numDay=numDay%365;
		System.out.println(numDay);
		
		month=numDay/30;
		System.out.println("No of months: "+month);
		
		day=numDay%30;
		System.out.println("No of days:"+day);

	}

}
