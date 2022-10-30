package tailaph26495.bai2_3_4;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoly{

	private double mktPoint;
	private double salePoint;
	
	public SinhVienBiz() {
		
	}


	public SinhVienBiz(String name, String ology,double mktPoint, double salePoint) {
		super(name, ology);
		this.mktPoint = mktPoint;
		this.salePoint = salePoint;
	}
	
	
	
	@Override
	public double getDiem() {	
		return ((2*mktPoint + salePoint)/3);
	}
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		super.setOlogy("Biz");
		boolean check = false;
		do {
			try {			
			System.out.print("     - Nhập điểm MKT: ");
			this.mktPoint = scanner.nextDouble();
			
			
			if (this.mktPoint > 10 || this.mktPoint < 0 ) {
				check = true;
			}else if (String.valueOf(this.mktPoint).isEmpty()) {
				check = true;
			}else{
				check = false;
			}
				
			} catch (Exception e) {
				check = true;
			}

		} while (check);
		
		do {
			try {			
				System.out.print("     - Nhập điểm Sales: ");
				this.salePoint = scanner.nextDouble();
				if (this.salePoint > 10 || this.salePoint < 0) {
					check = true;
				}else {
					check = false;
				}
					
				} catch (Exception e) {
					check = true;
				}
		} while (check);
		
	
	
	}
	
	public void output() {
		super.output();
		System.out.printf("\t\t >> Điểm trung bình: %.1f\n",getDiem());
		System.out.println("\t\t >>> Xếp loại: "+getHocLuc());
		
	}
	

	public double getMktPoint() {
		return mktPoint;
	}

	public void setMktPoint(double mktPoint) {
		this.mktPoint = mktPoint;
	}

	public double getSalePoint() {
		return salePoint;
	}

	public void setSalePoint(double salePoint) {
		this.salePoint = salePoint;
	}


	
	

}
