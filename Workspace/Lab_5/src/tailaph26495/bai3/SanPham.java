package tailaph26495.bai3;

import java.util.Scanner;

public class SanPham {

	private String name;
	private double price;
	
	
	public SanPham() {
		
	}


	public SanPham(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("     - Tên sản phẩm: ");
		this.name = scanner.nextLine();
		System.out.print("     - Giá: ");
		this.price = scanner.nextDouble();	
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
	
	
	
	
	
	
	
	
}
