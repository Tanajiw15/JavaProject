package practice3;

import java.util.Scanner;

public class SwappingOfNo {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("a= ");
	int a=sc.nextInt();
	System.out.println("b= ");
	int b=sc.nextInt();
	int c;
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("After swapping a= "+a);
	System.out.println("After swapping b= "+b);
		
	}

}
