package datatypes.packages;

public class SeasonSelection {

	public static void main(String[] args) {

		int month = 6;
        if (month == 1 || month == 2 || month == 3 || month == 4)
        {
			System.out.println("Winter Season");
		} 
        else if (month == 5 || month == 6 || month == 7 || month == 8) 
        {
			System.out.println("Rainy Season");
		}
        else if (month == 9 || month == 10 || month == 11 || month == 12) 
        {
			System.out.println("Sumer Season");
		} 
        else
        {
			System.out.println("Bogus month");
		}
	}
}