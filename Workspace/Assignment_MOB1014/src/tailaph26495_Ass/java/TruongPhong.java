package tailaph26495_Ass.java;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
	private double luongTrachNhiem;
	
	public TruongPhong() {
		
	}

	
	public TruongPhong(String id, String surName, String firstName, double salary, String service,double luongTrachNhiem) {
		super(id, surName, firstName, salary, service);
		this.luongTrachNhiem = luongTrachNhiem;
	}


	@Override
	public double tongThuNhap() {
		return (getSalary() + getLuongTrachNhiem());
	}
	
	

	public void input(Scanner scanner) {
		super.input(scanner);
		super.setService("Trưởng phòng");
		boolean check = false;
		
		do {
			try {
				System.out.print("\t - Nhập lương trách nhiệm: ");
				String assignLuongTrachNhiem = String.valueOf(this.luongTrachNhiem);
				assignLuongTrachNhiem = scanner.nextLine();
				
				String checkLuongTrachNhiem = "\\d{1,50}";
				
				if (assignLuongTrachNhiem.isEmpty() || assignLuongTrachNhiem.equals(" ")) {
					System.out.println("\t  --> Hãy nhập lương trách nhiệm!");
					check = true;
				}else if(!assignLuongTrachNhiem.matches(checkLuongTrachNhiem)) {
					System.out.println("\t  --> Hãy nhập đúng lương trách nhiệm!");
					check = true;
				}else if (Double.valueOf(assignLuongTrachNhiem) < 0 ) {
					System.out.println("\t  --> Luong trách nhiệm phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.luongTrachNhiem = Double.valueOf(assignLuongTrachNhiem);
				}
				
			} catch (Exception e) {
				check = true;
			}
		} while (check);
			
		
	}
	
	public void output() {
		super.output();
		System.out.printf("\t\t    > Lương trách nhiệm: %.1f đồng\n",luongTrachNhiem);
		System.out.printf("\t\t    > Tổng lương: %.1f đồng \n",tongThuNhap());
		System.out.printf("\t\t    > Thuế: %.1f đồng \n",thueThuNhap());
	}
	
	
	
	
	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}
	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}

}
