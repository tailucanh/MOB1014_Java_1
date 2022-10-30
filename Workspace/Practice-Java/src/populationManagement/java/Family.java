package populationManagement.java;

import java.util.Scanner;

public class Family{

	private int familyMembers;
	private String houseNumber;
	
	
	public Family() {
		
	}
	public Family(int familyMembers, String houseNumber) {
		this.familyMembers = familyMembers;
		this.houseNumber = houseNumber;
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		do {
			try {
				System.out.print("  - Nhập số nhà: ");
				this.houseNumber = scanner.nextLine();
				
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		
		System.out.print("  - Nhập số thành viên: ");
		this.familyMembers = scanner.nextInt();
	}
	
	public void output() {
		System.out.println("        - Số nhà: "+getHouseNumber());
		System.out.println("        - Số thành viên: "+getFamilyMembers());	
	}
	
	

	public int getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(int familyMembers) {
		this.familyMembers = familyMembers;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
}








