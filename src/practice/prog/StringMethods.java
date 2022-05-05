package practice.prog;

public class StringMethods {

	public static void main(String[] args) {
		
		// String lenght
		String s1="WELCOME";
		System.out.println("Sring lenght is"+" "+s1.length());
		
        System.out.println("------------------------------");
        
        //Concatination-----adding two string
       String s2="WEL";
       String s3="COME";
       System.out.println(s2.concat(s3));//Method-1
       System.out.println(s2+s3);//Method-2
       
       System.out.println("-------------------------------");
       
       //equals.......comparison of two strings
       String s4="WELL";
       String s5="COME";
       String s6="well";
       System.out.println(s4.equals(s5));//not matching so false
       System.out.println(s4.equals(s6));//not matching so false---case sensitive
       System.out.println(s4.equalsIgnoreCase(s6));//matching so result is true 
       
       System.out.println("-------------------------------");
       
       //Contains method....checks part of string is matching or not
       String s7="WELCOME";
       System.out.println(s7.contains("WEL"));//true
       System.out.println(s7.contains("WELL"));//LL not available so false
       System.out.println(s7.contains("wel"));//Case sensitive so false
       System.out.println(s7.contains("COME"));//true
       
       System.out.println("-------------------------------");
       
       //substring-used to extract substing fron main string
       String s8="WELCOME TO KTCTC";
       System.out.println(s8.substring(0,3));//starting index starts from 0 & ending index start from 1.
       System.out.println(s8.substring(8,10));
       System.out.println(s8.substring(11,16));
       
       System.out.println("-------------------------------");
       
       //Replace-----used to replace some part of string
       String s9="WELCOME OF KTCTC" ;
       String c="WELCOME FO KTCTC" ;
       System.out.println(c.replace('F','T'));
       System.out.println(s9.replace("OF", "TO"));
       
       System.out.println("-------------------------------");
       
       //Reverse string
       String str="WELCOME";
       String str1="NITIN";
       StringBuffer sb= new StringBuffer(str);
       StringBuffer sb1= new StringBuffer(str1);
       System.out.println(sb.reverse());
       System.out.println(sb1.reverse());
             
	}

}
