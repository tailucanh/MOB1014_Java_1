package tailaph26495.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			ArrayList<SinhVien> listSv = new ArrayList<>();
			SinhVien sv = new SinhVien();
			
			System.out.println("\t  Nhập thông tin sinh viên");
			for(int i = 0; i < 5;i++) {
				System.out.println("   >> Sinh viên "+(i+1));
				sv.input();
				listSv.add(sv);
			}
			
			System.out.println(" ");
			System.out.println("\t   *-- Thông tin sinh viên --*");
			for(int i = 0; i < listSv.size();i++) {
				System.out.println("\t         Sinh viên "+(i+1));
				sv.output();
			}
			
		} catch (Exception e) {
			System.out.println(" Lỗi dữ liệu");
		}
		
		
				
	}

}
