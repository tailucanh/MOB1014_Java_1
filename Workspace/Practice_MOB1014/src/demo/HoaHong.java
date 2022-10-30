package demo;

import java.util.Scanner;

public class HoaHong extends Hoa{
	
	private String name;
	private double length;
	

	public HoaHong() {
		
		
	}


	public HoaHong(int id, String typeOfFlower, String color,String name, double length) {
		super(id, typeOfFlower, color);
		this.name = name;
		this.length = length;
	}

	
	public void input(Scanner scanner) {
		try {
			super.input(scanner);
			boolean check = false;
						do {
				try {
					System.out.print("\t - Nhập tên:");
					this.name = scanner.nextLine();
					if (this.name.isEmpty() || this.name.equals(" ")) {
						System.out.println("\t -> Hãy nhập tên!");
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
					System.out.print("\t - Nhập chiều dài: ");
					String assignLength = String.valueOf(this.length);
					assignLength = scanner.nextLine();
					
					String checkLength = "\\d{1,50}";
					
					if (assignLength.isEmpty() || assignLength.equals(" ")) {
						System.out.println("\t  --> Hãy nhập chiều dài!");
						check = true;
					}else if (!assignLength.matches(checkLength)) {
						System.out.println("\t  --> Hãy nhập chiều dài bằng số!");
						check = true;
					}else if (Double.valueOf(assignLength) < 0 ) {
						System.out.println("\t  --> Chiều dài > 0! Hãy nhập lại!");
						check = true;
					}else{
						check = false;
						this.length = Double.valueOf(assignLength);
					}
				} catch (Exception e) {
					check = true;
				}
			} while (check);;
			

			
			
		} catch (Exception e) {
			System.out.println(" \t -->  Lỗi dữ liệu!");
		}
		
		
	}
	
	public void output() {
		super.output();
		System.out.println("\t    - Tên: "+this.name);
		System.out.println("\t    - Chiều dài: "+this.length);
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	

}
