package GUI_Jav;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyJtextfield extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;
	
	//Tạo hộp thoại riêng 
	MyJtextfield(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Sumbit");    //Tạo nút
		button.addActionListener(this);
		
		
		//Tạo thành phần hộp văn bản
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,45));    //Tạo hộp khung
		textField.setFont(new Font("Consolas",Font.PLAIN,35));  //Cỡ văn bản trong hộp khung
		textField.setForeground(new Color(0xec03fc));		//Màu nền văn bản
		textField.setBackground(new Color(0xf0f5b0));     //Màu nền hộp khung
		textField.setText("username");         //Gới ý người nhập
		//textField.setEditable(false);            //Không thể chỉnh sửa văn bản
		
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);	
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Hello "+textField.getText());   //hiện ra màn hình console
			button.setEnabled(false);          // chỉ cho nhập 1 lần
			textField.setEditable(false);  
		}
		
	}

}
