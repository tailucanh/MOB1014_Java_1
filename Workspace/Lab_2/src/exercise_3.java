import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\t Tính tiền điện.");
			System.out.print("  Nhập số điện sử dụng(kwh): ");
			int soDien = scanner.nextInt();
			
			
			if(soDien < 50 && soDien > 0) {
				System.out.println(" - Số tiền phải trả với "+soDien+" Kwh là: "+(soDien*1000)+" đồng.");
			}else if(soDien > 50) {
				System.out.println(" - Số tiền phải trả với "+soDien+" Kwh là: "+((50*1000) + (soDien - 50)*1200)+" đồng.");
			}else {
				System.out.println("-->Số tiền điện phải là số dương.");
			}
			
		} catch (Exception e) {
			System.out.println("--> Bạn đã nhập sai dữ liệu.");
		}

	}

}
