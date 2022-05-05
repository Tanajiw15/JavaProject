package practice3;

public class ProgOnStar2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("----------------");
		main();
		System.out.println("----------------");
		main1();
	}
   public static void main() {
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
}
   public static void main1() {
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
}
} 