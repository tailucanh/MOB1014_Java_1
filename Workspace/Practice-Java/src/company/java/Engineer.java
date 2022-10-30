package company.java;

import java.util.Scanner;

public class Engineer extends OfficeStaff{

	private String trainingIndustry;

	
	
	public Engineer() {
		
	}

	public Engineer(String trainingIndustry,String name, String surName, String sex, String address, String classify) {
		super(surName,name,sex,address,classify);
		this.trainingIndustry = trainingIndustry;
	}
	
	public void input(Scanner scanner) {
		super.input(scanner);
		super.setClassify("Kĩ sư");
		System.out.print("\t - Nhập ngành đào tạo: ");
		this.trainingIndustry = scanner.nextLine();
		
	}
	public void output() {
		super.output();
		System.out.print("   - Ngành: "+trainingIndustry);
	}

	
	
	public String getTrainingIndustry() {
		return trainingIndustry;
	}

	public void setTrainingIndustry(String trainingIndustry) {
		this.trainingIndustry = trainingIndustry;
	}
	
	
}
