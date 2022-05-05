package practice3;

import java.util.Scanner;

public class CountOfCharDigitsSpecSymInString {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter String");
	String a=sc.next();
	char ch[]=a.toCharArray();
	
		int uchr=0;
		int lchr=0;
		int digit=0;
		int space=0;
		int other=0;
		int sym=0;
		
		for(int i=0;i<ch.length;i++) 
		{
		  if(Character.isUpperCase(ch[i])) 
		  {
		    uchr++;
			}	
		   if(Character.isDigit(ch[i])) 
		    {
			  digit++;
		    }
		   if(Character.isLowerCase(ch[i]))
		    {
			  lchr++;
		    }
		   if(Character.isSpace(ch[i]))
		    {
			  space++;
		    }
		   if(ch[i]=='@'||ch[i]=='$'||ch[i]=='#')
		   {
			  sym++;
		   }
		  }
		System.out.println("Count of Uppercase letters in array =  "+uchr);
		System.out.println("Count of Lowercase letters in array =  "+lchr);
		System.out.println("Count of digits in array =  "+digit);
		System.out.println("Count of Spaces in array =  "+space);
		System.out.println("Count of Special symbols in array =  "+sym);
		}
}