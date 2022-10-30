import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("    Tính Delta");
		System.out.print("Nhập cạnh a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập cạnh b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập cạnh c: ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b, 2)-4*a*c;
		
		System.out.println("Căn denlta: "+Math.sqrt(delta));

	}

}
