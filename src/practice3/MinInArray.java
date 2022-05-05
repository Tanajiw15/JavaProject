package practice3;

public class MinInArray {

	public static void main(String[] args) {
		
		int a[]= {2,5,8,4,7};
		int min=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
		if(a[i]<min) 
		{
		    min=a[i];
		}	
		}
		System.out.println("Min number in array is- "+min);
	}

}
