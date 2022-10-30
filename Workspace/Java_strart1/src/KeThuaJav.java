
public class KeThuaJav {

	public static void main(String[] args) {
		// inheritance - kế thừa: là quá trình mà 1 lớp có được phương thức của lớp khác
		// Ví dụ có 3 OPP: phương tiện, xe đạp, ô tô
		// OPP xe đạp, ô tô kế thừa thuộc tính của OPP phương tiện
		
		KethuaJav_2 car = new KethuaJav_2();
		car.go();
		KethuaJav_3 bicyle = new KethuaJav_3();
		bicyle.stop();
		
		System.out.println(car.tocDo);
		System.out.println(bicyle.tocDo);
		
		System.out.println(car.banhXe);
		
		
		// super keyword -  đề cập đến lớp cha (cha) của một đối tượng 
		// rất giống với từ khóa "this" trong hàm quá tải
		/*
		KethuaJav_2 hero1 = new KethuaJav_2("Smile", 30,"Đz");
		KethuaJav_2 hero2 = new KethuaJav_2("Batman", 35,"$$$$");
		//kết hợp super và toString để lấy phần tử
		System.out.println(hero2.toString());
		System.out.println(hero1.toString());
		*/
		
	}

}







