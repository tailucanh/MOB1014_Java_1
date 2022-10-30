package company.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StaffManagement {

	private ArrayList<OfficeStaff> listOfficeStaffs = new ArrayList<>();
	
	public void input() {
		if (listOfficeStaffs.isEmpty()) {
			try {		
				System.out.print("\t   Phân loại nhân viên");
				System.out.print("\n\t   1. Công nhân.\n\t   2. Nhân viên.\n\t   3. Kĩ sư.\n");
				do {
					Scanner scanner = new Scanner(System.in);
					System.out.print("\t  --> Nhập loại nhân viên: ");
					String menu = scanner.nextLine();
					
					
					if (menu.isEmpty() || menu.equals(" ")) {
						break;
					}
					
					
					int iMenu = Integer.parseInt(menu);
					
					
					switch (iMenu) {
						case 1: 
							Worker workers = new Worker();
							workers.input(scanner);
							listOfficeStaffs.add(workers);
							break;
						case 2:
							Engineer engineers = new Engineer();
							engineers.input(scanner);
							listOfficeStaffs.add(engineers);
							break;
						case 3:
							Personnel personnels = new Personnel();
							personnels.input(scanner);
							listOfficeStaffs.add(personnels);
							break;
						default:
							System.out.println("   --> Nhập đúng loại nhân viên.");
					}
				} while (true);
				
			} catch (Exception e) {
				System.out.println("    --> Kết thúc nhập.");
			}
		}else {
			listOfficeStaffs.clear();
			System.out.println("    --> Đã xoá danh sách! Bấm ENTER để nhập!");
		}
		
			
	}
	
	
	public void output() {
		if (!listOfficeStaffs.isEmpty()) {
			System.out.println("\t        *-- Thông tin danh sách nhân viên --*");	
			for(OfficeStaff nv : listOfficeStaffs) {
				if (nv instanceof Worker ) {
					nv.output();	
				}else if(nv instanceof Engineer) {
					nv.output();
				}else if(nv instanceof Personnel) {
					nv.output();
				}
				System.out.println(" ");
			}	
		}else {
			System.out.println("  --> Chưa có dữ liệu nhập!");
		}
		
	}
	
	public void searchByName() {
		if (!listOfficeStaffs.isEmpty()) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("   - Nhập họ hoặc tên nhân viên cần tìm: ");
				String iName = scanner.nextLine();
				for(OfficeStaff nv : listOfficeStaffs) {
					if (nv.getName().equalsIgnoreCase(iName) || nv.getSurName().equalsIgnoreCase(iName)) {
						if (nv instanceof Worker ) {
							nv.output();	
						}else if(nv instanceof Engineer) {
							nv.output();
						}else if(nv instanceof Personnel) {
							nv.output();
						}
						System.out.println(" ");
					}	
				}
			} catch (Exception e) {
				System.out.println("  --> Không có thông tin bạn cần tìm");
			}
		}else {
			System.out.println("   --> Chưa có dũ liệu!");
		}
		
		

	}
	
	
}











