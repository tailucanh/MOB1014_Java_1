package arraylist.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> name = new ArrayList<String>();
//		
//		name.add("Smile");
//		name.add("Tai");
//		name.add("Huy");
//		name.add("Cuong");
//		name.add("Hoa");
//		
//		name.add(1,"Viet");
//		name.remove(2);
//		name.remove("Hoa");
//		name.get(3);
//		name.set(1, "Smilee");
//	
//		
//		System.out.println(name.toString());
//		System.out.println(name.size());
//		System.out.println(name.contains("Smile"));
//		System.out.println(name.isEmpty());
//		System.out.println(name.indexOf("Cuong"));
		
		
//		ArrayList<Double> listNumber = new ArrayList<Double>();
		
		
//		listNumber.add(5.0);
//		listNumber.add(5.6);
//		listNumber.add(3.0);
//		listNumber.add(8.5);
//		listNumber.add(3.4);
//		listNumber.add(9.6);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhập số lượng: ");
//		int n = scanner.nextInt();
//		for(int i = 0; i <= n; i++) {
//			System.out.printf(" Number [%d]: ",i+1);
//			double number = scanner.nextDouble();
//			listNumber.add(number);
//		}
//		
//		double sum = 0;
//		for(Double x : listNumber) {
//			sum += x;
//		}
//		System.out.println("Tổng = "+sum);
		
	
		ArrayList<Sinhvien> SvFpoly = new ArrayList<Sinhvien>();
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("      Nhập danh sách ");
			System.out.print(" Nhập số lượng sinh viên: ");
			int soLuong = scanner.nextInt();
			
			for(int i = 0; i < soLuong; i++) {
				Sinhvien SV = new Sinhvien();	
				SV.input();
				SvFpoly.add(SV);
			}
			
							
			System.out.println(" ---> Số lượng: "+SvFpoly.size());
			
			
			
			System.out.println("      Danh sách sinh viên");
			for(int i = 0; i < SvFpoly.size(); i++) {
				System.out.println("SV: "+(i+1)+"  Họ và tên: "+SvFpoly.get(i).getHo()+ " "+SvFpoly.get(i).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
			}
			System.out.println();
			
			
			
			System.out.println("      Danh sách sinh viên theo điểm");
			
			Collections.sort(SvFpoly, new Comparator<Sinhvien>() {

				@Override
				public int compare(Sinhvien sv1, Sinhvien sv2) {
					
						return Double.compare(sv1.getDiemTb(), sv2.getDiemTb());
				}
				
			});
			
			for(int i = 0; i < SvFpoly.size(); i++) {
				System.out.println("SV: "+(i+1)+"  Họ và tên: "+SvFpoly.get(i).getHo()+ " "+SvFpoly.get(i).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
			}
			System.out.println();
			
			
			
			
			
			System.out.println("      Danh sách sinh viên theo chữ cái");
			
			Collections.sort(SvFpoly, new Comparator<Sinhvien>() {

				@Override
				public int compare(Sinhvien sv1, Sinhvien sv2) {
					// TODO Auto-generated method stub
					return (sv1.getName().compareTo(sv2.getName()));
				}
				
			});
			for(int i = 0; i < SvFpoly.size(); i++) {
				System.out.println("SV: "+(i+1)+"  Họ và tên: "+SvFpoly.get(i).getHo()+ " "+SvFpoly.get(i).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
			}
			System.out.println();
			
			
		
			
			System.out.println("     Danh sách nhân viên theo khoảng điểm >8");
			for(int i = 0; i < SvFpoly.size(); i++) {
				if(SvFpoly.get(i).getDiemTb() >= 8) {
					System.out.println("SV: "+(i+1)+"  Họ và tên: "+SvFpoly.get(i).getHo()+ " "+SvFpoly.get(i).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
				}
			}
			System.out.println();
					
			
		
			System.out.println("     Tìm sinh viên theo tên");
			System.out.print(" Nhập tên cần tìm: ");
			scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			
			for(int i = 0; i < SvFpoly.size(); i++) {
				if(SvFpoly.get(i).getName().equals(name)) {
					System.out.println("SV: "+(i+1)+"  Họ và tên: "+SvFpoly.get(i).getHo()+ " "+SvFpoly.get(i).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
				}
			}
			System.out.println();
			
			
			
			System.out.println("     Tìm và sửa sinh viên theo tên");
			System.out.print(" Nhập tên hoặc họ cần tìm: ");
			String name2 = scanner.nextLine();
			for(int i = 0; i < SvFpoly.size(); i++) {
				if(SvFpoly.get(i).getName().equals(name2) || SvFpoly.get(i).getHo().equals(name2)) {
					
					System.out.print(" Nhập họ cần sửa: ");
					Scanner scanner2 = new Scanner(System.in);
					String adHo = scanner.nextLine();
					System.out.print(" Nhập tên cần sửa: ");
					String adName = scanner.nextLine();
					
					SvFpoly.get(i).setHo(adHo);
					SvFpoly.get(i).setName(adName);
					
					System.out.println("      Danh sách sinh viên sau khi thay đổi họ tên");
					for(int j = 0; j < SvFpoly.size(); j++) {
						System.out.println("SV: "+(j+1)+"  Họ và tên: "+SvFpoly.get(j).getHo()+ " "+SvFpoly.get(j).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
					}
				}
			}
			System.out.println();
			
			
			System.out.println("     Xoá sinh viên");
			System.out.print(" Nhập tên hoặc họ cần xoá: ");
			scanner = new Scanner(System.in);
			String name3 = scanner.nextLine();
			
			for(int i = 0; i < SvFpoly.size(); i++) {
				if(SvFpoly.get(i).getName().equals(name3) || SvFpoly.get(i).getHo().equals(name3)) {
					SvFpoly.remove(i);
					
					System.out.println("      Danh sách sinh viên sau khi xoá");
					for(int j = 0; j < SvFpoly.size(); j++) {
						System.out.println("SV: "+(j+1)+"  Họ và tên: "+SvFpoly.get(j).getHo()+ " "+SvFpoly.get(j).getName() +" Điểm: "+SvFpoly.get(i).getDiemTb());
					}
				}
			}
			System.out.println();
			
						
		} catch (Exception e) {
			System.out.println(" Đã có lỗi");
		}
		
	}

}


















