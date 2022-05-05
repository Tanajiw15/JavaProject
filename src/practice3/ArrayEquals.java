package practice3;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		
		int a[]= {32,4,5,8,7};
		int b[]= {32,4,5,8,7};
		
		/*boolean ff=Arrays.equals(a, b);
		System.out.println(ff);*/
		
		if(Arrays.equals(a,b)) 
		{
			System.out.println("Both arrays are equal");
		}
		else 
		{
			System.out.println("Both arrays are not equal");
		}

	}

}
