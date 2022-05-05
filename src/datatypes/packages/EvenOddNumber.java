package datatypes.packages;

public class EvenOddNumber {

        public static void main(String[] args) {
		int a=4;
		  if (a%2==0) 
		  {
			System.out.println("Given Number is even");
		   }
		   else 
		    {
			System.out.println("Given Number is odd");
		    }
		   System.out.println("------------------");
		  evenoddarr();
		   }
	
       public static void evenoddarr(){
    	   
		int a[]= {2,5,7,8,9};
		
		  for (int i=0;i<=4;i++)
		  {
		    if (a[i]%2==0) 
		    {	
	         System.out.println(a[i]+" "+"is the even number");
		    }
		    else 
		    {
		     System.out.println(a[i]+" "+"is the odd number");
	         }
          }
	
       }      
   }
	

