package tailaph26495.bai2_3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSanhSv {
	
	private ArrayList<SinhVienPoly> listSvPoly = new ArrayList<>();
	
	
	public void input() {
		if (listSvPoly.isEmpty()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\t\t      +-- Phân loại --+");
			System.out.println("\t     1. Sinh viên IT.   2. Sinh viên Biz. \n");
			int i = 1;
			do {
				System.out.println("\t    >> Sinh viên: "+i);
				System.out.print("\t  - Nhập loại sinh viên(Bấm ENTER để dừng): ");

				String classify = scanner.nextLine();
				if (classify.isEmpty() || classify.equals(" ")) {
					System.out.println("     --> Kết thúc nhập!");
					break;
				}
				
				switch(classify) {
					case "1":
						SinhVienIT svIT = new SinhVienIT();
						svIT.input();
						listSvPoly.add(svIT);
						break;	
					case "2":
						SinhVienBiz svBiz = new SinhVienBiz();
						svBiz.input();
						listSvPoly.add(svBiz);
						break;		
					default:
						System.out.println("     --> Chọn đúng loại!");		
				}
				i++;
				
			} while (true);
						
		}else {
			listSvPoly.clear();
			System.out.println("   --> Đã xoá sạch dữ liệu! Bấm Enter để nhập danh sách mới!");
		}
		
	
	}
	
	public void output() {
		if (!listSvPoly.isEmpty()) {
			int i = 1;
			for(SinhVienPoly sv : listSvPoly) {
				System.out.println("\t   >>> Sinh viên "+i);
				if(sv instanceof SinhVienIT) {
					sv.output();
				}else if(sv instanceof SinhVienBiz){
					sv.output();
				}
				System.out.println(" ");
				i++;
			}
			
		}else {
			System.out.println("    --> Chưa có dữ liệu nhập vào!");
		}
	}
	
	
	public void dsSvHocLucGioi() {
		if (!listSvPoly.isEmpty()) {
			System.out.println("\t  +-- Danh sách sinh viên học lực giỏi --+");
			for(SinhVienPoly sv : listSvPoly) {
				if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
					if(sv instanceof SinhVienIT) {
						sv.output();
					}else if(sv instanceof SinhVienBiz){
						sv.output();
					}
						System.out.println(" ");	
					}			
				}
					
		}else {
			System.out.println("    --> Chưa có dữ liệu nhập vào!");
		}
	}
	
	
	public void xapXepTheoDiem() {	
		if (!listSvPoly.isEmpty()) {
			Collections.sort(listSvPoly, new Comparator<SinhVienPoly>() {
				@Override
				public int compare(SinhVienPoly o1, SinhVienPoly o2) {
	
					return Double.compare(o1.getDiem(), o2.getDiem());
				}
			});
			
			Collections.reverse(listSvPoly);
			
			System.out.println("\t  +-- Danh sách sinh viên theo điểm giảm dần --+");
			output();
			
		}else {
			System.out.println("    --> Chưa có dữ liệu nhập vào!");
		}
	}
	
	
}












