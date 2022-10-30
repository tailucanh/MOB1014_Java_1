package tailaph26495.bai2;

import java.util.Scanner;

public class SanPham {
	
	private String name;
	private double price;
	private String company;
	
	public SanPham() {
		
	}

	public SanPham(String name, double price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	public void input() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" - Nhập tên: ");
			this.name = scanner.nextLine();
			System.out.print(" - Nhập hãng: ");
			this.company = scanner.nextLine();
			System.out.print(" - Nhập giá: ");
			this.price = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(" --> Sai dữ liệu!");
		}
		
	}
	
	public void output() {
		System.out.println("\t  - Tên: "+name);
		System.out.println("\t  - Giá: "+price);
		System.out.println("\t  - Hãng: "+company);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
