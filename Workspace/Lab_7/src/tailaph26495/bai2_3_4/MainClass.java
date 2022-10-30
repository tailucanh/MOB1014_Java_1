package tailaph26495.bai2_3_4;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		menu();

	}
	
	
	public static void menu() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\t    * --- Quản lí sinh viên ----*");
			System.out.println("\t        1. Nhập danh sách sinh viên.");
			System.out.println("\t        2. Xuất thông tin danh sách sinh viên.");
			System.out.println("\t        3. Xuất danh sách sinh viên có học lực giỏi.");
			System.out.println("\t        4. Sắp xếp danh sách sinh viên theo điểm.");
			System.out.println("\t        5. Kết thúc.");
			System.out.println("      ----------------------");
			
			DanhSanhSv ds = new DanhSanhSv();
			
			do {
				System.out.print("    - Chọn menu: ");
				String menu = scanner.nextLine();
						
				switch (menu) {
				case "1": 
					ds.input();
				
					System.out.println("\n  --------------------------");
					break;
				case "2":
					System.out.println("\t    +-- Danh sách sinh viên --+");
					ds.output();
					
					System.out.println("\n  --------------------------");
					break;
				case "3":
					ds.dsSvHocLucGioi();
					
					System.out.println("\n  --------------------------");
					break;
				case "4":
					ds.xapXepTheoDiem();
				
					System.out.println("   --> Đã hoàn thành menu! Nhập tiếp menu mới hoặc thoát bằng số \"5\"");
					System.out.println("\n  --------------------------");
					break;
				case "5":			
					return;
				default:
					System.out.println(" --> Hãy chọn đúng chức năng!");
				}
				
				
			} while (true);
			
			
		} catch (Exception e) {

			System.out.println("    --> Sai dữ liệu!");
		}
	
		
		
		
		
		
	}

}













