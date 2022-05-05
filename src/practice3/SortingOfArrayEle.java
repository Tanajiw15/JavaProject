package practice3;

import java.util.Arrays;

public class SortingOfArrayEle {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,2,3};
		int temp;
		
	    for(int i=0;i<a.length-1;i++) 
	    {
	    	for(int j=0;j<a.length-1;j++) 
	    	{
	    		//if(a[j]>a[j+1])//sort in Asc order
	    		if(a[j]<a[j+1])//Sort in Desc order
	    		{
	    			temp=a[j];
	    			a[j]=a[j+1];
	    			a[j+1]=temp;
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(a));
	}

}
