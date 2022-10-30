package libraryManager.smile.java;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("\t           *-- Quản lí sách --*");
		System.out.println("\t   1.Thêm mới tài liêu: Sách, tạp chí, báo.");
		System.out.println("\t   2.Hiện thị thông tin về tài liệu.");
		System.out.println("\t   3.Xoá tài liệu theo mã tài liệu.");
		System.out.println("\t   4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
		System.out.println("\t   0.Thoát khỏi chương trình.");
		
		Scanner scanner = new Scanner(System.in);
		BookManagement dsBooks = new BookManagement();
	
		try {	
			do {
				System.out.print("    - Hãy chọn menu: ");		
				int menu = scanner.nextInt();
				
				System.out.println("   -----------------------");
				
				switch (menu) {
					case 1:
						dsBooks.input();
						System.out.println("   -----------------------");
						break;
					case 2:
						System.out.println("\t  *-- Danh sách thư viện --*");
						dsBooks.output();
						System.out.println("   -----------------------");
						break;
					case 3:
						dsBooks.deleteDocument();
						System.out.println("   -----------------------");
						break;
					case 4:
						dsBooks.searchByType();
						System.out.println("   -----------------------");
						break;
					case 0:
						return;
		
					default:
						System.out.println("   --> Hãy nhập đúng!");
					}
			
			} while (true);
		} catch (Exception e) {
				System.out.println("  --> Sai dữ liệu!");
			}
	}

}
