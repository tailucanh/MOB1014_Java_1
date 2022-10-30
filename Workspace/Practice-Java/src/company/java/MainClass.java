package company.java;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		StaffManagement ds = new StaffManagement();
		
		try {
			System.out.println("\t *-- Quản lí cán bộ --*");
			System.out.println("\t   1.Thêm mới cán bộ.");
			System.out.println("\t   2.Hiện thị thông tin về danh sách các cán bộ.");
			System.out.println("\t   3.Tìm kiếm theo họ tên.");
			boolean check = false;
			String menu = null;
			do {
				do {
					try {
						System.out.print("    - Hãy chọn menu: ");		
						menu = scanner.nextLine();
						if (menu.isEmpty() || menu.equals(" ")) {
							check = true;
						}else {
							check = false;
						}
					} catch (Exception e) {
						check = true;
					}
				} while (check);
				
	
				System.out.println("   -----------------------");
				
				switch (menu) {
					case "1":
						ds.input();
						System.out.println("   -----------------------");
						break;
					case "2":
						ds.output();
						System.out.println("   -----------------------");
						break;
					case "3":
						ds.searchByName();
						System.out.println("   -----------------------");
						break;
					default:
						System.out.println("   --> Hãy nhập đúng!");
				}
					
			} while (true);
		} catch (Exception e) {
			System.out.println("  --> Sai dữ liệu!");
		}				
		
	}

	
/*Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.

	Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
	Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
	Các nhân viên có thuộc tính riêng: công việc.
	
	Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

	Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

	Thêm mới cán bộ.
	Tìm kiếm theo họ tên.
	Hiện thị thông tin về danh sách các cán bộ.
	Thoát khỏi chương trình.*/
}



