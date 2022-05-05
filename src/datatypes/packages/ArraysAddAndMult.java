package datatypes.packages;

public class ArraysAddAndMult {

public static void main(String[] args) {
	
	int arr[]= {2,4,6,8};
	int addit=0;
	System.out.println("addition of elements in array is");
	
	for(int i:arr)
	{ 
   addit=addit+i;
	}
	System.out.println(addit);
	System.out.println("------------------------------");
	mult();
  }

public static void mult() {
	
	int arr[][]= {{4,4},{2,4}};
	int arr1[][]= {{2,4},{4,2}};
	int arr2[][]=new int [2][2];
	int sum=0;
	System.out.println("Marix maltiplication is");
	for(int i=0;i<=1;i++)
	{
	for(int j=0;j<=1;j++)
	{
	for (int k=0;k<2;k++)
	{	
	sum=sum+arr[i][k]*arr1[k][j];
     }
	arr2[i][j]=sum;
	sum=0;
	}
   }
	for(int i=0;i<=1;i++)
	{
	for(int j=0;j<=1;j++)
	{
	System.out.print(arr2[i][j]+" ");
	}
	System.out.println( );
  }
 }	
}