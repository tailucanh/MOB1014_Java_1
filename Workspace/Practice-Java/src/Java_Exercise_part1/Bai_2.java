package Java_Exercise_part1;

import java.util.Scanner;

public class Bai_2 {

	public static void main(String[] args) {
		//Nhập vào kích thước chiều rộng, chiều cao và in ra hình chữ nhật các dấu *
		//nhưng rỗng bên trong.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều rộng: ");
		int x = scanner.nextInt();
		System.out.print("Nhập chiều cao: ");
		int y = scanner.nextInt();
		
		for(int i = 0; i < y; i++) {
			for(int j = 0; j < x; j++) {
				if(i == 0 || j == 0|| i == y - 1 || j == x - 1 ) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");   //Tương ứng với  " * "
				}
			}
			System.out.print("\n");
		}
		
	}
}
