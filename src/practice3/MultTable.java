package practice3;

import java.util.Scanner;

public class MultTable {
public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
			int res=a*i;
			System.out.println(a+"*"+i+"= "+res);
		}
     }
 }