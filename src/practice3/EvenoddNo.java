package practice3;

import java.util.Scanner;

public class EvenoddNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");//Input like a=5

		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+" "+"Is Even Number");
		}
		else
		{
			System.out.println(a+" "+"Is Odd Number");
		}
	}
}