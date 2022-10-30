package class_oop.java;

import java.util.Scanner;

public class SinhVien {
	
	String name;
	double point;
	
	
	
	public SinhVien() {
	
		
	}

	public SinhVien(String name, double point) {
		this.name = name;
		this.point = point;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Nhập tên: ");
		this.name = scanner.nextLine();
		System.out.print(" Nhập điểm: ");
		this.point = scanner.nextDouble();
		
		
	}
	
	public void output() {
		System.out.println(" Tên: "+this.name+" Xếp loại: "+xepLoai());
	}
	
	public String xepLoai() {
		if(this.point  < 5) {
			return "Yếu";
		}else if(this.point > 5 && this.point < 7) {
			return "Trung bình";
		}else {
			return "Giỏi";
		}
		
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	
	
	
	
	
	
}
