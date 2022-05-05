package practice.prog;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//int a=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		if(a%2==0) 
		{
			System.out.println("Given number is even");
		
		}
		else 
		{
			System.out.println("Given number is odd");
		}
		System.out.println("------------------------");
        inarray();
        System.out.println("------------------------");
        evenodd1();
	}
	public static void inarray() {
		int a[]= {4,3,6,7,2,5};
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++) 
		{
		if(a[i]%2==0) 
		{
		//int b=a[i];	
	     //System.out.println("Even"+" "+b);
	    System.out.println("Even"+" "+a[i]);
	    b++;
		}
		else 
		{
		System.out.println("Odd"+" "+a[i]);
		c++;
		}
	   }
		System.out.println("Count of even number-"+" "+b);
		System.out.println("Count of even number-"+" "+c);
     }
	public static void evenodd1() 
	{
		int a=1235;
		int evencount=0;
		int oddcount=0;
		int reminder=0;
		
	  while(a>0) 
		{
	     reminder=a%10;
	     if (reminder%2==0) 
	     {
	      evencount++;	 
		 }
	     else 
	     {
		  oddcount++;
	     }
	      a=a/10;   
        }
	System.out.println("Count of even number-"+" "+evencount);
	System.out.println("Count of odd number-"+" "+oddcount);
      }
	}