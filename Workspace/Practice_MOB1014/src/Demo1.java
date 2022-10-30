import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(" Username: ");
//		String userName = scanner.nextLine();
//		System.out.print(" Password: ");
//		String passWord = scanner.nextLine();
//		if (userName.equalsIgnoreCase("hello") && passWord.length() > 6) {
//			System.out.println(" Username: "+userName);
//			System.out.println(" Pass: "+passWord);
//		}else {
//			System.out.println(" Nhap lai!");
//		}
		
		boolean check = false;
		 do {			
			 try {
				 Scanner scanner = new Scanner(System.in);
				 System.out.print(" Nhập số: ");
				 int number = scanner.nextInt();
				 check = false;
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		System.out.println("Bingo.");
		
		
	}

}
