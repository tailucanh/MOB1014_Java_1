
 
public class OPP_Jav {

	public static void main(String[] args) {
	//Hướng đối tượng OPP - kiểu như hàm đặc tả đặc điểm của một vật chỉ tập trung vào vât đó
	// Khai báo 1 tệp java riêng biệt
		/*
		OPP_copy myCar1 = new OPP_copy();
		OPP_copy myCar2 = new OPP_copy(); 
		
		
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println(myCar1.year);
		System.out.println();
		System.out.println(myCar2.model);
		System.out.println(myCar2.make);
		System.out.println(myCar2.year);
		*/
		//myCar1.drive();
		//myCar1.brake();

		OPP_copy humen1 = new OPP_copy("Smile", 18, 65.6);
		OPP_copy humen2 = new OPP_copy("Tai", 19, 45.6);
		
		humen2.eat();
		humen1.drink();
		humen1.weight();
		
		//System.out.println(humen1.name);
	}
}


	




















