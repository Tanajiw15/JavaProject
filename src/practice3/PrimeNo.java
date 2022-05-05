package practice3;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0) 
			{
			  count++;
			}
		}
			if(count==2) 
			{
			System.out.println("This is prime Number ");	
			}
			else 
			{
				System.out.println("Not a prime number");
			}
		}
	}


