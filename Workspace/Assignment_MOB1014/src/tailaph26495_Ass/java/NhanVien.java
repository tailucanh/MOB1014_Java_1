package tailaph26495_Ass.java;

import java.util.Scanner;


public abstract class NhanVien {
	
	private String id;
	private String surName;
	private String firstName;
	private double salary;   	
	private String service; 
	
	
	
	public NhanVien() {
		
	}

	
	
	public NhanVien(String id, String surName, String firstName, double salary, String service) {
	
		this.id = id;
		this.surName = surName;
		this.firstName = firstName;
		this.salary = salary;
		this.service = service;
	}
	
	abstract public double tongThuNhap();
	
	
	public double thueThuNhap() {
		double thue = 0;
		if (tongThuNhap() < 9 && tongThuNhap() >= 0) {
			System.out.println("\t\t    > Không phải đóng thuế.");
		}else if (tongThuNhap() < 15) {
			thue = tongThuNhap() * 0.1;
					
		}else if(tongThuNhap() >= 15){
			thue = tongThuNhap() * 0.12;
			
		}		
		return thue;
		
	}
	

	public void input(Scanner scanner) {
		boolean check = false;
		do {
			try {
				System.out.print("\t - Nhập mã nhân viên: ");
				this.id = scanner.nextLine();
				
				
				if (this.id.isEmpty() || this.id.equals(" ")) {
					System.out.println("\t  --> Hãy nhập mã!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);

		
		do {
			try {
				System.out.print("\t - Nhập họ: ");
				this.surName = scanner.nextLine();
				if (this.surName.isEmpty() || this.surName.equals(" ")) {
					System.out.println("\t  --> Hãy nhập họ!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);

		
		do {
			try {
				System.out.print("\t - Nhập tên: ");
				this.firstName = scanner.nextLine();
				if (this.firstName.isEmpty() || this.firstName.equals(" ")) {
					System.out.println("\t  --> Hãy nhập tên!");
					check = true;
				}else {
					check = false;
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		
		
		do {
			try {
				System.out.print("\t - Nhập lương tháng: ");
				String assignSalary = String.valueOf(this.salary);
				assignSalary = scanner.nextLine();
				
				String checkSalary = "\\d{1,50}";
				
				if (assignSalary.isEmpty() || assignSalary.equals(" ")) {
					System.out.println("\t  --> Hãy nhập lương!");
					check = true;
				}else if (!assignSalary.matches(checkSalary)) {
					System.out.println("\t  --> Hãy nhập đúng số lương!");
					check = true;
				}else if (Double.valueOf(assignSalary) < 0 ) {
					System.out.println("\t  --> Lương phải lớn hơn 0! Hãy nhập lại!");
					check = true;
				}else{
					check = false;
					this.salary = Double.valueOf(assignSalary);
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		
	}
	
	
	public void output() {
		System.out.println("\t\t    > Mã: "+id);
		System.out.println("\t\t    > Họ và tên: "+surName+" "+firstName);
		System.out.println("\t\t    > Chức vụ: "+service);
		System.out.printf("\t\t    > Lương tháng: %.1f đồng \n",salary);
	}
	
	
	
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}




	
}



