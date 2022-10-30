import java.time.LocalDate;
import java.util.Scanner;

public class Ngay_thang {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Nhập tháng: ");
			int thang = scanner.nextInt();
			System.out.print("Nhập năm: ");
			int nam = scanner.nextInt();
			if(nam % 4 == 0 && nam % 100 != 0 || nam % 400 ==0) {
				switch (thang) {
				case 1,3,5,7,8,10,12 : {
					System.out.println("Tháng"+thang+" có 31 ngày.");	
					break;
				}
				case 4,6,9,11: {
					System.out.println("Tháng"+thang+" có 30 ngày.");	
					break;
				}
				case 2: {
					System.out.println("Tháng 2 có 29 ngày.");	
					break;				
				}
				}	
			}else {
				switch (thang) {
				case 1,3,5,7,8,10,12 : {
					System.out.println("Tháng"+thang+" có 31 ngày.");	
					break;
				}
				case 4,6,9,11: {
					System.out.println("Tháng"+thang+" có 30 ngày.");	
					break;
				}
				case 2: {
					System.out.println("Tháng 2 có 28 ngày.");	
					break;				
				}
				}
			}	
		}catch (Exception e) {
			System.out.println("Hãy xem lại yêu cầu.");
		}

		
//		LocalDate date = LocalDate.now();
//		System.out.println(date);

	}

}
