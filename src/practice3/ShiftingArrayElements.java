package practice3;

public class ShiftingArrayElements {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10,12,24,36};
		int e=0;
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%3==0&&a[i]%4==0)
		{
		e++;
		}
		}
		int b[]=new int [e];
		int k=0;
		for(int j=0;j<a.length;j++) 
		{
		if(a[j]%3==0&&a[j]%4==0)		
		{
		b[k]=a[j];
		k++;
         }
		}
		for(int l=0;l<e;l++) 
		{
		System.out.print(b[l]+" ");
		}
	   }
	}

