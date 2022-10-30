package classses_oop_ThongTinSv.java;

public class Main {

	public static void main(String[] args) {
		// String id, String name, String email, String phoneNumber, String address
		SinhVien sv1 = new SinhVien("PH26495", "Lục Anh Tài", "tailaph26495@gmail.com",
									"0931360954", "Thanh Hoá");
		sv1.diHoc();
		System.out.println(sv1);
		
		//String id, String monHoc, String giaoVien, int tinChi, int soTiet, int soBaiKt
		MonHoc monHoc = new MonHoc("MOB1014", "Java 1","Lộc Phuho",4,19,3);
		
		System.out.println(monHoc);
		System.out.println("\t - Học phí: "+monHoc.hocPhi()+" đồng");
		System.out.println("\t - Điểm thành phần: ");
		monHoc.tbMon(5, 9, 4);
		
	}

}
