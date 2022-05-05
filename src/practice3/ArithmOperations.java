package practice3;

import java.util.Scanner;

public class ArithmOperations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter operators'+' or'-'or'*'or'/' to perform operation");
		String symb=sc.next();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int add;
		int sub;
		int mult;
		int div;
		
		switch(symb)
		{
		case"+":add=a+b;System.out.println("Addition of numbers is= "+add);break;
		case"-":sub=a-b;System.out.println("Subtraction is= "+sub);break;
		case"*":mult=a*b;System.out.println("Mult of numbers is= "+mult);break;
		case"/":div=a/b;System.out.println("Div of numbers is "+div);break;
		
		}
		
	}

}
