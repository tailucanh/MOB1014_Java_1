package populationManagement.java;


import java.util.ArrayList;

import java.util.Scanner;

public class Town {
	
	
	private ArrayList<Family> listFamiles = new ArrayList<>();
	String n = null;
	
	
	public void input() {
		try {
			Scanner scanner = new Scanner(System.in);
			boolean check = true;
			
			do {
				try {
					System.out.print("  - Nhập số hộ dân: ");
					n = scanner.nextLine();
					if (n.isEmpty() || n.equals(" ")) {
						check = true;
					}else {
						check = false;
					}
				} catch (Exception e) {
				check = true;
			}
			} while (check);
			int iN = Integer.parseInt(n);
		
			for(int i = 0; i < iN; i++) {
				System.out.println("   >> Hộ dân "+(i+1));	
				Family family = new Family();
				family.input();
				listFamiles.add(family);
				
				for(int j = 0; j < family.getFamilyMembers(); j++) {
					System.out.println("  >>> Thành viên "+(j+1));
					People people = new People();
					people.input();
					
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("   --> Sai dữ liệu!");
		}
	}
	
	

	public void output() {
		System.out.println(" ");
		System.out.println("   *-- Danh sách quản lí khu phố --*");
		System.out.println("       >> Có tất cả: "+n+" hộ dân.");
		
		
		
			
		
		
	}
	
	
	
}









