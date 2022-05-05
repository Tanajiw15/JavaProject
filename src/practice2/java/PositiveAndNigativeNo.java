package practice2.java;

import java.util.Scanner;

public class PositiveAndNigativeNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		if(a>=0) 
		{
			System.out.println("This is Positive number");
		}
		else 
		{
			System.out.println("This is Nigative number");
		}
	}

}
