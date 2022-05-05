package practice3;

import java.util.Scanner;

public class GreaterNo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) 
		{
			System.out.println(a+"  is gteater number");
		}
		
		else 
		{
			System.out.println(b+"  is Greater number");
		}
	}

}
