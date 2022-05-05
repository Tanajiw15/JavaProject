package practice3;

import java.util.Scanner;

public class RevNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(a));
		System.out.println("Revers of Number is= "+sb.reverse());
	}

}
