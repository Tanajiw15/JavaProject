package practice3;

public class MaxInArray {

	public static void main(String[] args) {
		
		int a[]= {2,5,10,9};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
		if(a[i]>max) 
		{
			max=a[i];
		}	
		
		}
		System.out.println("Max number in array is- "+max);
	}

}
