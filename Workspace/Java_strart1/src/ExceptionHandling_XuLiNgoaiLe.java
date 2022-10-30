import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_XuLiNgoaiLe {

	public static void main(String[] args) {
		// exception - một sự kiện xảy ra trong quá trình thực thi một chương trình
		// làm gián đoạn luồng hướng dẫn bình thường
		
		//Vd :ngoại lẹ số học phép chia cho 0
		Scanner scanner = new Scanner(System.in);
		
		
		  try { 
			  System.out.print("Nhập vào tử: "); int x = scanner.nextInt();
			  System.out.print("Nhập vào mẫu: "); int y = scanner.nextInt();
		  
		  int z = x/y;
		  
		  System.out.println("Z = "+ z); 
		  } //Kí tự ngoại lệ riêng lẻ
		  
		  catch(ArithmeticException e ) { //ArithmeticException - lỗi số học
			  System.out.println("BẠN KHÔNG THỂ CHIA CHO 0."); }
		  catch(InputMismatchException e) {
			  System.out.println("BẠN HÃY NHẬP HAI SỐ NGUYÊN."); } //Kí tự ngoại lệ chung
		  catch (Exception e) { 
			  System.out.println("ĐÃ XẢY RA LỖI.");
		  }
		 
		//Luôn in ra một biến gì đó
//		finally {
//			System.out.println("Tôi đã làm xong");
//			scanner.close();
//		}
		
		
	}

}
