package datatypes.packages;

public class GreaterNo {

	public static void main(String[] args) {
		int A = 4;
		int B = 5;
		int C = 4;

		if ((A > B) && (A > C)) 
		{
			System.out.println("A is greater");
		}
		else if ((B > A) && (B > C))
		{
			System.out.println("B is greater");
		} 
		else if ((C > A) && (C > B)) 
		{
			System.out.println("C is greater");
		} 
		else 
		{
			System.out.println("A,B & C are Equal");
		}
	}
}
