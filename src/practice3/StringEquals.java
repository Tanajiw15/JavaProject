package practice3;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String a=sc.next();
		
		System.out.println("Enter second String");
		String b=sc.next();
		
		System.out.println(a.equalsIgnoreCase(b));
	}

}
