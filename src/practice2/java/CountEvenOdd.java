package practice2.java;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		int ecount=0;
		int ocount=0;
		int rem=0;
		System.out.println("Enter the number");//Input like a=25143
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		while(a>0)
		{
		 rem=a%10;		
		 if(rem%2==0)
		   {
		     ecount++;
		   } 
		else
		   {
			ocount++;
		   }
		  a=a/10;
		}
		System.out.println("Count of even numbrs ="+" "+ecount);
		System.out.println("Count of odd numbers ="+" "+ocount);
	}

}
