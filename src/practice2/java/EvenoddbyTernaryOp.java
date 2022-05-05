package practice2.java;

import java.util.Scanner;

public class EvenoddbyTernaryOp {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		
	    String b=(a%2==0)?"Given number is even":"Given number is Odd";
		System.out.print(b);*/
		
		/*int a=21;
		int b=20;
		int c=(a>b)?a:b;
		System.out.print(c);*/
		
		int a=500;
		int b=600;
		int c=400;
		int d=(a>b)?a:b;
		int e=(d>c)?d:c;
		System.out.println(e);
	 }
  }
