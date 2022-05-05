package datatypes.packages;

public class SwitchBreak {

	public static void main(String[] args) {
		
		int month=2;
		switch(month) 
		{
		case 1: System.out.println("Jan");break;
		case 2: System.out.println("Feb");break;
		case 3: System.out.println("Mar");break;
		case 4: System.out.println("Apr");break;
		case 5: System.out.println("May");break;
		case 6: System.out.println("Jun");break;
		case 7: System.out.println("Jul");break;
		case 8: System.out.println("Aug");break;
		case 9: System.out.println("Sept");break;
		case 10:System.out.println("Oct");break;
		case 11:System.out.println("Nov");break;
		case 12:System.out.println("Dec");break;
		default :System.out.println("invalid month");
		}
System.out.println("---------------------------------");

		day();
		
System.out.println("---------------------------------");

		season();
	  }
    public static void day(){
      int day=7;
      switch (day) 
      {
      case 1: System.out.println("Mon");break;
      case 2: System.out.println("Tue");break;
      case 3: System.out.println("Wed");break;
      case 4: System.out.println("Thu");break;
      case 5: System.out.println("Fri");break;
      case 6: System.out.println("Sat");break;
      case 7: System.out.println("Sun");break;
      default: System.out.println("Invalid Day");
      }}
    
      public static void season()
      {
    	  String season= "summer";
    	  switch(season) 
    	  {
    	  case "summer" :System.out.println("Feb");
    	                 System.out.println("Mar");
    	                 System.out.println("Apr");
    	                 System.out.println("May");break;
    	  case "Rainy"  :System.out.println("Jun");
                         System.out.println("Jul");
                         System.out.println("Aug");
                         System.out.println("Sept");break;
    	  case "winter" : System.out.println("Oct");
                         System.out.println("Nov");
                         System.out.println("Dec");
                         System.out.println("Jan");break;
           default      :System.out.println("Bogus season");        
    	  }
      }
	}

