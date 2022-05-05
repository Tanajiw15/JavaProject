package practice3;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		String a=sc.next();
		
		StringBuffer sb=new StringBuffer(a);
		StringBuffer rev=sb.reverse();
		
		if(a.contentEquals(rev)) 
		{
			System.out.println("This is Palindrome number");
		}
		else 
		{
			System.out.println("This is not a Palindrome Number");
		}

	  }

    }
    /*Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");

      int a=sc.nextInt();;
      int no=a;
      int rev=0;
      int sum=0;
      while(no>0) 
      {
      rev=no%10;
      sum=sum*10+rev;
       no=no/10;
     }
     if(a==sum)
     {
	System.out.println("p");
    }	
     else 
    {
	System.out.println("np");
   }
   }				
}*/


  


   

        