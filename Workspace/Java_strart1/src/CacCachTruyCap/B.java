package CacCachTruyCap;
import CacCachTruyCap2.*;

public class B {
	/*
	private String priMess = "Đây là riêng tư";
	
	public static void main(String[] args) {  // Chỉ cho phép truy cập trực tiếp
		B b = new B();
		System.out.println(b.priMess);
	}
	*/
	private String make;
	private String model;
	private int year;
	
	//Gọi tham chiếu giá trị - không thể thay đổi khi đã khai báo
	/*B(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}*/
	//Gọi tham chiếu giá trị - có thể thay đổi sau khi khai báo
	B(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	//Tạo thêm hàm quá tải để copy trực tiếp
	B( B x){
		this.copy(x);
	}
	
	
	
	//Hàm suy xuất biến tĩnh sang lớp khác
	public String getMake() {
		return make;		
	}
	public String getModel() {
		return model;		
	}
	public int getYear() {
		return year;	
	}
	//Hàm có thế thay đổi các biến tĩnh
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear (int year) {
		this.year = year;
	}
	
	
	//Hàm copy cho nhau
	public void copy(B x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}
	

}





