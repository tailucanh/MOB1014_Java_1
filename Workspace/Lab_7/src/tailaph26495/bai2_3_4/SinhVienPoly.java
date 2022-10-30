package tailaph26495.bai2_3_4;

import java.util.Scanner;

public abstract  class SinhVienPoly {

	private String name;
	private String ology;
	
	public SinhVienPoly() {
		
	}

	public SinhVienPoly(String name, String ology) {
	
		this.name = name;
		this.ology = ology;
	}
	

	abstract public double getDiem();
	
	
	public String getHocLuc() {
		String hocLuc = null;
		
		if(getDiem() >= 9 && getDiem() <= 10) {
			hocLuc = "Xuất sắc";
		}else if(getDiem() >= 7.5) {
			hocLuc = "Giỏi";
		}else if(getDiem() >= 6.5 ) {
			hocLuc = "Khá";
		}else if(getDiem() >= 5){
			hocLuc = "Trung bình";
		}else if (getDiem() < 5 && getDiem() >= 0) {
			hocLuc = "Yếu";
		}else if(getDiem() < 0 || getDiem() > 10){
			System.out.println("\t  --> Không đúng thang điểm thang điểm! ");
		}
				
		return hocLuc;
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		
		do {
			try {
				System.out.print("     - Nhập họ tên:  ");
				this.name = scanner.nextLine();
				if (this.name.isEmpty() || this.name.equals(" ")) {
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
			
		} while (check);
		
	
	}
	
	public void output() {
		System.out.println("\t\t - Họ tên: "+name);
		System.out.println("\t\t - Ngành: "+ology);
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOlogy() {
		return ology;
	}

	public void setOlogy(String ology) {
		this.ology = ology;
	}
	
	
}
