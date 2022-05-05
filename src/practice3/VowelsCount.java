package practice3;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		char ch[]=a.toCharArray();
        int count=0;
        
		for(int i=0;i<ch.length;i++) 
		{
			switch(ch[i]) 
			{
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
            count++;
            
			}
		}
		System.out.println(count);	
	}

}
