package GUI_Jav;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public  class MyFrame extends JFrame implements ActionListener{ //Phương thúc thực hiện hành động
	//Dùng JFrame làm lớp cha
	
	JButton button;
	JLabel label;
	
	MyFrame() {
		/*
		this.setSize(500,500);			//Đặt kích thước chiều dài và rộng của khung
		this.setResizable(false);		//Ngăn khung hình bị thay đổi kích thước
		this.setTitle("Smile...");     //Đặt tiêu đề cho khung		
		this.setVisible(true);        // hiển thị khung
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //Thoát hẳn khỏi GUI
		//this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);          // Ẩn khi đóng GUI
		//this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    //Ngăn k cho đóng
		
		
		ImageIcon image = new ImageIcon("D:\\Visual Studio Code\\MyLove\\img\\img5.jpg");   //Tạo icon Icon GUI
		this.setIconImage(image.getImage());             //Thay đổi biểu tượng khung
		//this.getContentPane().setBackground(Color.pink);         //Thay đổi màu nền
		this.getContentPane().setBackground(new Color(123,5,65)); 
		*/
		
		// JButton = một nút thực hiện một hành động khi được nhấp vào
		
		ImageIcon img = new ImageIcon("D:\\Visual Studio Code\\Smile-Thongtin\\smile3.png");
		
		//Thêm icon sau khi nhấp nút
		label = new JLabel();
		label.setIcon(img);
		label.setBounds(50,300,500,450);
		label.setVisible(false);      //Không hiển thị ban đầu
		  
		
		button = new JButton();
		button.setBounds(150, 150, 250, 100);
		button.addActionListener(this);     //Kích hoạt hiển thị khi bấm
		//button.addActionListener(e -> System.out.println("Poooooooo."));     //C2: gọi trực tiếp
		button.setText("I am Smile");
		button.setFocusable(false);
		button.setFont(new Font("Comic sans",Font.BOLD,25));
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());  //Viền hiệu ứng
		
		//button.setEnabled(false);  //Vô hiệu hoá nút
		

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
		this.setSize(500,500);			
		this.setLayout(null);   	
		this.setVisible(true);  
		this.add(button);
		this.add(label);
				
	}

	
	public void actionPerformed(ActionEvent e) {
		// Phương thức thực hiện hành động
		if(e.getSource() == button) {    //Khai báo button toàn cục
			//System.out.println("Poooooo");
			//button.setEnabled(false);   //Nhấp 1 lần rồi vô hiệu hoá
			label.setVisible(true);    //Sau khi nhấn thì hiện icon
		}
	}
	
	
}
