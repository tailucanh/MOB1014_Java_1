package demo;

import java.util.Scanner;

public class Hoa {

	
	private int id;
	private String typeOfFlower;
	private String color;
	

	
	public Hoa() {
		
	}
	
	
	public Hoa(int id, String typeOfFlower, String color) {
	
		this.id = id;
		this.typeOfFlower = typeOfFlower;
		this.color = color;
	}
	
	
	public void input(Scanner scanner) {
		try {
			boolean check = false;
			do {
				try {
					System.out.print("\t - Nhập Id: ");
					String assignId = String.valueOf(this.id);
					assignId = scanner.nextLine();
					
					String checkId = "\\d{1,50}";
					
					if (assignId.isEmpty() || assignId.equals(" ")) {
						System.out.println("\t  --> Hãy nhập id!");
						check = true;
					}else if (!assignId.matches(checkId)) {
						System.out.println("\t  --> Hãy nhập Id bằng số!");
						check = true;
					}else if (Double.valueOf(assignId) < 0 ) {
						System.out.println("\t  --> ID là số dương! Hãy nhập lại!");
						check = true;
					}else{
						check = false;
						this.id = Integer.valueOf(assignId);
					}
				} catch (Exception e) {
					check = true;
				}
			} while (check);;
			
			do {
				try {
					System.out.print("\t - Nhập loại hoa:");
					this.typeOfFlower = scanner.nextLine();
					if (this.typeOfFlower.isEmpty() || this.typeOfFlower.equals(" ")) {
						System.out.println("\t -> Hãy nhập loại!");
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
					System.out.print("\t - Nhập màu sắc:");
					this.color = scanner.nextLine();
					if (this.color.isEmpty() || this.color.equals(" ")) {
						System.out.println("\t -> Hãy nhập màu!");
						check = true;
					}else {
						check = false;
					}
				} catch (Exception e) {
					check = true;
				}
				
			} while (check);
			
			
		} catch (Exception e) {
			System.out.println(" \t -->  Lỗi dữ liệu!");
		}

	}
	
	
	
	
	public void output() {
		
		System.out.println("\t    - Mã: "+this.id);
		System.out.println("\t    - Loại hoa: "+this.typeOfFlower);
		System.out.println("\t    - Màu sắc: "+this.color);
		
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeOfFlower() {
		return typeOfFlower;
	}
	public void setTypeOfFlower(String typeOfFlower) {
		this.typeOfFlower = typeOfFlower;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
}
