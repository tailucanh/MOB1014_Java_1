package GUI_Jav;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {

	public static void main(String[] args) {
		// Layout Manager = Xác định bố cục tự nhiên cho các thành phần trong vùng chứa 
		// GridLayout = đặt các thành phần trong một lưới ô.Mỗi thành phần lấy tất cả không gian có sẵn trong ô của nó, 
		// và mỗi ô có cùng kích thước.
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(4,4,5,5));   //Chia đều kích thước cho từng ô hàng - cột - lề ngang- lề dọc
		
		
		//Tạo các nút kích thước như nhau sẽ bị ẩn nhau
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		//nếu số nút lẻ với số hàng cột khai báo, máy sẽ tự căn chỉnh
		
		frame.setVisible(true); 
		
		
		
	}

}
