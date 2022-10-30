package tailaph26495.bai1;

public class ChuNhat {
	
	protected double dai;
	protected double rong;
	
	public ChuNhat() {
	
	}
	
	
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public double getChuVi() {
		
		return ((this.dai + this.rong)*2);
		
	}
	public double getDienTich() {
		
		return (this.dai * this.rong);
		
	}
	public void xuat() {
		System.out.println("\t  *-- Hình chữ nhật --*");
		System.out.println("  - Chiều dài: "+dai);
		System.out.println("  - Chiều rộng: "+rong);
		System.out.println("  - S = "+getChuVi());
		System.out.println("  - V = "+getDienTich());
	}
	
	
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	
	
	
	
}
