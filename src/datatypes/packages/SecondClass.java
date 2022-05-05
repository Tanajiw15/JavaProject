package datatypes.packages;

public class SecondClass {
	String address;
	float weight=72f;
	String name;
	static float height=7.2f;
public static void main(String[] args) {
SecondClass obj= new SecondClass();

     float weight=73f;
     obj.name= "My name is Tanaji" ;
     obj.address= "I am from Solapur";
     height=6.2f;
     System.out.println(height);
     System.out.println(obj.name);
     System.out.println(obj.address);
     System.out.println(weight);
     cantalk();
     obj.caneat();
	}
public static void cantalk() {
	SecondClass obj1= new SecondClass();
	obj1.weight=74f;
	String address="Pune";
	height=5.4f;
	System.out.println(obj1.weight);
	System.out.println(address);
    System.out.println("can Talk");	
}
public void caneat() {
	SecondClass obj1= new SecondClass();
	obj1.weight=75f;
	height= 7.2f;
	String address="Pune";
	System.out.println(obj1.weight);
	System.out.println(address);	
    System.out.println("Can eat");
	
}

}
