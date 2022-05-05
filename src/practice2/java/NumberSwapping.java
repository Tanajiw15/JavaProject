package practice2.java;

import java.util.Scanner;

public class NumberSwapping {

	public static void main(String[] args) {
		
		int c=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter second number");
		int b=s2.nextInt();
		
		/*c=a;//------------First method
		a=b;
		b=c;
		
		a=a^b;//----------Second method
		b=a^b;
		a=a^b;
		
		
		b=a+b-(a=b);*///-------Third method
		
		a=a+b;//---------------Fourth method
		b=a-b;
		a=a-b;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
