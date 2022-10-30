package tailahp26495_lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			int n;	
			do {
				System.out.print(" Nhập số phần tử của mảng: ");
				n = scanner.nextInt();
			}while(n <= 0 || n > 100);
			
			int[] arr = new int[n];
			System.out.println(" Nhập phần tử mảng ");
			for(int i = 0 ; i < arr.length; i++){
				System.out.printf("     Number[%d]: ",i+1);
				arr[i] = scanner.nextInt();
			}
			System.out.println("-> Mảng trước khi xắp xếp: "+Arrays.toString(arr));
			
			Arrays.sort(arr);
			System.out.println("-> Mảng sau khi sắp xếp "+Arrays.toString(arr));
			
			numberMin(arr);
			tbCong(arr);
			
			
			scanner.close();
		} catch (Exception e) {
			System.out.println(" Bạn nhập sai dữ liệu.");
		}
	}
	
	public static void numberMin(int[] arr) {
		int min = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if(arr[i] > min) {
				min = Math.min(min, arr[i]);
			}
		}
		System.out.println("-> Số nhỏ nhất trong mảng là: "+min);
	}
	
	public static void tbCong(int[] arr) {
		int count = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				sum += arr[i];
				count++;
			}
		}
		System.out.println("-> Trung bình cộng các phần tử chia hết cho 3 là: "+(double)sum/count);
	}
	
}






