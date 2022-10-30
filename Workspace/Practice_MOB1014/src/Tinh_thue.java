

import java.util.Scanner;

public class Tinh_thue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		try {
			System.out.print("Nhập số lương: ");
			double x = scanner.nextDouble();
			System.out.print("Nhập số tiền thưởng: ");
			double y = scanner.nextDouble();

			double tong = x + y;
			System.out.println("Tổng tiền : "+tong+" triệu");

			if(x < 9) {
				System.out.println("Bạn không phải đóng thuế.");
			}else if(x < 15) {
				System.out.printf("Thuế phải đóng: %.1f triệu đồng", x*0.1);		
			}else if(x < 30) {
				System.out.printf("Thuế phải đóng: %.1f triệu đồng", x*0.15);
			}else if(x > 30) {
				System.out.printf("Thuế phải đóng: %.1f triệu đồng", x*0.2);
			}	
		
		}catch (Exception e) {
			System.out.println("Nhập đúng số lương.");
		}
		
		
	}
}
