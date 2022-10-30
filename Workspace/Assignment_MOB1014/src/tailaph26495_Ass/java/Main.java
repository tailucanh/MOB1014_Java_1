package tailaph26495_Ass.java;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Main {
	
	
	public static void main(String[] args) {
		menu();
                  
		
	}
	
											 
	public static void menu() {
		System.out.println("\n\t^..^___CHƯƠNG TRÌNH QUẢN LÍ NHÂN SỰ CÔNG TI RỒNG VIỆT___^..^");
		System.out.println("\t|                --><><><><><><><--                  \t   |");
		System.out.println("\t| 1.Nhập danh sách nhân viên từ bàn phím.\t\t   |");
		System.out.println("\t| 2.Xuất danh sách nhân viên từ bàn phím.\t\t   |");
		System.out.println("\t| 3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.    |");
		System.out.println("\t| 4.Xóa nhân viên theo mã nhập từ bàn phím.\t           |");  
		System.out.println("\t| 5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím. |");
		System.out.println("\t| 6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím.  |");
		System.out.println("\t| 7.Sắp xếp nhân viên theo họ và tên.\t\t           |");
		System.out.println("\t| 8.Sắp xếp nhân viên theo thu nhập.\t\t           |");
		System.out.println("\t| 9.Xuất 5 nhân viên có thu nhập cao nhất.\t\t   |");
		System.out.println("\t| 0.Thoát chương trình.\t\t\t\t\t   |");
		System.out.println("\t+----------------------------------------------------------+");
		Scanner scanner = new Scanner(System.in);
		DanhSachNhanVien ds = new DanhSachNhanVien();
		
		
		try {
			String menu = null;
			boolean check = false;
			do {
				do {
					try {
						System.out.print("\t -> Hãy chọn chức năng: ");
						menu = scanner.nextLine();
						
						if (menu.isEmpty() || menu.equals(" ")) {
							System.out.println("\t -> Hãy chọn đúng chức năng!");
							check = true;
						}else {
							check = false;
						}
					} catch (Exception e) {
						check = true;
					}
				} while (check);
				System.out.println("\t+----------------------------------------------+");
				
				
				
				switch (menu) {
				case "1":
							
					ds.input(scanner);
										
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng!...");
					System.out.println("    -------------------------------------------");
					break;
				case "2":
				
					System.out.println("\t\t *---DANH SÁCH NHÂN VIÊN---* ");
					System.out.println("");
					
					ds.output();
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "3":
				
					
					ds.timNvTheoID(scanner);
					
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "4":
					
					ds.xoaNvTheoMa(scanner);
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "5":
					
					
					ds.capNhatThongTinTheoID(scanner);
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "6":
					
					
					ds.timNvTheoKhoangLuong(scanner);
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "7":
					
					ds.xapXepNvTheoHoTen(scanner);
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "8":
				
					ds.xapXepNvTheoThuNhap(scanner);
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "9":
				
					ds.xuat5NvThuNhapCaoNhat();
					
					System.out.println(" ");
					System.out.println("\t----> Đã hoàn thành chức năng...");
					System.out.println("    -------------------------------------------");
					break;
				case "0":
					System.out.println("\t+----------------------------+");
					System.out.println("\t| Goodbye! See you again ^-^ |");
					System.out.println("\t+----------------------------+");
					return;
				default:
					System.out.println("\t-->Chương trình chỉ từ 1-->9 chức năng.Vui lòng nhập lại.");
					System.out.println(" ");
				}
			}while(true);
		} catch (Exception e) {
			System.out.println("\t  --> Lỗi dữ liệu!");
		}
 		
	}
	
	
	

}

















