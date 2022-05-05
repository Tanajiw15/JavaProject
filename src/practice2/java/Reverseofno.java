package practice2.java;

import java.util.Scanner;

public class Reverseofno {

	public static void main(String[] args) {
		
	    System.out.println("Enter the number");//input like a=1234
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int rem=0;
		
		while(a>0)
		{
		 rem=a%10;		
		if (rem!=0)
		{
        System.out.print(rem);//output - 4321
		}
		a=a/10;
	}

   }
}