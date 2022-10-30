package tailaph26495.bai1;


public class Vuong extends ChuNhat{

	public Vuong() {
		
	}
	
	
	public Vuong(double canh) {
		super(canh, canh);
	}


	public void xuat() {
		System.out.println("\t  *-- Hình vuông --*");
		System.out.println("  - Cạnh: "+rong);
		System.out.println("  - S = "+getChuVi());
		System.out.println("  - V = "+getDienTich());
	}
}
