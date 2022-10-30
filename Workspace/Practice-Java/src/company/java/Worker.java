package company.java;

import java.util.Scanner;

public class Worker extends OfficeStaff{

	
	private int rank;
	
	
	
	public Worker() {
		
	}


	public Worker(int rank, String name,String surName, String sex, String address, String classify) {
		super(surName,name,sex,address,classify);
		this.rank = rank;
	}
	
	public void input(Scanner scanner) {
		super.input(scanner);
		super.setClassify("Công nhân");
		System.out.print("\t - Nhập thứ hạng: ");
		this.rank = scanner.nextInt();
		
	}
	public void output() {
		super.output();
		System.out.print("   - Thứ hạng: "+rank);
	}
	

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
}
