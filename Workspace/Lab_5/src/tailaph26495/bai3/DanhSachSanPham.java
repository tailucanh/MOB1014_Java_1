package tailaph26495.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;



public class DanhSachSanPham {

	
	private ArrayList<SanPham> listSanPhams = new ArrayList<>();
	
	
	public void input() {
		if (!listSanPhams.isEmpty()) {
			listSanPhams.clear();
			System.out.println("   Đã xoá sạch lữ liệu ban đầu! Mời chọn lại menu mới!");		
		}else {
			try {
				boolean finish = true;
		
				System.out.println("\t  Thông tin sản phẩm");
				System.out.println("   >> Nhập thông tin sản phẩm:");
				do {
					Scanner scanner = new Scanner(System.in);
					
					SanPham sanPham = new SanPham();
					sanPham.input();
					listSanPhams.add(sanPham);
					
					System.out.print("   >> Thêm sản phẩm?(Y/N): ");
					String check = scanner.nextLine();
					
					if(check.equalsIgnoreCase("Y")) {
						finish = true;
					}else {
						finish = false;
					}		
				}while(finish);
			
			} catch (Exception e) {
				System.out.println("  --> Sai dữ liệu");
			
			}
		}
		
	}
	
	public void output() {
		if (listSanPhams.isEmpty()) {
			System.out.println("   --> Chưa có dữ liệu nhập vào!");
		}else {
			for(int i = 0; i < listSanPhams.size(); i++) {
				System.out.println("      STT: "+(i+1)+"    Tên sản phẩm: "+listSanPhams.get(i).getName()+"       Giá: "+listSanPhams.get(i).getPrice());
			}	
		}
		
		
	}
	
	public void sortDecreaseToPrice() {
		if (listSanPhams.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu!");
		}else {
			Collections.sort(listSanPhams, new Comparator<SanPham>() {
				@Override
				public int compare(SanPham sp1, SanPham sp2) {	
					return Double.compare(sp1.getPrice(), sp2.getPrice());
				}		
			});
			Collections.reverse(listSanPhams);
		
			System.out.println("\t  +-- Danh sách sản phẩm theo giá giảm dần --+");
			output();
		}

		
	}
	
	public void findAndRemove() {
		if (listSanPhams.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu!");
		}else {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("   - Nhập tên sp muốn xoá: ");
				String name = scanner.nextLine();
			
						
				ArrayList<SanPham> temp = new ArrayList<>();
				
				for(SanPham sp : listSanPhams) {
					if (sp.getName().equalsIgnoreCase(name)) {
						temp.add(sp);				
					}
				}
			
				if (!temp.isEmpty()) {		
					listSanPhams.removeAll(temp);
					System.out.println("\t  +-- Danh sách sản phẩm sau khi xoá --+");
					output();
				}else {
					System.out.println("  --> không tìm thấy sản phẩm!");
				}
				
							
			} catch (Exception e) {
				System.out.println("   --> Không tìm thấy!");
			}
		}
	
	}
	
	public void averagePrice() {
		if (listSanPhams.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu!");
		}else {
			double sum =  0, avg = 0;
		
			for(SanPham x : listSanPhams) {
				sum += x.getPrice();
			}
			
			avg = sum/listSanPhams.size();
			System.out.println("  -> Giá trung bình các sản phẩm: "+avg);
		}
		
	}
	
}








