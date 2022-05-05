package practice3;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		String a= "My name is vijay. vijay is boy. vijay play cricket.";
		char ch[]=a.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) 
		{
        if (ch[i]==' ') 
        {
	     count++;
	     
        }
    }
		System.out.println(count+1);
    }
}
     // Second mothod

      /*String a= "My name is vijay. vijay is boy. vijay play cricket.";
        String b[]=a.split(" ");
        int count=0;
        for(int i=0;i<b.length;i++) 
		{
		if (b[i].contains("vijay")) 
		{
		 count++;
		 
		}
		}
		System.out.println(count);
		
		}
		}*/