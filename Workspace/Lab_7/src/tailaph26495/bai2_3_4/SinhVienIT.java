package tailaph26495.bai2_3_4;

import java.util.Scanner;

public class SinhVienIT extends SinhVienPoly{

	private double javaPoint;
	private double cssPoint;
	private double htmlPoint;
	

	public SinhVienIT() {
		
	}


	public SinhVienIT(String name, String ology,double javaPoint, double cssPoint, double htmlPoint) {
		super(name, ology);
		this.javaPoint = javaPoint;
		this.cssPoint = cssPoint;
		this.htmlPoint = htmlPoint;
	}

	
	@Override
	public double getDiem() {
		return ((2*javaPoint + htmlPoint + cssPoint)/4);
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		super.input();
		super.setOlogy("IT");
		System.out.print("     - Nhập điểm JAVA: ");
		this.javaPoint = scanner.nextDouble();
		System.out.print("     - Nhập điểm HTML: ");
		this.htmlPoint = scanner.nextDouble();
		System.out.print("     - Nhập điểm CSS: ");
		this.cssPoint = scanner.nextDouble();
	
	}
	
	public void output() {
		super.output();
		System.out.printf("\t\t >> Điểm trung bình: %.1f\n",getDiem());
		System.out.println("\t\t >>> Xếp loại: "+getHocLuc());
		
	}
	
	

	public double getJavaPoint() {
		return javaPoint;
	}

	public void setJavaPoint(double javaPoint) {
		this.javaPoint = javaPoint;
	}

	public double getCssPoint() {
		return cssPoint;
	}

	public void setCssPoint(double cssPoint) {
		this.cssPoint = cssPoint;
	}

	public double getHtmlPoint() {
		return htmlPoint;
	}

	public void setHtmlPoint(double htmlPoint) {
		this.htmlPoint = htmlPoint;
	}
	
	
	

}
