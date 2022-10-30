package tailaph26495.lab8;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
			
		
		try {
			Scanner scanner = new Scanner(System.in);
			boolean check = false;
			String menu = null;
			System.out.println("\t   *--- Cho menu ---+");
			System.out.println("\t     1. Tính tổng tham số.");
			System.out.println("\t     2. Tìm số min, max.");
			System.out.println("\t     3. Chuyển đổi kí tự");
			System.out.println("\t     0. Thoát.");
			do {
				do {
					try {
						System.out.print("    --> Chọn chức năng: ");
						menu = scanner.nextLine();
						if (menu.isEmpty() || menu.equals(" ")) {
							check = true;
						}else {
							check = false;
						}
						System.out.println("    ------------------------");
					} catch (Exception e) {
						check = true;
					}
					
				} while (check);
				
				switch (menu) {
				case "1":
					
					System.out.println("\t  >> Tổng các tham số  là: "+XPoly.sum(4, 6, 6.4));
					System.out.println(" ");
					
					break;
				case "2":
					System.out.println("\t  >> Số nhỏ nhất trong các tham số là: "+XPoly.min(9,546,4,7.5,23.6));
					System.out.println("\t  >> Số lớn nhất trong các tham số là:  "+XPoly.max(96,89.6,54));
					System.out.println(" ");
					
					
					break;
					
				case "3":
					System.out.println("\t  >> Tên sau khi thay đổi: "+XPoly.toUpperFirstChar("luc anh tai"));
				
					
					break;
					
				case "0":
					System.out.println("   --> Kết thúc chương trình!");
					return;
									
				default:
					System.out.println(" --> Chọn đúng menu!");
				}
				
				
				
			} while (true);
		
		} catch (Exception e) {
			System.out.println("   -> Sai dữ liệu!");
		}


	}

}
