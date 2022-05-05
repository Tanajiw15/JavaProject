package practice.prog;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Charactor");
		   char b=sc.next().charAt(0);
		   
	       if (b=='A'||b=='E'||b=='I'||b=='O'||b=='E'||b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
	    	 {
	          System.out.println(b+ "- "+"Is Vowel");
	    	 }
	       else 
	         {
	    	  System.out.println(b+ "- "+"Is Consonant");
	         }	
	       System.out.println("-----------------------");
	       
	       vowelconscount();
	       }
	public static void vowelconscount(){
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the String-");
		   String b=sc.next();
		   char ch[]=b.toCharArray();
		   int count=0;
		   for(char each:ch)
	         {
		   //for(int i=0;i<b.length();i++)
		   //{
		   //switch(ch[i])
		   switch(each)
		   {
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   count++;
		   }
	     }
		   System.out.println("Count of Vowels in string is-"+" "+count);
	}
}	   
	       