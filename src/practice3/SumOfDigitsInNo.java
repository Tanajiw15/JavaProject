package practice3;

import java.util.Scanner;

public class SumOfDigitsInNo {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int rem=0;
	int sum=0;
	
	while(a>0) {
		rem=a%10;
		sum=sum+rem;
		a=a/10;
		}
	System.out.println("Sume of digits of given number is- "+sum);
	}

}