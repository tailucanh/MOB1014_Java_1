import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_class {

	public static void main(String[] args) {
		//File = Một bản trình bày trừu tượng của tên đường dẫn tệp và thư mục

		File file = new File("FileClass.txt"); //Luôn thêm đuôi file- tìm kiếm trong cùng thư mục dự án
		//File file = new File("D:\\Java\\File_class\\FileClass.txt"); //- tìm kiếm trong máy tính cá nhân
		
		
		//Kiểm tra flie có tồn tại hay k
		if(file.exists()) {
			System.out.println("Tệp tồn tại.");
			System.out.println(file.getPath());    //Hiện tên tệp
			System.out.println(file.getAbsolutePath());    //Hiện ví trí tệp
			System.out.println(file.isFile());     //Kiểm tra xem có phải là tệp k hay là thư mục
			//file.delete();   //Xoá tệp trong thư mục dự án
 		}else {
			System.out.println("Tệp không tồn tại.");
		}	
		// WriteFile - Ghi vào 1 tập tin bằng jav
		
		
		try {
			FileWriter writer = new FileWriter("FileClass.txt");
			writer.write("Hello smile\nLục Anh Tài\nHow are you? Iam smlie");  //Viết văn bản
			writer.append("\nHe is beautiful!");		//Chèn thêm
			writer.close();
		} catch (IOException e){		
			e.printStackTrace();
		}
		//ReadFile - đọc nd của tập tin dưới dạng 1 luồng kí tự
		//từng cái read() trả vể giá trị int chứa các byte, khi read() trả về -1, không còn dữ liệu đc đọc
		
		try{
			FileReader reader = new FileReader("D:\\Java\\File_class\\FileClass1.txt");
			int data = reader.read();
			//Dùng vòng lặp chạy data để lấy kí tự
			while(data != -1){
				System.out.print((char)data); //In ra kí tự lần lượt
				data = reader.read();    //Tiếp tục vòng lặp
			}
			reader.close();
		}catch (FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {			
			e.printStackTrace();
		}
			
	}

}
