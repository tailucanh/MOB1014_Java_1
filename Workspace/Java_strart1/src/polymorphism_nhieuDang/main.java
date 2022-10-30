package polymorphism_nhieuDang;

public class main {

	public static void main(String[] args) {
		// polymorphism - đa dạng theo tiếng hi lạp
		//Khả năng 1 đối tượng xác định nhiều hơn 1 loại
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat_thuyen boat = new Boat_thuyen();
		
		//Car[] van_Dong_Vien = {car,bicycle,boat};  //Chỉ lưu trữ car, tương tự khi thay đổi Car[]
		
		Vehicle_PhuongTien[] van_Dong_Vien = {car,bicycle,boat};  //Lưu trữ tất cả vì car, bicycle, boat là lớp kế thừa của Vehicle
		
		//gọi từng phương tiện
		//car.go();
		//bicycle.go();
		//boat.go();
		
		//Gọi theo vòng lặp for nâng cao
		
		for(Vehicle_PhuongTien i : van_Dong_Vien) {
			i.go();
		}
		
		
		
		
		
	}

}
