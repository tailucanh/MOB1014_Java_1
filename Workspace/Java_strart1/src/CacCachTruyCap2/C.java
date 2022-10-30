package CacCachTruyCap2;
import CacCachTruyCap.*;

public class C {
	
	public String puMess = "Tôi đang sử dụng";  //Biến công khai cho tất cả các gói của dự án		

	//Truy cập các lớp trong 1 gói miễn đó là lớp con của bất kì lớp nào chưa protected
	protected String proMess = "Tôi được bảo vệ.";
			  String mess = "Chúng tôi đang k sử dụng.";
	//Chỉ lớp khai báo mới có thể sd
	private String privMess = "Đây là riêng tư";

	public static void main(String[] args) {  //Gọi private
		C c = new C();
		System.out.println(c.privMess);
	}
}
