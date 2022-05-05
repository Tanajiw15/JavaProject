package practice3;

import java.util.Scanner;

public class PositiveAndNigativeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		
		if(a>=0) 
		{
			System.out.println("This is positive number");
		}
		else 
		{
			System.out.println("This is nigative number");
		}
	}

}
