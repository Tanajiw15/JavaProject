package datatypes.packages;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=7;//prime===number which is divided by or same number.
		int count=0;
		for (int i=1;i<=a;i++) 
		{
			if (a%i==0) 
			{
		     count++;
		    }
	       }
		
	        if (count==2)
			{
			System.out.println("Number is prine");
		
			}
			else 
			{
			System.out.println("Number is not prime");	
			}
	        prime();
		  }
	public static void prime()	{
		
		int a[]= {5,3,2,4};
		int b=0;
		 for (int i=0;i<=a.length-1;i++)
		    {
		     if (a[i]%2==0) 
		       {
		    	b=a[i]+1;
		       }
		       if (b==0)
		        {
			     System.out.println(a[i] +" "+"Prime number");
			    }
	          else 
			   {
				System.out.println(a[i] +" "+"is Not a prime number");
			   }
		      }
	        }
		 }
       


