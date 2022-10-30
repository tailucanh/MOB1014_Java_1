package GUI_Jav;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOption_Pane {

	public static void main(String[] args) {
		// JOptionPane = bật lên một hộp thoại tiêu chuẩn nhắc người dùng nhập một giá trị 
		// hoặc thông báo cho họ về điều gì đó.
											   //Thông báo		//Tiêu đề
		//JOptionPane.showMessageDialog(null, "Đây là đài Việt Nam", "Smile",JOptionPane.PLAIN_MESSAGE);        //hộp thông báo đơn giản
		//JOptionPane.showMessageDialog(null, "Đây là Tài Smile.", "Smile",JOptionPane.INFORMATION_MESSAGE);    //Thông tin
		//JOptionPane.showMessageDialog(null, "Mày có khoẻ không?", "Smile",JOptionPane.QUESTION_MESSAGE);  		//Câu hỏi
		
		//while(true) {   //Vòng lặp k thể thoát
		//	JOptionPane.showMessageDialog(null, "Máy tính có vi-rut.", "Smile",JOptionPane.WARNING_MESSAGE);			//Cảnh báo
		//}
		//JOptionPane.showMessageDialog(null, "Đã bị lỗi phần mềm", "Smile",JOptionPane.ERROR_MESSAGE); 			//Thông báo lỗi
		
		//Thông báo người dùng chọn sau khi báo lỗi
		//JOptionPane.showInternalConfirmDialog(null, "Bạn có muốn sửa chữa lập tức không?", "Smile", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//Thông báo người dùng nhập thông tin
		
		//String name = JOptionPane.showInputDialog("Nhập tên của bạn: ");
		//System.out.println("Hello "+ name);
	
		//Thiết kế theo ý bản thân
		String[] nutChon = {"No!","Thank you!","Yes! You are cute!"};
		
		ImageIcon icon = new ImageIcon("D:\\Adobe pts cc 2019\\Ảnh\\Icons\\icon2.png");
			
		
		JOptionPane.showOptionDialog(null, "Bạn thật tuyệt!",    //Thông tin
				"Thông điệp",  									 //Tiêu đề
				JOptionPane.YES_NO_CANCEL_OPTION,  				//Nút chọn
				JOptionPane.PLAIN_MESSAGE, 				//Kiểu thông báo đơn giản
				icon,				//Tự tạo icon
				nutChon,			//Tạo nút chọn theo ý bản thân
				0);    			//Thứ tự lần lượt cacs nút được chọn
		
		
	}

}
