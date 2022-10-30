
public class Ham_qua_taiCOPY {

	String banhMi;
	String sot;
	String kem;
	String topping;
		
	//Tạo các hàm quá tải cùng tên nhưng khác tham số
	Ham_qua_taiCOPY() {
		
	}
	
	
	Ham_qua_taiCOPY(String banhMi,String sot){
		this.banhMi = banhMi;
		this.sot = sot;
	}
	Ham_qua_taiCOPY(String banhMi,	String sot, String kem){
		this.banhMi = banhMi;
		this.kem = kem;
		this.sot = sot;
		
	}
	Ham_qua_taiCOPY(String banhMi,	String sot, String kem,String topping){
		this.banhMi = banhMi;
		this.kem = kem;
		this.sot = sot;
		this.topping = topping;
	}
	
	
}
