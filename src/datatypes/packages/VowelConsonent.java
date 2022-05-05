package datatypes.packages;

public class VowelConsonent {

	public static void main(String[] args) {
		
		char a[]= {'A','E','F'};
		
		for(int i=0;i<=a.length;i++) 
		  {
			 if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') 
			    {
				System.out.println(a[i]+" "+"Is Vowel");
			     }
			    else 
			     {
				System.out.println(a[i]+" "+"Is Consonant");	
			     }
	        }
	    }
	}

