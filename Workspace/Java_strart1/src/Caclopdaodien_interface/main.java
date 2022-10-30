package Caclopdaodien_interface;

public class main {

	public static void main(String[] args) {
		// interface - lớp dao diện, là 1 mẫu áp dụng cho 1 lớp tương tự kế thừa
		// chỉ định những gì các lớp có hoặcc phải làm
		// cac lớp có thể áp dụng nhiều hơn 1 dao diện,
		//trong khi kế thừa giới hạn bởi lớp cha trực tiếp
		
			
		Rabbit_Tho rabbit = new Rabbit_Tho();
		rabbit.chayTron(); 
		
		Hawk_Chim hawk = new Hawk_Chim();
		hawk.sanBat();
		// Thỏ và chim k thể thêm ngược lại giao diện cho nhau
		
		Fish_ca fish = new Fish_ca();
		fish.sanBat();
		fish.chayTron();

	}

}
