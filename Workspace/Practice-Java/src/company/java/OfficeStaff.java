package company.java;

import java.util.Scanner;

public class OfficeStaff {

	private String surName;
	private String name;
	private String sex;
	private String address;
	private String classify;
	
	
	
	public OfficeStaff() {
		
	}
	
	
	public OfficeStaff(String surName, String name, String sex, String address, String classify) {
		this.surName = surName;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.classify = classify;
	}



	public void input(Scanner scaner) {
		System.out.print("\t - Nhập họ: ");
		this.surName = scaner.nextLine();
		System.out.print("\t - Nhập tên: ");
		this.name = scaner.nextLine();
		System.out.print("\t - Nhập giới tính: ");
		this.sex = scaner.nextLine();
		System.out.print("\t - Nhập địa chỉ: ");
		this.address = scaner.nextLine();
		
		
	}
	
	public void output() {
		System.out.print("\t Bộ phận: "+classify+"  - Tên: "+surName+" "+name+"  -  Giới tính: "+sex+"  -  Địa chỉ: "+address);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getClassify() {
		return classify;
	}
	public void setClassify(String classify) {
		this.classify = classify;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	
	
	
	
	
}
