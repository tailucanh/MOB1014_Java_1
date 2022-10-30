package thiThuJava1.fpoly;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\t  *-- Quản lí sinh viên --*");
			System.out.println("\t     1. Nhập 1 danh sách đối tượng");
			System.out.println("\t     2. Xuất danh sách đối tượng");
			System.out.println("\t     3. Tìm SV theo mã");
			System.out.println("\t     4. Sắp xếp danh sách các SV theo thuộc tính chuyenNganh");
			System.out.println("\t     5. Kế thừa");
			System.out.println("\t     0. Thoát");
			
			
			QLSV ql = new QLSV();
			boolean check =false;
			String menu = null;
			do {
				do {
					try {
						System.out.print("\t --> Chọn menu: ");
						menu = scanner.nextLine();
						if (menu.isEmpty() || menu.equals("")) {
							System.out.println("\t  -> Hãy chọn menu!");
							check = true;
						}else {
							check = false;
						}
					} catch (Exception e) {
						check = true;
					}
	
				} while (check);
				
				switch (menu) {
				case "1":
					ql.input(scanner);
					System.out.println("\n\t Hoàn thành chức năng 1");
					break;
				case "2":
					System.out.println("\t   *-- Danh sách nhân viên --*");
					ql.output();
					System.out.println("\n\t Hoàn thành chức năng 2");
					break;
				case "3":
					ql.timTheoId(scanner);
					System.out.println("\n\t Hoàn thành chức năng 3");
					break;
					
				case "4":
					ql.xapXep();
					System.out.println("\n\t Hoàn thành chức năng 4");
					break;
				case "5":
					ql.kethua(scanner);
					System.out.println("\n\t Hoàn thành chức năng 5");
					break;
				case "6":
					return;
				default:
					System.out.println("\t---> Menu chỉ từ 1 -> 5!");
				}
				
				
			} while (true);
			
			
			
			
		} catch (Exception e) {
			System.out.println("  Lỗi dữ liệu!");
		}
	
		
	}

}
