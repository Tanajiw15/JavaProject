package practice3;

import java.util.Scanner;

public class RevNo1 {

	public static void main(String[] args) {   //first method
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    
	    int a=sc.nextInt();
        String b=String.valueOf(a);
        char ch[]=b.toCharArray();
        
	    for(int i=ch.length-1;i>=0;i--)
	    {
		  System.out.println(ch[i]);
	    }
          imp();
       }
	
	public static void imp()           // second method
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		int rem=0;
		int sum=0;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
			System.out.print(rem);
				}
		
		//System.out.println(sum);

	}     
}