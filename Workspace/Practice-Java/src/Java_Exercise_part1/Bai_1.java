package Java_Exercise_part1;

import java.util.Scanner;

public class Bai_1 {

	public static void main(String[] args) {
		//Nhập vào kích thước chiều rộng chiều cao và in ra hình chữ nhật các dấu *.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều rộng: ");
		int x = scanner.nextInt();
		System.out.print("Nhập chiều cao: ");
		int y = scanner.nextInt();
		
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print(" * ");
			}
			System.out.print("\n");
		}

	}

}
