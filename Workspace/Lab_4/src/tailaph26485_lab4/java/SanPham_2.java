package tailaph26485_lab4.java;

import java.util.Scanner;

public class SanPham_2 {
	String tenSP;
	double donGia;
	double giamGia;
	
	public SanPham_2(String tenSp,double donGia,double giamGia ) {
		this.tenSP = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public SanPham_2(String tenSp,double donGia) {
		this.tenSP = tenSp;
		this.donGia = donGia;
	}
	
	private double getThueNhapKhau() {
		return donGia*0.1;
	}
	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Nhập tên sản phẩm: ");
		tenSP = scanner.nextLine();
		System.out.print(" Nhập đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.print(" Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
		
	}
	
	public void output() {
		System.out.println("\tThông tin sản phẩm");
		System.out.printf("- Tên sản phẩm: %s \n- Đơn giá: %.0f đồng.\n- Giảm: %.0f đồng.\n- Thuế: %.1f đồng.\n",
				tenSP,donGia,giamGia,getThueNhapKhau());
	}
}
