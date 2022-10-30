package tailaph26495_Ass.java;

import java.util.Scanner;

public class NhanVienHanhChinh extends NhanVien{
	

	
	public NhanVienHanhChinh() {
	
	}
	
	public NhanVienHanhChinh(String id, String surName, String firstName, double salary, String service) {
		super(id, surName, firstName, salary, service);
		
	}
	
	@Override
	public double tongThuNhap() {
		return getSalary();
	}
	
	public void input(Scanner scanner) {
		super.input(scanner);  
		super.setService("Nhân viên hành chính");
		
	}
	
	
	public void output() {
		super.output();	
		System.out.printf("\t\t    > Tổng lương: %.1f đồng \n",tongThuNhap());
		System.out.printf("\t\t    > Thuế: %.1f đồng \n",thueThuNhap());
	}


}
