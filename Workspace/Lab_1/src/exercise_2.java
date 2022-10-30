import java.util.Scanner;

public class exercise_2 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài: ");
		double x = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng: ");
		double y = scanner.nextDouble();
		
		double P = (x + y)*2;
		double S = x * y;
		double min = Math.min(x, y);
		
		System.out.println("S = "+S);
		System.out.println("P = "+P);
		System.out.println("Cạnh nhỏ nhất: "+min);
		
	}

}
