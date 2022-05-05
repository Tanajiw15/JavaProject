package datatypes.packages;

public class CountOddEven {

	public static void main(String[] args) {
		int a[]= {2,5,7,8,9};
		int evencount=0;
		int oddcount=0;
		
		for (int i=0;i<=4;i++)
		{
		   if (a[i]%2==0) 
		    {
			evencount++;
		     }
		   else 
		   {
			oddcount++;
		      }
		     }
		
		System.out.println("count of even numbers is"+" "+evencount);
		System.out.println("count of odd numbers is"+" "+oddcount);
      }
    }	