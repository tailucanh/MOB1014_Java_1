package arraylist.java;

import java.util.Scanner;

public class Sinhvien {
	private String name;
	private String ho;
	private double diemTb;
	
	
	public Sinhvien() {		
		
	}
	public Sinhvien(String name, double diemTb) {		
		this.name = name;
		this.diemTb = diemTb;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Họ: ");
		this.ho = scanner.nextLine();
		System.out.print(" Tên: ");
		this.name = scanner.nextLine();
		System.out.print(" Điểm: ");
		this.diemTb = scanner.nextDouble();
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	
	
		
	
	
	
}
