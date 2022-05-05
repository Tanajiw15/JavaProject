package practice3;

import java.util.Scanner;

public class RevString1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		char ch[]=a.toCharArray();
		
	    for(int i=ch.length-1;i>=0;i--)
	    {
		  System.out.print(ch[i]);
	    }

       }
    }
