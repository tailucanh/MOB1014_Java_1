import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập cạnh của hình lập phương: ");
		double canh = scanner.nextDouble();
		
		double V = Math.pow(canh, 3);

		System.out.printf("Thể tích hình lập phương là: %.1f",V);
		
	}

}
