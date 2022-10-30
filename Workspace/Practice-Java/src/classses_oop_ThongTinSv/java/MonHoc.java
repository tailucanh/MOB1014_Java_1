package classses_oop_ThongTinSv.java;

public class MonHoc {
	private String id;
	private String monHoc;
	private String giaoVien;
	private int tinChi;
	private int soTiet;
	private int soBaiKt;
	
	public MonHoc() {
		
	}

	public MonHoc(String id, String monHoc, String giaoVien, int tinChi, int soTiet, int soBaiKt) {
		
		this.id = id;
		this.monHoc = monHoc;
		this.giaoVien = giaoVien;
		this.tinChi = tinChi;
		this.soTiet = soTiet;
		this.soBaiKt = soBaiKt;
	}
	
	public int hocPhi() {
		return tinChi*560000;
	}
	
	
	public void tbMon(float bai1, float bai2, float bai3,float bai4) {	
		double tbMon = bai1*0.1 + bai1*0.2 + bai3*0.3 + bai4*0.4;
		System.out.println("\t     Môn 1: "+bai1+" điểm"
							+"\n\t     Môn 2: "+bai2+" điểm"
							+"\n\t     Môn 3: "+bai3+" điểm"
							+"\n\t     Môn 4: "+bai4+" điểm");
		System.out.printf("\t- Điểm trung bình : %.1f điểm.\n",tbMon);
		if(tbMon >= 4) {
			System.out.println(" ---> Trạng thái: PASSED");
		}else {
			System.out.println(" ---> Trạng thái: FAILED");
		}
	}
	public void tbMon( float bai1, float bai2, float bai3) {	
		double tbMon = bai1*0.2 + bai2*0.3 + bai3*0.5;
		System.out.println("\t     Môn 1: "+bai1+" điểm"
							+"\n\t     Môn 2: "+bai2+" điểm"
							+"\n\t     Môn 3: "+bai3+" điểm");
		System.out.printf("\t- Điểm trung bình : %.1f điểm.\n",tbMon);
		if(tbMon >= 4) {
			System.out.println(" ---> Trạng thái: PASSED");
		}else {
			System.out.println(" ---> Trạng thái: FAILED");
		}
	}
	public void tbMon(float bai1, float bai2) {	
		double tbMon = bai1*0.3 + bai2*0.7;
		System.out.println("\t     Môn 1: "+bai1+" điểm"
							+"\n\t      Môn 2: "+bai2+" điểm");
		System.out.printf("\t- Điểm trung bình : %.1f điểm.\n",tbMon);
		if(tbMon >= 4) {
			System.out.println(" ---> Trạng thái: PASSED");
		}else {
			System.out.println(" ---> Trạng thái: FAILED");
		}
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public String getGiaoVien() {
		return giaoVien;
	}

	public void setGiaoVien(String giaoVien) {
		this.giaoVien = giaoVien;
	}

	public int getTinChi() {
		return tinChi;
	}

	public void setTinChi(int tinChi) {
		this.tinChi = tinChi;
	}

	public int getSoTiet() {
		return soTiet;
	}

	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}

	public int getSoBaiKt() {
		return soBaiKt;
	}

	public void setSoBaiKt(int soBaiKt) {
		this.soBaiKt = soBaiKt;
	}

	@Override
	public String toString() {
		return "     *---Thông tin môn học---*"
				+ "\n\t - Id: " + id 
				+ "\n\t - Môn: " + monHoc 
				+ "\n\t - Giáo viên: " + giaoVien 
				+ "\n\t - Tín chỉ: " + tinChi 
				+ "\n\t - Số tiết: "+ soTiet 
				+ "\n\t - Số bài kiểm tra: " + soBaiKt;
	}
	
	
	
	
	
	
	
	
	
	
}
