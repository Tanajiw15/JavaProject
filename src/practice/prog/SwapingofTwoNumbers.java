package practice.prog;

public class SwapingofTwoNumbers {

	public static void main(String[] args) {
	
     int a=10;
     int b=30;
     int c;
     c=a;
     a=b;
     b=c;
     System.out.println("a="+" "+a);
     System.out.println("b="+" "+b);
     System.out.println("------------------");
     swaping1()	;
     System.out.println("------------------");
     swaping2();
     System.out.println("------------------");
     swaping3();
     }
	
	  public static void swaping1() 
	  {
		  int a=10;
		  int b=30;
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("a="+" "+a);
		  System.out.println("b="+" "+b);
	  }
	  public static void swaping2() 
	  {
		  int a=10;
		  int b=30;
		  a=a^b;
		  b=a^b;
		  a=a^b;
		  System.out.println("a="+" "+a);
		  System.out.println("b="+" "+b);
	 }
	  public static void swaping3() 
	  {
		  int a=10;
		  int b=30;
		  b=a+b-(a=b);
		  System.out.println("a="+" "+a);
		  System.out.println("b="+" "+b);
	  }
	}	  