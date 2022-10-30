
public class Ham_qua_tai {

	public static void main(String[] args) {
		//Gọi theo hàm quá tải 
		Ham_qua_taiCOPY pizza = new Ham_qua_taiCOPY("Bánh mì", "cà chua", "bơ");
		
		System.out.println("Các thành phần của pizza: ");
		System.out.println(pizza.banhMi);
		System.out.println(pizza.kem);
		System.out.println(pizza.sot);
		//System.out.println(pizza.topping);
		
	}

}
