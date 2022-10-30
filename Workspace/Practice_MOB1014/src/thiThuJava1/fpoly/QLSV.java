package thiThuJava1.fpoly;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class QLSV {

	public ArrayList<NhanVien> listNv = new ArrayList<>();
	
	
	public void input(Scanner scanner) {
		try {	
			boolean finish = true;
			System.out.println("\t   +-- Nhập danh sách --+");
			int i = 1;
			do {		
				NhanVien nv = new NhanVien();
				System.out.println("\t  >> Nhân viên "+i);
				nv.input(scanner);
				listNv.add(nv);		
				
				System.out.print("\t -> Muốn nhập tiếp không?(Y/N):");
				String iCheck = scanner.nextLine();
				
				if (iCheck.equalsIgnoreCase("y")) {
					finish = true;
				}else {
					finish = false;
				}
				i++;
			} while (finish);
			
		} catch (Exception e) {
			System.out.println(" --> Sai dữ liệu!");
		}
		
	}
	
	public void output() {
		if (!listNv.isEmpty()) {
			int i = 1;
			for(NhanVien nv : listNv) {
				System.out.println("\t >> Nhân viên "+i);
				nv.inThongTin();
				i++;
			}
			
		}else {
			System.out.println("\t --> Chưa có dữ liệu nhập vào!");
		}
		
	}
	

	public void timTheoId(Scanner scanner) {
		if (!listNv.isEmpty()) {
			try {
				boolean check = false;
				String checkId = null;
				do {
					try {
						System.out.print("\t -> Nhập id cần tìm: ");
						checkId = scanner.nextLine();
						if (checkId.isEmpty() || checkId.equals("")) {
							System.out.println("\t -> Hãy nhập mã!");
							check = true;
						}else {
							check = false;
						}
					} catch (Exception e) {
						check = true;
					}
					
				} while (check);
				
				NhanVien checkNv = null;
				
				for(NhanVien nv : listNv) {
					if (nv.getId().equalsIgnoreCase(checkId)) {
						checkNv = nv;
						break;
					}
				}
				if (checkNv != null) {
					System.out.println("\t  >> Thông tin nhân viên có mã " + checkId);
					checkNv.inThongTin();;
				} else {
					System.out.println("\t --> Không có thông tin nhân viên mã " + checkId);
				}
				
			
		
			} catch (Exception e) {
				System.out.println(" Lỗi dữ liệu!");
			}
			

		}else {
			System.out.println("\t --> Chưa có dữ liệu nhập vào!");
		}
		
	}
	
	
	public void xapXep() {
		if (!listNv.isEmpty()) {
			Collections.sort(listNv, new Comparator<NhanVien>() {
				@Override
				public int compare(NhanVien o1, NhanVien o2) {
					return o1.getNganh().compareTo(o2.getNganh());
				}
			});
			
			System.out.println("\t Danh sách nhân viên xắp xếp theo ngành ");
			output();
			
		}else {
			System.out.println("\t --> Chưa có dữ liệu nhập vào!");
		}
		
	}
	
	
	public void kethua(Scanner scanner) {
		
		try {
			SinhVienPoly svPoly = new SinhVienPoly("Ph34", "Tài", "cntt");
			svPoly.input(scanner);
			
			System.out.println("\t Thông tin sinh viên");
			svPoly.output();
			
			
		} catch (Exception e) {
			System.out.println(" lỗi dữ liệu!");
		}
	
		
	}
	
	
	
}











