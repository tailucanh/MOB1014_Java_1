package tailaph26495.bai3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		menu();
	}
	
	
		public static void menu() {
			try {
				
				DanhSachSanPham ds = new DanhSachSanPham();
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("\t*------------------ Quản lí sản phẩm -------------------*");
				System.out.println("\t-   1. Nhập danh sách sản phẩm từ bàn phím.");
				System.out.println("\t-   2. Xuất danh sách sản phẩm từ bàn phím.");
				System.out.println("\t-   3. Sắp xếp giảm dần theo giá và xuất ra màn hình.");
				System.out.println("\t-   4. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
				System.out.println("\t-   5. Xuất giá trung bình của các sản phẩm");
				System.out.println("\t-   0. Thoát");
				System.out.println("\t*--------------------------------------------------------*");
				do {
					System.out.print("  --> Chọn chức năng: ");
					String option = scanner.nextLine();
									
					switch (option) {
						case "1": 
							ds.input();
							
							System.out.println("\n  --------------------------");
							break;
						case "2":
							System.out.println("\t  +-- Danh sách sản phẩm --+");
							ds.output();
							
							System.out.println("\n  --------------------------");
							break;
						case "3":
							ds.sortDecreaseToPrice();
							
							System.out.println("\n  --------------------------");
							break;
						case "4":
							ds.findAndRemove();
							
							System.out.println("\n  --------------------------");
							break;
						case "5":
							ds.averagePrice();
							
							System.out.println("   --> Đã hoàn thành menu! Nhập tiếp menu mới hoặc thoát bằng số \"0\"");
							System.out.println("\n  --------------------------");
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

