package practice.prog;

public class SquareOfStars {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) 
		{
		  for(int j=1;j<=4;j++) 
		  {
		System.out.print("*");
	   }
    System.out.println();
    
     }
		System.out.println("----------------");
		
		triangle1();
		System.out.println("----------------");
		triangle2();
		System.out.println("----------------");
		triangle3();
		System.out.println("----------------");
		//triangle4();
   }
	public static void triangle1() 
	{
		for(int i=1;i<=4;i++) 
		{
		  for(int j=1;j<=i;j++) 
		  {
		System.out.print("*");
	   }
    System.out.println();
     }	
	}
	public static void triangle2() 
	{
		for(int i=1;i<=4;i++) 
		{
			for(int j=2;j<=i;j++) 
			  {
				System.out.print(" ");
			  }
			for(int k=4;k>=i;k--) 
			{
		System.out.print("*");		
	   }
    System.out.println();
	}
  }
	public static void triangle3() 
	{
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) 
			  {
				System.out.print(" ");
			  }
			for(int k=4;k>=i;k--) 
			{
		System.out.print(" *");		
	   }
    System.out.println();
	}
}
	public static void triangle4() 
	{
		for(int i=1;i<=5;i++) 
		{
		  for(int j=1;j<=5;j++) 
		  {
			  if(i>=2 && j>=2 && i<=4 && j<=4)
			  {
				  System.out.println(" ");
			  }
			  else 
			  {
			      System.out.print("*");
	          }
            System.out.println();
            }	
          }
      }
}