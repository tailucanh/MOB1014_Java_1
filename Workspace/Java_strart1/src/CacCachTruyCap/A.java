package CacCachTruyCap;
import CacCachTruyCap2.*;
public class A {

	public static void main(String[] args) {
		// access modifiers: (public, protected, private) 
		//các sửa đổi truy cập: (công khai, được bảo vệ, riêng tư)

		//B b = new B();
		//System.out.println(b.priMess); //Khong thể truy cập
		B car1 = new B("Lambo","Red",2021);
		B car2 = new B("Ford","black",2019);
	
		//Truy xuất thông tin tĩnh từ lớp B
		
		//System.out.println(car1.getMake());
		//System.out.println(car1.getModel());
		//System.out.println(car1.getYear());
		
		//Copy dữ liệu cho nhau car1 <-> car2
		//car2 = car1;             //copy cho nhau nhưng có cùng địa chỉ ô nhớ
		//car2.copy(car1);        // copy cho nhau nhưng khác địa chỉ ô nhớ
		//B car2 = new B(car1);    // copy trực tiếp
		
		
		System.out.println(car1);  //In ra địa chỉ ô nhớ
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		
		
		
		
		
		//Tuy xuất có thể thay đổi các biến tĩnh
		//car.setModel("blue");
		//car.setYear(2022);
		//System.out.println(car.getMake());
		//System.out.println(car.getModel());
		//System.out.println(car.getYear());

		
	}

}
