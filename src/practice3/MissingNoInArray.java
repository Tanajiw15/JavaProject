package practice3;

public class MissingNoInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++) //To find missing number array elements should be in the rang
		{                           // only one number should be missing in the rang
          sum=sum+a[i];//sum of elements in array
		}
		for(int j=1;j<=5;j++) 
		 {
		   sum1=sum1+j;//sum of elements in the rang(1 to 5)
		 }
		 System.out.println("Missing number in the array is- "+(sum1-sum));
	}
}
	

	
