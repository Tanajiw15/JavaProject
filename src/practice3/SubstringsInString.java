package practice3;

import java.util.Scanner;

public class SubstringsInString {

	public static void main(String[] args) {
		
		String a= "My name is vijay. vijay is boy. vijay play cricket.";
		String b[]=a.split(" ");
		int count=0;
		for(int i=0;i<b.length;i++) 
		{
        if (b[i].contains("vijay")) 
        {
	     count++;
	     
        }
    }
		System.out.println("Count of subsring 'vijay' is -"+count);	
	}

}
