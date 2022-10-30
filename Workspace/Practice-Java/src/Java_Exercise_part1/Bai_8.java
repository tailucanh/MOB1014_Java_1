package Java_Exercise_part1;

import java.util.Scanner;

public class Bai_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int count = 0;
		try {
			do {
				System.out.print("Nhập n > 0: ");
				n = scanner.nextInt();
			}while(n < 0);
			
			System.out.print(" Các ước số là: ");
			for(int i = 1; i <= n; i++) {		
				if(n % i == 0) {
					System.out.print(i+" ");
					count ++;
				}
			}
			System.out.println("\n Có tất cả: "+count+" ước số.");
			
		} catch (Exception e) {
			System.out.println(" Bạn nhập sai");
		}
	}

}
