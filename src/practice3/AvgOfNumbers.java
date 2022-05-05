package practice3;

import java.util.Scanner;

public class AvgOfNumbers {

	public static void main(String[] args) {
		
		//calculate average of numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total numbers");
	    int b=sc.nextInt();
		float sum=0;
		float avg=0f;
		
		for(int i=1;i<=b;i++) 
		{
			System.out.println("Enter numbers");
			float a=sc.nextInt();
			sum=sum+a;
			avg=sum/i;
		}
		 System.out.println("Average of numbers is= "+avg);
		
	 }
   }


