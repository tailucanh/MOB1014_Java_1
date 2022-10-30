import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("\tPhương trình bậc 2.");
			System.out.print(" - Nhập a: ");
			double a = scanner.nextDouble();
			System.out.print(" - Nhập b: ");
			double b = scanner.nextDouble();
			System.out.print(" - Nhập c: ");
			double c = scanner.nextDouble();
			
			if(a == 0) {
				if(b == 0) {
					if(c == 0) {
						System.out.println(" Phương trình có vô số nghiệm.");
					}else {
						System.out.println(" Phương trình vô nghiệm.");
					}
				}else {
					double x = -c/b;
					System.out.printf(" Phương trình có 1 nghiệm X = %.1f",x);
				}
			}else {
				double delta = Math.pow(b, 2) - 4*a*c;
				if(delta > 0) {
					double x1 = (-b + Math.sqrt(delta))/(2*a);
					double x2 = (-b - Math.sqrt(delta))/(2*a);
					System.out.printf(" Phương trình có 2 nghiệm phân biệt: \n - X1 = %.1f \n - X2 = %.1f",x1,x2);
				}else if(delta == 0) {
					System.out.printf("Phương trình có nghiệm kép X = %.1f",(double)(-b/(2*a)));
				}else {
					System.out.println(" Phương trình vô nghệm.");
				}		
			}
			
		} catch (Exception e) {
			System.out.println(" Bạn đã nhập sai dữ liệu!");
		}

	}

}
