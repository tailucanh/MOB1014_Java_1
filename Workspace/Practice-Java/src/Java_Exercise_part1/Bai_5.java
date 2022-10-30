package Java_Exercise_part1;

import java.util.Random;
import java.util.Scanner;

public class Bai_5 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" Nhập input: ");
			int input = scanner.nextInt();
			int count = 0;
			Random random = new Random();
			while(true) {
				int randomNumber = random.nextInt(100);
				count ++;
				System.out.println(" RandomNumber: "+randomNumber+ ", Input: "+input);
				if(randomNumber == input) {
					System.out.println(" Số lần thực hiện: "+count+" lần");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(" Bạn nhập sai.");
		}
		
	}

}
