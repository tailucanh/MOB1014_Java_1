package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import thiThuJava1.fpoly.SinhVienPoly;




public class QLHoa {

	public ArrayList<Hoa> listHoa = new ArrayList<>();
	
	
	public void input(Scanner scanner) {
		try {	
			boolean finish = true;
			System.out.println("\t   +-- Nhập danh sách --+");
			int i = 1;
			do {		
				Hoa hoa = new Hoa();
				System.out.println("\t  >> Đối tượng "+i);
				hoa.input(scanner);
				listHoa.add(hoa);		
				
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
		if (!listHoa.isEmpty()) {
			int i = 1;
			for(Hoa nv : listHoa) {
				System.out.println("\t >> Đối tượng "+i);
				nv.output();
				i++;
			}
			
		}else {
			System.out.println("\t --> Chưa có dữ liệu nhập vào!");
		}
		
		
	}
	
	public void xapXep() {
		if (!listHoa.isEmpty()) {
			Collections.sort(listHoa, new Comparator<Hoa>() {
				@Override
				public int compare(Hoa o1, Hoa o2) {
					return Integer.compare(o1.getId(), o2.getId());
				}
			});
			
			Collections.reverse(listHoa);
			System.out.println("\t Danh sách đối tượng giảm dần theo Id ");
			output();
			
		}else {
			System.out.println("\t --> Chưa có dữ liệu nhập vào!");
		}
		
	}
	
	public void timTheoId(Scanner scanner) {
		if (!listHoa.isEmpty()) {
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
				
				Hoa checkHoa = null;
				
				for(Hoa hoa : listHoa) {
					if (hoa.getId() == Integer.valueOf(checkId)) {
						checkHoa = hoa;
						break;
					}
				}
				if (checkHoa != null) {
					System.out.println("\t  >> Thông tin nhân viên có mã " + checkId);
					checkHoa.output();;
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
	
	public void kethua(Scanner scanner) {
		try {
			HoaHong hoa = new HoaHong();
			hoa.input(scanner);
			
			System.out.println("\t Thông tin hoa");
			hoa.output();
			
			
		} catch (Exception e) {
			System.out.println(" lỗi dữ liệu!");
		}
		
	}
	
	
}
