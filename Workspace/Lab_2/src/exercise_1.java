import java.util.Scanner;

public class exercise_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\tPhương trình bậc nhất");
			System.out.print("  - Nhập a: ");
			double a = scanner.nextDouble();
			System.out.print("  - Nhập b: ");
			double b = scanner.nextDouble();
			
			
			if(a == 0) {
				if(b == 0) {
					System.out.println(" Phương trình có vô số nghiệm.");
				}else{
					System.out.println(" Phương trình vô nghiệm.");
				}
			}else {
				double x = -b/a;
				System.out.printf(" Phương trình có nghiệm X = %.1f",x);
			}
					
		} catch (Exception e) {
			System.out.println(" Bạn đã nhập sai.Vui lòng kiểm tra lại!");
		}
		

	}

}
