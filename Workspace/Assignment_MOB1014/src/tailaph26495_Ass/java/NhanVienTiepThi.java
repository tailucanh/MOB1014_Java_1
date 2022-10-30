package tailaph26495_Ass.java;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien{

	private double doanhSo;
	private double hoaHong;
	

	public NhanVienTiepThi() {
		
	}
	

	public NhanVienTiepThi(String id, String surName, String firstName, double salary, String service,double doanhSo, double hoaHong) {
		super(id, surName, firstName, salary, service);
		this.doanhSo = doanhSo;
		this.hoaHong = hoaHong;
	}

		@Override
	public double tongThuNhap() {
		return (getSalary() + getHoaHong());
	}

		
	public void input(Scanner scanner) {
		super.input(scanner); 
		super.setService("Nhân viên tiếp thị");
		boolean check = false;
		do {
			try {
				System.out.print("\t - Nhập doanh số: ");
				String assignDoanhSo = String.valueOf(this.doanhSo);
				assignDoanhSo = scanner.nextLine();
				
				String checkDoanhSo = "\\d{1,50}";
				
				if (assignDoanhSo.isEmpty() || assignDoanhSo.equals(" ")) {
					System.out.println("\t  --> Hãy nhập doanh số!");
					check = true;
				}else if(!assignDoanhSo.matches(checkDoanhSo)){
					System.out.println("\t  --> Hãy nhập đúng doanh số!");
					check = true;
				}else if (Double.valueOf(assignDoanhSo) < 0 ) {
					System.out.println("\t  --> Doanh số phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.doanhSo = Double.valueOf(assignDoanhSo);
				}
				
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		

		do {
			try {
				System.out.print("\t - Nhập hoa hồng: ");
				String assignHoaHong = String.valueOf(this.hoaHong);
				assignHoaHong = scanner.nextLine();
				
				String checkHoaHong = "\\d{1,50}";
				
				if (assignHoaHong.isEmpty() || assignHoaHong.equals(" ")) {
					System.out.println("\t  --> Hãy nhập hoa hồng!");
					check = true;
				}else if(!assignHoaHong.matches(checkHoaHong)) {
					System.out.println("\t  --> Hãy nhập hoa hồng!");
					check = true;
				}else if (Double.valueOf(assignHoaHong) < 0 ) {
					System.out.println("\t  --> Hoa hồng phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.hoaHong = Double.valueOf(assignHoaHong);
				}
				
			} catch (Exception e) {
				check = true;
			}
		} while (check);
			
	}
	
	
	
	public void output() {
		super.output();
		System.out.printf("\t\t    > Doanh số: %.1f đồng\n",doanhSo);
		System.out.printf("\t\t    > Hoa hồng: %.1f đồng\n",hoaHong);
		System.out.printf("\t\t    > Tổng lương: %.1f đồng \n",tongThuNhap());
		System.out.printf("\t\t    > Thuế: %.1f đồng \n",thueThuNhap());

	}
	
	
	
	public double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}

	public double getHoaHong() {
		return hoaHong;
	}
	public void setHoaHong(double hoaHong) {
		this.hoaHong = hoaHong;
	}





	
}

