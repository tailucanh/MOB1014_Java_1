import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
		
			System.out.print("Nhập tên: ");
			String name = scanner.nextLine();
			
			System.out.print("Nhập điểm trung bình: ");
			double diemTb = scanner.nextDouble();
	
			System.out.printf("%s: %.1f điểm.",name,diemTb);
		} catch (Exception e) {
			System.out.println("  \\\\");
		}
		
		
		
	}

}
