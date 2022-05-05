package practice2.java;

import java.util.Scanner;

public class RevOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		System.out.println(sb);
	}

}
