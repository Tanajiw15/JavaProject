package practice3;

import java.util.Scanner;

public class AppearanceOfCharInString {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();*/
		
		String a="Welcome";
		
		char ch[]=a.toCharArray();
        int count=0;
        
		for(int i=0;i<ch.length;i++) 
		{
			switch(ch[i]) 
			{
			case'e':
            count++;
            
			}
		}
		System.out.println("Number of occurence of vowels is- "+count);	
	}

}
