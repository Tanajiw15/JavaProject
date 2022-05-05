package practice3;

public class InsertInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,60};
		int index=2;//position =index number
		int element=50;//element to be added
		
		for(int i=a.length-1;i>index;i--) 
		{
			a[i]=a[i-1];
		}
       a[index]=element;
       
       for(int i=0;i<a.length;i++) 
       {
    	   System.out.println(a[i]+" ");
       }
	}

}
