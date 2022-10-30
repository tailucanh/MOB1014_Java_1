package tailahp26495_lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			int n;
			do {
				System.out.print(" Nhập số lượng sinh viên: ");			
				n = scanner.nextInt();
			}while(n <= 0 || n > 50);
			
			String[] name = new String[n];
			double[] point  = new double[n];
			
			for(int i = 0; i < n; i++) {
				scanner = new Scanner(System.in);
				System.out.printf("   Name[%d]: ",i+1);
				name[i] = scanner.nextLine();
				System.out.printf("   Point[%d]: ",i+1);
				point[i] = scanner.nextDouble();							
			}
			System.out.println("+------------------------------+");
			System.out.println("  Mảng sinh viên: "+Arrays.toString(name));
			System.out.println("  Mảng điểm sinh viên: "+Arrays.toString(point));
			System.out.println("+------------------------------+");
			
			xap_xep(name, point);
			hien_thi(name, point);
						
			scanner.close();
		} catch (Exception e) {
			System.out.println(" Bạn đã nhập sai dữ liệu.");
		}
	}
	
	public static void xap_xep(String[] name,double[] point ) {
		for(int i = 0; i < name.length - 1; i++) {
			for(int j = i +1; j < name.length; j++) {
				if(point[i] > point[j]) {
					double temp = point[i];  
					point[i] = point[j];
					point[j] = temp;
					String nameTemp = name[i];  
					name[i] = name[j];
					name[j] = nameTemp;
				}
			}
		}
	}
	
	public static void hien_thi(String[] name,double[] point) {
		System.out.println("\t  *---Sau khi xắp xếp---*");
		System.out.println("   Họ và tên    |  Điểm  |  Hạnh kiểm");
		System.out.println("   ---------       ----     ---------");
		for(int i = 0; i < name.length; i++) {
			System.out.print("   "+name[i]+"\t    "+point[i]);	
			if(point[i] < 5 && point[i]  >= 0 ) {
				System.out.print("\t     Yếu\n");
			}else if(point[i] < 6.5) {
				System.out.print("\t     Trung bình\n");
			}else if(point[i] < 7.5) {
				System.out.print("\t     Khá\n");
			}else if(point[i] < 9) {
				System.out.print("\t     Giỏi\n");
			}else if(point[i] <= 10) {
				System.out.print("\t     Xuất sắc\n");
			}else {
				System.out.print(" Điểm nằm trong khoảng [0,10]");
			}
			
		}
		
		
	}
	

	
}






