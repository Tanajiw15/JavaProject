package practice3;

import java.util.Scanner;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter character");
       String a=sc.next();
       char ch[]=a.toCharArray();
       
       for(int i=0;i<ch.length;i++) 
       {
	   if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
	   {
		   System.out.print(a+" is vowel");
	   }
	   else 
	   {
		   System.out.println(a+" is consonent");
	   }
   }
  }

}
