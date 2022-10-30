package GUI_Jav;


import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Paint;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_Layout {

	public static void main(String[] args) {
		// Layout Manager = Xác định bố cục tự nhiên cho các thành phần trong vùng chứa
		// FlowLayout = đặt các thành phần trong một hàng, có kích thước theo kích thước ưa thích của chúng.
		// Nếu không gian ngang trong vùng chứa quá nhỏ, lớp FlowLayout sử dụng hàng có sẵn tiếp theo.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,5)); //Căn lề và khoảng cách ngang, dọc
	
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,250));   //Kích thước cho bảng
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		
		
		//JButton button1 = new JButton();
		//button.add(button1);
		
		//Tạo nút cách ngắn gọn
		panel.add(new Button("1"));
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("4"));
		panel.add(new Button("5"));
		panel.add(new Button("6"));
		panel.add(new Button("7"));
		panel.add(new Button("8"));
		panel.add(new Button("9"));
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
