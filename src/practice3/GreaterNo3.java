package practice3;

import java.util.Scanner;

public class GreaterNo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if((a>b)&&(a>c)) 
		{
			System.out.println(a+"  is gteater number");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b+"  is Greater number");
		}
		else 
		{
			System.out.println(c+"  is Greater number");
		}
	}

}

