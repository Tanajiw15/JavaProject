package practice3;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.next();
		
		StringBuffer sb=new StringBuffer(a);
		System.out.println("Reverse of String is- "+sb.reverse());
	}

}
