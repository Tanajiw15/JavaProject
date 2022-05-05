package practice2.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No-");
		int a=sc.nextInt();
		if(a%2==0)
		{
		System.out.println("Given Number is even");	
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}

}
