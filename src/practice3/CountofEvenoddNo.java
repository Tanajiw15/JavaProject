package practice3;

import java.util.Scanner;

public class CountofEvenoddNo {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");//Input like a=1234458
			int a=sc.nextInt();
			int ecount=0;
			int ocount=0;
			while(a>0) 
			{
				int rem=a%10;
				if(rem%2==0) 
				{
					ecount++;
				}
				else 
				{
					ocount++;
				}
				a=a/10;
				
			}
	         System.out.println("Count of Even Numbers= "+ecount);
	         System.out.println("Count of Even Numbers= "+ocount);
	   }
	
	}


