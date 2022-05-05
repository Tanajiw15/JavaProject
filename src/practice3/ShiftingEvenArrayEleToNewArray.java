package practice3;

public class ShiftingEvenArrayEleToNewArray {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int e=0;
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
		e++;
		}
		}
		int b[]=new int [e];
		int k=0;
		for(int j=0;j<a.length;j++) 
		{
		if(a[j]%2==0) 
		{
		b[k]=a[j];
		k=k+1;
         }
		}
		for(int l=0;l<e;l++) 
		{
		System.out.print(b[l]+" ");
		}
	   }
	}