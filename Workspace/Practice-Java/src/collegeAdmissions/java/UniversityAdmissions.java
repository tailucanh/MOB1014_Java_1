package collegeAdmissions.java;

import java.util.ArrayList;
import java.util.Scanner;


public class UniversityAdmissions {
	
	private ArrayList<Information> listCollegeStudent = new ArrayList<>();
	

	public void input() {
		if (listCollegeStudent.isEmpty()) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("\t      +-- Phân loại khối thi --+");
				System.out.println("\t    1. Khối A.   2. Khối B.   3. Khối C  ");
				int i = 1;
				do {
					System.out.println("    >>> Sinh viên "+i);
					System.out.print("      --> Hãy chọn khối của bạn(Bấm Enter để dừng): ");
					String selection = scanner.nextLine();
					if(selection.isEmpty() || selection.equals(" ")) {
						break;
					}
					
					switch (selection) {
						case "1":
							BlockA a = new BlockA();
							a.input();
							listCollegeStudent.add(a);
							break;
						case "2":
							BlockB b = new BlockB();
							b.input();
							listCollegeStudent.add(b);
							break;
						case "3":
							BlockC c = new BlockC();
							c.input();
							listCollegeStudent.add(c);
							break;
						default:
							System.out.println("    --> Hãy chọn đúng khối thi");
					
					}	
					i++;
				} while (true);
			} catch (Exception e) {
				System.out.println("   --> Lỗi dữ liệu!");
			}

		}else {
			listCollegeStudent.clear();
			System.out.println("    -> Đã xoá dữ liệu nhập ! Bấm ENTER để nhập danh sách mới!");
		}

					
	}
	
	
	public void output() {
		if (!listCollegeStudent.isEmpty()) {
			int i = 1;	
			for(Information list : listCollegeStudent) {
				System.out.println("\t   >> Sinh viên "+i);
				if (list instanceof BlockA) {
					list.output();
				}else if(list instanceof BlockB) {
					list.output();
				}else if(list instanceof BlockC) {
					list.output();
				}
				i++;
			}
		}else {
			System.out.println("  --> Chưa có dữ liệu nhập vào!");
		}
	
		
	}
	
	public void searchOfID() {
		if (!listCollegeStudent.isEmpty()) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("     - Nhập số báo danh cần tìm: ");
				String checkID = scanner.nextLine();
				
				for(Information list : listCollegeStudent) {
					if (checkID.isEmpty() || checkID.equals(" ")) {
						System.out.println("   --> Không tìm thấy sinh viên!");
						break;
					}
					if (list.getId().equalsIgnoreCase(checkID)) {
						System.out.println("    >>> Thông tinh sinh viên có mã: "+checkID);
						if (list instanceof BlockA) {
							list.output();
						}else if(list instanceof BlockB) {
							list.output();
						}else if(list instanceof BlockC) {
							list.output();
						}
					}
					
				}
			} catch (Exception e) {
				System.out.println("  --> Lỗi dữ liệu!");
			}

		}else {
			System.out.println("   --> Chưa có dữ liệu nhập vào!");
		}
		
	}
	
}













