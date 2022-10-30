package tailaph26495.bai1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DanhSachSoThuc {

	private ArrayList<Double> listDecimal = new ArrayList<>();
	
	public void input() {
		try {			
			listDecimal.clear();
			boolean finish = true;	
			
			System.out.println("\tNhập danh sách các số thực.");
			do {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print(" -> Nhập số: ");
				double number = scanner.nextDouble();
					
				listDecimal.add(number);
					
				
				System.out.print(" --> Muốn nhập thêm không?(Y/N): ");
				scanner = new Scanner(System.in);
				String check = scanner.nextLine();
				if(check.equalsIgnoreCase("Y")) {
					finish = true;
				}else{
					finish = false;
				}
				
			} while(finish);
			
			
		} catch (Exception e) {
			System.out.println(" ---> Đã xảy ra lỗi");
		}
	}
	
	public void output() {	
		if (listDecimal.isEmpty()) {
			System.out.println("  --> Chưa nhập thông tin!");
		}else {
			System.out.println("     ------------------------------");
			System.out.println("\tDanh sách số thực");
			for(Double x : listDecimal) {
				System.out.print("   "+x);
			}
			System.out.println(" ");
		}
			
	}
	
	
	public void sum() { 
		if (listDecimal.isEmpty()) {
			System.out.println("   --> Chưa có dữ liệu!");
		}else {
			System.out.println("     ------------------------------");	
			double sum = 0;
			for(Double x : listDecimal) {
				sum += x;
				}
			System.out.printf(" --> Tổng các phần tử trong list: %.1f",sum);
		}

	
		
	}
	
	
	
	
}