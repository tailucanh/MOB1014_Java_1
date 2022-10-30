package GUI_Jav;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_Window implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("New Window");
	
	GUI_Window(){
		
		button.setBounds(100,150,200,100);      //Tạo nút
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}

	//Tạo câu lệnh mở GUI khác sau khi nhấn nút
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			frame.dispose();    //Đóng trang sau khi nhấp và hiển thị trang sau		
			GUI_New_Window new_Window = new GUI_New_Window();
		}
		
		
		
	}
	

}
