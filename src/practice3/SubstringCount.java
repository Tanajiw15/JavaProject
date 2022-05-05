package practice3;

public class SubstringCount {

	public static void main(String[] args) {
		
		String a="ABBBDFJGGDFABFJFHYDAB";//find number of time "AB" in string 
		char ch[]=a.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) 
		{
		  if(ch[i]=='A'&&ch[i+1]=='B') 
		  {
			  count++;
		  }	
		}
		System.out.println("count of AB in given string is- "+count);
	}

}
