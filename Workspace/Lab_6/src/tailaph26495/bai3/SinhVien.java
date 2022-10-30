package tailaph26495.bai3;

import java.util.Scanner;


public class SinhVien {
	
	private String fullName;
	private String email;
	private String cmnd;
	private String phoneNumber;
	
	public SinhVien() {
		
	}
		
	public SinhVien(String fullName, String email, String cmnd, String phoneNumber) {
	
		this.fullName = fullName;
		this.email = email;
		this.cmnd = cmnd;
		this.phoneNumber = phoneNumber;
	}


	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		do {		
			try {		
				System.out.print("  - Nhập tên: ");
				fullName = scanner.nextLine();
				if (fullName.equals(" ") || fullName.isEmpty()) {
					check = true;
	
				}else {
					check = false;
				}
						
			} catch (Exception e) {
				check = true;
			}		
		} while (check);
			
		try {	
			System.out.print("  - Nhập email: ");
			email = scanner.nextLine();
			String checkEmail = "\\w+@\\w+(\\.\\w){1,2}";	
			if(!email.matches(checkEmail)) {
				System.out.println(" --> Không đúng định dạng email.");
			}
			
			
			System.out.print("  - Nhập số CMND: ");
			cmnd = scanner.nextLine();
			String checkCMND = "[0-9]{9}";
			if(!cmnd.matches(checkCMND)) {
				System.out.println(" --> Không đúng định dạng CMND.");
			}
			
						
			System.out.print("  - Nhập số điện thoại: ");
			phoneNumber = scanner.nextLine();
			String checkNumberphone = "0\\d{9,10}";
			if(!phoneNumber.matches(checkNumberphone)) {
				System.out.println(" --> Không đúng định dạng SĐT.");
			}
			
			
			
		} catch (Exception e) {
			System.out.println("  --> Sai dữ liệu!");
		}
		
	}
	
	public void output() {
		System.out.println("\t      - Họ và tên: "+fullName);	
		System.out.println("\t      - Email: "+email);			
		System.out.println("\t      - Số CMND: "+cmnd);		
		System.out.println("\t      - Sđt: "+phoneNumber);
		System.out.println("\t     ---------------------");
	}
	
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
}
