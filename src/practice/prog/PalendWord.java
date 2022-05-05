package practice.prog;

import java.util.Scanner;

public class PalendWord {

	public static void main(String[] args) 
	{
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");
		   String str=sc.next();
           //String str="WELCOME";
		
	       StringBuffer sb= new StringBuffer(str);
	       StringBuffer rev=sb.reverse();
	       System.out.println("Reverse of string is-"+rev);
	       System.out.println("----------------------------");
	       
	       palindrome();
	       System.out.println("-----------------------------");
	       
	       revnumber();
	       System.out.println("-----------------------------");
	       
	       palindromenumber(); 
	    }

	public static void palindrome()
	{
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the string");
		   String str1=sc.next();
	      //String str1="NITIN";
		   
	       StringBuffer sb= new StringBuffer(str1);
	       StringBuffer rev=sb.reverse();
	           
	       if (str1.contentEquals(rev))
	    	 {
	          System.out.println(str1+ "- "+"This is palindrome string");
	    	 }
	       else 
	         {
	    	  System.out.println(str1+ "- "+"This is not palindrome string");
	         }	
	      }
	
	public static void revnumber() 
	     {
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Number-");
		   int a=sc.nextInt();
          
	       StringBuffer sb= new StringBuffer(String.valueOf(a));
	       StringBuffer rev=sb.reverse();
	       System.out.println("Reverse of Number is-"+rev);
	      }
	
	public static void palindromenumber()
	     {
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Number");
		   String b=sc.next();
	       
	       StringBuffer sb= new StringBuffer(b);
	       StringBuffer rev=sb.reverse();
	       
	       if (b.contentEquals(rev))
	    	 {
	          System.out.println(b+ "- "+"This is palindrome Number");
	    	 }
	       else 
	         {
	    	  System.out.println(b+ "- "+"This is not palindrome Number");
	         }	
	     }
     }

