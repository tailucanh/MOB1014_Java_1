
import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t      *------MENU------*");
		System.out.println("\t+---------------------------+");
		System.out.println("\t| 1.Giải phương trinh bậc 1.|");
		System.out.println("\t| 2.Giải phương trinh bậc 2.|");
		System.out.println("\t| 3.Tính tiền điện.         |");
		System.out.println("\t| 4.Thoát.                  |");
		System.out.println("\t+---------------------------+");
		do {
			System.out.print("\tHãy chọn menu: ");
			int menu = scanner.nextInt();
			System.out.println("\t+---------------------------+");
	
			switch (menu) {
			case 1: 
				try {
					System.out.println("\t   Phương trình bậc nhất");
					System.out.print("\t- Nhập a: ");
					double a = scanner.nextDouble();
					System.out.print("\t- Nhập b: ");
					double b = scanner.nextDouble();
	
					if(a == 0) {
						if(b == 0) {
							System.out.println("\tPhương trình có vô số nghiệm.");
						}else {
							System.out.println("\tPhương trình vô nghiệm.");
						}
					}else {
						double x = -b/a;
						System.out.printf("\tPhương trình có nghiệm X = %.1f\n",x);
					}
	
				} catch (Exception e) {
					System.out.println("\tBạn đã nhập sai.Vui lòng kiểm tra lại!");
				}		
				System.out.println("\t-------------------------------------");
				
				break;
			case 2:
				try {
					System.out.println("\t   Phương trình bậc 2.");
					System.out.print("\t- Nhập a: ");
					double a = scanner.nextDouble();
					System.out.print("\t- Nhập b: ");
					double b = scanner.nextDouble();
					System.out.print("\t- Nhập c: ");
					double c = scanner.nextDouble();
	
					if(a == 0) {
						if(b == 0) {
							if(c == 0) {
								System.out.println("\tPhương trình có vô số nghiệm.");
							}else {
								System.out.println("\tPhương trình vô nghiệm.");
							}
						}else {
							double x = -c/b;
							System.out.printf("\tPhương trình có 1 nghiệm X = %.1f\n",x);
						}
					}else {
						double delta = Math.pow(b, 2) - 4*a*c;
						if(delta > 0) {
							double x1 = (-b + Math.sqrt(delta))/(2*a);
							double x2 = (-b - Math.sqrt(delta))/(2*a);
							System.out.printf("\tPhương trình có 2 nghiệm phân biệt: \n\t - X1 = %.1f \n\t - X2 = %.1f\n",x1,x2);
						}else if(delta == 0) {
							System.out.printf("\tPhương trình có nghiệm kép X = %.1f\n",(double)(-b/(2*a)));
						}else {
							System.out.println("\tPhương trình vô nghệm.");
						}
	
					}
				} catch (Exception e) {
					System.out.println("\tBạn đã nhập sai dữ liệu!");
				}
				System.out.println("\t-------------------------------------");
				break;
			case 3:
				try {
					System.out.println("\t   Tính tiền điện.");
					System.out.print("\tNhập số điện sử dụng(kwh): ");
					int soDien = scanner.nextInt();
					
					
					if(soDien < 50 && soDien > 0) {
						System.out.println("\t- Số tiền phải trả với "+soDien+" Kwh là: "+(soDien*1000)+" đồng.");
					}else if(soDien > 50) {
						System.out.println("\t- Số tiền phải trả với "+soDien+" Kwh là: "+((50*1000) + (soDien - 50)*1200)+" đồng.");
					}else {
						System.out.println("\t-->Số tiền điện phải là số dương.");
					}
					
				} catch (Exception e) {
					System.out.println("\t--> Bạn đã nhập sai dữ liệu.");
				}
				System.out.println("\t-------------------------------------");
				break;
			case 4:
				System.exit(menu); 
			default:
				System.out.println("  --> Bạn hãy chọn đúng menu.");
			}
		}while(true);	
	}

}
