package tailaph26495.bai1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			DanhSachSoThuc ds = new DanhSachSoThuc();
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("\t*---ArrayList Decimal---*");
			System.out.println("\t     1. Nhập dữ liệu.");
			System.out.println("\t     2. Xuất dữ liệu.");
			System.out.println("\t     3. Tính tổng. ");
			System.out.println("\t     0. Thoát.");
			System.out.println("\t*------------------------*");
			
			do {
				System.out.print("  --> Chọn chức năng: ");
				String option = scanner.nextLine();
				switch (option) {
					case "1": 
						ds.input();
						System.out.println("\n - Hoàn thành chức năng 1.");
						break;
					case "2":
						ds.output();
						System.out.println("\n - Hoàn thành chức năng 2.");
						break;
					case "3":
						ds.sum();
						System.out.println("\n - Hoàn thành chức năng 3.");
						break;
					case "0":
						return;
					default:
						System.out.println(" --> Hãy chọn đúng chức năng!");
					}
			}while(true);
			
		} catch (Exception e) {
			System.out.println(" --> Bạn đã sai dữ liệu!");
		}

	}

}
