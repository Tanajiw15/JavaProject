package practice3;

import java.util.Scanner;

   public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter String");
		String a=sc.next();
		
		StringBuffer sb=new StringBuffer(a);
		StringBuffer rev=sb.reverse();
		
		if(a.contentEquals(rev)) 
		{
			System.out.println("This is Palindrome String");
		}
		else 
		{
			System.out.println("This is not a Palindrome String");
		}

	}

}
        
    /*Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String a=sc.next();
	String rev="";
	char ch[]=a.toCharArray();
	
	for(int i=a.length()-1;i>=0;i--) 
	{
	  rev=	rev+ch[i];
	}
	if(a.contentEquals(rev))
	{
		System.out.println("p");
	}	
	else 
	{
		System.out.println("np");
	}
	}
  }*/