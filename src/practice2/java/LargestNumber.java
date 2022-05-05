package practice2.java;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter second number");
		int b=s2.nextInt();
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter Third number");
		int c=s3.nextInt();
		
		if((a>b)&&(a>c)) 
		  {
			System.out.println("Largest Number is a= "+a);
		  }
		else if ((b>a)&&(b>c)) 
			{
			System.out.println("Largest Number is b= "+b);
			}
		else 
			{
			System.out.println("Largest Number is c= "+c);
			}
		}
	}
