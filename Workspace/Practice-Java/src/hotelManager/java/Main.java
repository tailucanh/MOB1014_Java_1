package hotelManager.java;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		roomList ds = new roomList();
		
		try {
			System.out.println("\t *-- Quản lí khách sạn --*");
			System.out.println("\t   1.Thêm mới phòng.");
			System.out.println("\t   2.Hiện thị thông tin về danh sách phòng.");
			System.out.println("\t   3.Xoá thông tin theo cmnd.");
			System.out.println("\t   4.Tính tiền.");
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
						ds.input(scanner);
						System.out.println("   -----------------------");
						break;
					case "2":
						ds.output();
						System.out.println("   -----------------------");
						break;
					case "3":
						ds.deleteByCmnd(scanner);
						System.out.println("   -----------------------");
						break;
					case "4":
						ds.bill(scanner);
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

}
