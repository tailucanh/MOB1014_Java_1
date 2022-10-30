
//public class OPP_copy {
//
//	String make = "lambo";
//	String model = "car";
//	int year = 2011; 
//	String color = "black";
//	double price = 50000.0;
//	
//	void drive() {
//		System.out.println("You drive the car.");
//	}
//	void brake() {  
//		System.out.println("Ban da phanh xe.");
//		
//	}
//}
public class OPP_copy{
	// Thong tin nguoi dan ong
	String name;
	int age;
	double weight;
	
	OPP_copy(String name,int age,double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		 
	}
	
	void eat() {
		System.out.println(this.name+" is eating.");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking bear.");
	}
	
	void weight() {
		System.out.println(this.name + " nặng " + this.weight + " kg.");
	}
	
	
}
	
	
	