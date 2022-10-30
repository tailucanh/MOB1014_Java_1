package collegeAdmissions.java;


import java.awt.Menu;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		

		menu();
		
		
			
		
		/*Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.

	Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.

	Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.

	Thí sinh thi khối C thi các môn: Văn, Sử, Địa.

	Yêu cầu 1: Xây dựng các lớp để quản lý các thi sinh dự thi đại học.

	Yêu cầu 2: Xây dựng lớp TuyenSinh có các chức năng:

	Thêm mới thí sinh.
	Hiện thị thông tin của thí sinh và khối thi của thí sinh.
	Tìm kiếm theo số báo danh.
	Thoát khỏi chương trình.*/

	}
	

	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t     *-- Quản lí sinh viên thi đại học --*");
		System.out.println("\t           1.Thêm mới thí sinh.");
		System.out.println("\t           2.Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
		System.out.println("\t           3.Tìm kiếm theo số báo danh.");
		System.out.println("\t           0.Thoát khỏi chương trình.");
		System.out.println("      ---------------------------------------------------");
		
		String menu = null;
		boolean check = false;
			
		UniversityAdmissions dsStudents = new UniversityAdmissions();
		
		do {
			do {
				try {
					System.out.print("     --> Chọn menu: ");
					menu = scanner.nextLine();
					if (menu.isEmpty() || menu.equals(" ")) {
						check = true;
					}else {
						check = false;
					}
					System.out.println("      -------------------------");
				} catch (Exception e) {
					check = true;
				}
			} while (check);
			
			switch (menu) {
				case "1":
					dsStudents.input();
					
					System.out.println("  --> HOÀN THÀNH CHỨC NĂNG 1!");
					System.out.println("   ---------------------------");
					break;
				case "2":
					System.out.println("\t     *--- Danh sách sinh viên ---*\n");
					dsStudents.output();
					
					System.out.println("  --> HOÀN THÀNH CHỨC NĂNG 2!");
					System.out.println("   ---------------------------");
					break;
				case "3":
					dsStudents.searchOfID();
					
					System.out.println("  --> HOÀN THÀNH CHỨC NĂNG 3!");
					System.out.println("   ---------------------------");
					break;
				case "0":
					return;
				default:
					System.out.println("    --> Hãy chọn đúng menu!");
			
			}
			
		} while (true);
		
	}
	
}
	
	
	
	






























