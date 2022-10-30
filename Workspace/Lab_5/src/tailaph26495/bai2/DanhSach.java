package tailaph26495.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import tailaph26495.bai3.SanPham;


public class DanhSach {

	private ArrayList<People> listPeople = new ArrayList<>();
	
	public void input() {
		try {
			if (listPeople.isEmpty()) {
				Scanner scanner = new Scanner(System.in);

				System.out.println("\t   Nhập danh sách ");
				System.out.print("   >> Nhập số lượng sinh viên: ");
				int quantity = scanner.nextInt();
			
				
				for(int i = 0; i < quantity; i++) {
					People people = new People();
					System.out.printf("\t  Sinh viên %d: \n",i+1);
					people.input();
					listPeople.add(people);
				}
			
			}else {
				listPeople.clear();
				System.out.println("   Bấm ENTER để tiếp tục chương trình!");
			}
				
			
		
		} catch (Exception e) {
			System.out.println("  --> Sai dữ liệu!");
		}
	}
	
	
	public void output() {
		if (listPeople.isEmpty()) {
			System.out.println("    --> Chưa nhập thông tin!");
		}else {
			for(int i = 0; i < listPeople.size(); i++) {
				System.out.println("      STT: "+(i+1)+"   Họ và tên: "+listPeople.get(i).getSurName()+" "+listPeople.get(i).getName());
			}
		}
		
	}
	
	
	public void sortListRandom() {
		if (listPeople.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu nhập!");
		}else {
			System.out.println("\t +-- Danh sách ngẫu nhiên --+");
			Collections.shuffle(listPeople);
		
			output();
		}
		
	}
	
	
	public void sortListDecrease() {
		if (listPeople.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu!");
		}else {
			System.out.println("\t +-- Danh sách giảm dần --+");
		
			Collections.sort(listPeople, new Comparator<People>() {
				@Override
				public int compare(People pe1, People pe2) {		
					return (pe1.getName().compareTo(pe2.getName()));
				}	
			});
		
			Collections.reverse(listPeople);
			output();
		}

	}
	
	
	public void findAndRemove() {
		if (listPeople.isEmpty()) {
			System.out.println("  --> Chưa có dữ liệu!");
		}else {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("    - Nhập họ hoặc tên cần xoá: ");
				String name = scanner.nextLine();
			
			
				ArrayList<People> temp = new ArrayList<>();
				for(People people : listPeople) {
					if (people.getName().equalsIgnoreCase(name) || people.getSurName().equalsIgnoreCase(name)) {
						temp.add(people);				
					}
				}
		
				if (!temp.isEmpty()) {		
					listPeople.removeAll(temp);
					System.out.println("\t +-- Danh sách sau khi xoá --+");
					output();
				}else {
					System.out.println("  --> không tìm thấy!");
				}
				
				
			
			} catch (Exception e) {
				System.out.println("  --> Không tìm thấy!");
			}
		
		}
		
	}
	
	
}


















