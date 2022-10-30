package Java_Exercise_part1;

import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print(" Nhập chiều cao tháp:");
			int h = scanner.nextInt();
			int x, output;
			
			for(int i = 0; i <= h; i++) {
				for(int j = 0; j < 2*h; j++) {
					x = j-h;
					if(x < 0) {
						x *= -1;
					}
					output = i - x;
					if(output > 0) {
						System.out.printf("%3d",output);
					}else {
						System.out.printf("   ");
					}
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(" Bạn đã nhập sai dữ liệu");
		}
	}

}
