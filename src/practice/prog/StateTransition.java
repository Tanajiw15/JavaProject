package practice.prog;

import java.util.Scanner;

public class StateTransition {

	public static void main(String[] args) {
		int passw = 1234;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter Password");
		int a = sc.nextInt();
		if (a == passw) 
	  {
		System.out.println("You are logged in succesessfully.");
		} 
	else
	  {
	 System.out.println("Wrong password,Please re-enter password.Your account will be blocked after 3 incorrect attempts.");
	 Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		if (b == passw)
		{
		System.out.println("You are logged in succesessfully.");
		} 
	  else 
	   {
	 System.out.println("Wrong password,please re-enter again.");
	 Scanner sd = new Scanner(System.in);
	 	int e = sd.nextInt();
		if (e == passw) 
		{
		System.out.println("You are logged in succesessfully.");
		}
		else 
		{
		System.out.println("Sorry,Your account has been blocked.");
		}

	    }
	  }

   }
}
