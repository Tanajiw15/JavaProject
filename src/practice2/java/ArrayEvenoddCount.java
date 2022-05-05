package practice2.java;

public class ArrayEvenoddCount {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7};
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) 
			{
				ecount++;
			}
			else 
			{
				ocount++;
			}
		}
		System.out.println("Count of even no="+ecount);
		System.out.println("Count of odd no="+ocount);
	}

}
