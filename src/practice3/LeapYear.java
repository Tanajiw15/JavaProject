package practice3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//2000,2004,2008,2012,.......
		System.out.println("Enter Year");
		int year=sc.nextInt();
		
		if((year%400==0)||((year%4==0)&&(year%100!=0))) 
		{
			System.out.println(year+" Leap Year");
		}
		else 
		{
			System.out.println(year+" Not a leap year");
		}

	}

}
