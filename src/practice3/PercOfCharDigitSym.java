package practice3;

public class PercOfCharDigitSym {

	public static void main(String[] args) {
		
		char ch[]= {'2','A','5','4',' ','D','E','#'};
		
		float uchr=0f;
		float lchr=0f;
		float digit=0f;
		float space=0f;
		float sym=0f;
		float a;
		float b;
		float c;
		float d;
		float e;
		System.out.println("Number of elements in array- "+ch.length);

		for(int i=0;i<ch.length;i++) 
		{
		  if(Character.isUpperCase(ch[i])) 
		  {
		    uchr++;
		     }
		   if(Character.isDigit(ch[i])) 
		    {
			  digit++; 
		    }
		   if(Character.isLowerCase(ch[i]))
		    {
			  lchr++;  
		    }
		   if(Character.isSpace(ch[i]))
		    {
			  space++; 
		    }
		   if(ch[i]=='@'||ch[i]=='$'||ch[i]=='#')
		   {
			  sym++;  		   
		  }
		}
		a=(uchr/ch.length)*100;
		b=(digit/ch.length)*100;
		c=(lchr/ch.length)*100;
		d=(space/ch.length)*100;
		e=(sym/ch.length)*100;
		System.out.println();
	    System.out.println("Perc of uppercase char in array ="+a+"%");
	    System.out.println();
	    System.out.println("Perc of digits in array ="+b+"%");
	    System.out.println();
	    System.out.println("Perc of lowercase char in array ="+c+"%");
	    System.out.println();
	    System.out.println("Perc of Spaces in array ="+d+"%");
	    System.out.println();
	    System.out.println("Perc of Special symbs in array ="+e+"%");	
	}
	
}
