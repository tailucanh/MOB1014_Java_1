package tailaph26495.bai2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();

	}

	
	
	
	
	static void menu() {
		try {
			
			DanhSach ds = new DanhSach();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\t*--------------  Danh sách  -------------*");
			System.out.println("\t-   1. Nhập danh sách họ và tên.");
			System.out.println("\t-   2. Xuất danh sách vừa nhập");
			System.out.println("\t-   3. Xuất danh sách ngẫu nhiên");
			System.out.println("\t-   4. Sắp xếp giảm dần và xuất danh sách");
			System.out.println("\t-   5. Tìm và xóa họ tên nhập từ bàn phím");
			System.out.println("\t-   0. Kết thúc");
			System.out.println("\t*----------------------------------------*");
					
		
			do {

				System.out.print("     --> Chọn menu: ");
				String option = scanner.nextLine();
							
				switch (option) {
					case "1": 
						ds.input();
						System.out.println("\n - Hoàn thành chức năng 1.");
						break;
					case "2":
						System.out.println("\t +-- Danh sách đã nhập --+");
						ds.output();
						System.out.println("\n - Hoàn thành chức năng 2.");
						break;
					case "3":
						ds.sortListRandom();
						System.out.println("\n - Hoàn thành chức năng 3.");
						break;
					case "4":
						ds.sortListDecrease();
						System.out.println("\n - Hoàn thành chức năng 4.");
						break;
					case "5":
						ds.findAndRemove();
						System.out.println("\n - Hoàn thành chức năng 5.");
						break;
					case "0":
						return;
					default:
						System.out.println(" --> Hãy chọn đúng chức năng!");
					}
			
			}while(true);
		
		
		} catch (Exception e) {
			System.out.println("  --> Sai dữ liệu");
		}
	}
	
	
}
