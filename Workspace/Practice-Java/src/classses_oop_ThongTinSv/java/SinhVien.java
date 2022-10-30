package classses_oop_ThongTinSv.java;

public class SinhVien {
	private String id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;

	public SinhVien() {

	}

	public SinhVien(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public SinhVien(String id, String name, String email, String phoneNumber, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	/* Hàm tự tạo */

	public void diHoc() {
		System.out.println("-->Sinh viên đang đi học");
	}

//	public void lamBaiTap(String monHoc) {
//		System.out.println("--> Sinh viên đang học môn: " + monHoc);
//	}
//
//	public void hocPhi(String monHoc, double tienHoc) {
//		System.out.println("--> Sinh viên nộp học phí môn: " + monHoc + " với phí: " + tienHoc + " đồng.");
//	}
//
//	public boolean kiemTra(String monHoc) {
//		/* Kiểm tra sv có học đúng môn toán k */
//		if (monHoc != null && monHoc.toLowerCase().compareTo("math") == 0) {
//			return true;
//		}
//		return false;
//	}

	
	
	
	/* truy xuất getters và setters */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/* Hiển thị tất cả thông tin */
	@Override
	public String toString() {
		return "    *---Thông tin sinh viên---*"
				+ "\n\t - Id: " + id 
				+ "\n\t - Name: " + name
				+ "\n\t - Email: " + email
				+ "\n\t - PhoneNumber: " + phoneNumber
				+ "\n\t - Address: " + address ;
	}

}
