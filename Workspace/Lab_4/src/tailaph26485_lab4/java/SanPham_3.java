package tailaph26485_lab4.java;

import java.util.Scanner;

public class SanPham_3 {
	private String tenSP;
	private double donGia;
	private double giamGia;
	
	
	public SanPham_3(String tenSp,double donGia,double giamGia ) {
		this.tenSP = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham_3(String tenSp,double donGia) {
		this.tenSP = tenSp;
		this.donGia = donGia;
	}
	
	private double getThueNhapKhau() {
		return donGia*0.1;
	}
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Nhập tên sản phẩm: ");
		this.tenSP = scanner.nextLine();
		System.out.print(" Nhập đơn giá: ");
		this.donGia = scanner.nextDouble();
		System.out.print(" Nhập giảm giá: ");
		this.giamGia = scanner.nextDouble();
		
	}
	
	public void output() {
		System.out.println("\tThông tin sản phẩm");
		System.out.printf("- Tên sản phẩm: %s \n- Đơn giá: %.0f đồng.\n- Giảm: %.0f đồng.\n- Thuế: %.1f đồng.\n",
				tenSP,donGia,giamGia,getThueNhapKhau());
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	

	
	

	
}
