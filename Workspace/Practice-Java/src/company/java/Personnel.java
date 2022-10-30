package company.java;

import java.util.Scanner;

public class Personnel extends OfficeStaff{

	private String work;
	
	

	public Personnel() {
		
	}

	public Personnel(String work,String name,String surName, String sex, String address, String classify) {
		super(surName,name,sex,address,classify);
		this.work = work;
	}
	
	public void input(Scanner scanner) {
		super.input(scanner);
		super.setClassify("Nhân viên");
		System.out.print("\t - Nhập công việc : ");
		this.work = scanner.nextLine();
		
	}
	public void output() {
		super.output();
		System.out.print("   - Công việc: "+work);
	}
	
	

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	
}
