package practice3;

public class EveboddNoInArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,8};
			for(int i=0;i<a.length;i++) 
			{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]+" "+"is even Number");
			}
			else 
			{
				System.out.println(a[i]+" "+"is odd Number");
			}
		}

	}

}
