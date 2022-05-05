package practice2.java;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		String a=sc.next();
		
		StringBuffer sb=new StringBuffer(a);
		StringBuffer rev=sb.reverse();
		
		if (a.contentEquals(rev)) 
		{
		    System.out.println("This is Panindrome number");	
		}
		else 
		{
			System.out.println("This is Not Palindrome number");
		}
	}
}