package Java_Exercise_part1;

import java.util.Scanner;

public class Bai_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tong_chan_le();	
		tong_nghich_dao();
		
	}
	public static void tong_chan_le() {
		Scanner scanner = new Scanner(System.in);
		int x;
		int tong = 0;
		try {
			do {
				System.out.print(" Nhập x > 0: ");
				x = scanner.nextInt();
			}while(x < 0);
			
			for(int i = 0; i <= x; i++) {
				if(x % 2 == 0 && i % 2 == 0) {
					tong += i;
				}else if(x % 2 != 0 && i % 2 != 0) {
					tong += i;
				}
			}
			System.out.println(" S = "+tong);
		} catch (Exception e) {
			System.out.println("Bạn nhập sai");
		}
		scanner.close();	 
	 }
	
	public static void tong_nghich_dao() {
		Scanner scanner = new Scanner(System.in);
		int n;
		double sum = 0;
		try {
			do {
				System.out.print(" Nhập n > 0: ");
				n = scanner.nextInt();
			}while(n < 0);
			
			for(int i = 1; i <= n; i++) {
				sum += (double)1/i;
			}
			System.out.printf(" S = %3.2f",sum);
			
		} catch (Exception e) {
			System.out.println("Bạn nhập sai");
		}
		scanner.close();	 
	}
	

}




