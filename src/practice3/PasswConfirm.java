package practice3;

import java.util.Scanner;

    public class PasswConfirm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		int a = sc.nextInt();
		int passw = 1234;

		if (passw == a) 
		{
			System.out.println("You are logged in successfully");
		} 
		else 
		{
			System.out.println("Wrong password,After three incorrect attemps account will be blocked");
			Scanner sb = new Scanner(System.in);
			int b = sb.nextInt();

			if (b == passw) 
			{
				System.out.println("You are logged in successfully");
			} 
			else 
			{
				System.out.println("Wrong password");
				Scanner sa = new Scanner(System.in);
				int c = sa.nextInt();

				if (c == passw)
				{
					System.out.println("You are logged in successfully");
				} else 
				{
					System.out.println("Wrong password,Your account has been blocked");
				}

			}
		}

	}

}
