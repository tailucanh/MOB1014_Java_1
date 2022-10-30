package tailahp26495_lab3;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		boolean count = true;
		try {
			System.out.print(" Nhập n: ");
			n = scanner.nextInt();
			if(n < 2) {
				System.out.println(" Số "+n+" không phải số nguyên tố.");
			}else {
				for(int i = 2; i < n - 1 ; i++) {
					if(n % i == 0) {
						count = false;
						break;
					}
				}
				System.out.println(" Số "+n+" là số nguyên tố: "+count);
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("Bạn đã nhập sai dữ liệu.");
		}

	}

}
