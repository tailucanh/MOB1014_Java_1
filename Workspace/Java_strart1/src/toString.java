
public class toString {

	public static void main(String[] args) {
		// toString() là phương thức đặ biệt mà tất cả các đối tượng kế thừa trả về 1 chuỗi 
		// đại diện bằng văn bản cho một đối tượng. Sd cả ngầm định và tường minh
		
		toString_COPY car = new toString_COPY();
		/*
		 * --Cách gọi thông thường của hướng đối tượng
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println(myCar1.year);
		*/
		
		
		//System.out.println(car.toString());  chỉ in ra địa chỉ bộ nhớ nếu không gọi chuỗi ghi đè
		/*System.out.println(car.toString());  //Đã gọi chuỗi ghi đè
		 * hoặc System.out.println(car);
		 */
	}

}
