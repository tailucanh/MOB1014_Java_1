package GUI_Jav;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main_GUI {  

	public static void main(String[] args) {
		// Tạo cửa sổ GUI
		//jFrame = một cửa sổ GUI để thêm các thành phần vào
		
		/*
		JFrame frame = new JFrame();    //Tạo khung
		frame.setSize(500,500);			//Đặt kích thước chiều dài và rộng của khung
		frame.setResizable(false);		//Ngăn khung hình bị thay đổi kích thước
		frame.setTitle("Smile...");     //Đặt tiêu đề cho khung		
		frame.setVisible(true);        // hiển thị khung
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //Thoát hẳn khỏi GUI
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);          // Ẩn khi đóng GUI
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);    //Ngăn k cho đóng
		
		
		ImageIcon image = new ImageIcon("D:\\Visual Studio Code\\MyLove\\img\\img5.jpg");   //Tạo icon Icon GUI
		frame.setIconImage(image.getImage());             //Thay đổi biểu tượng khung
  	    //frame.getContentPane().setBackground(Color.pink);         //Thay đổi màu nền
		frame.getContentPane().setBackground(new Color(0xe681d5));
	
		//MyFrame myFrame = new MyFrame();  Gọi lớp 
		*/

		
		//---------------------------------------------------------------------------------------//
		//JLabel = vùng hiển thị GUI cho một chuỗi văn bản, hình ảnh hoặc cả hai
		
		
		ImageIcon img = new ImageIcon("D:\\Visual Studio Code\\Smile-Thongtin\\smile3.png"); 
		Border border =  BorderFactory.createLineBorder(new Color(0x27c91e),4);   //Đường viền nhãn 
		
		
		JLabel label = new JLabel();      
		label.setText("Hello Tài Smile");     
		label.setIcon(img);
		// Vd:căn văn bản ở giữa và trên hình ảnh
		label.setHorizontalTextPosition(JLabel.CENTER); //đặt văn bản TRÁI, TRUNG TÂM, PHẢI của hình ảnh
		label.setVerticalTextPosition(JLabel.TOP);      // đặt văn bản ĐẦU, TRUNG TÂM, ĐÁY của hình ảnh
		label.setForeground(new Color(0xd60641));       //Màu văn bản
		label.setFont(new Font("Smile",Font.ITALIC,50));   //Sửa font chữ văn bản
		label.setIconTextGap(100);							//Khoảng cách của văn bản và hình ảnh theo số âm và dương
		label.setBackground(new Color(0x020e0f));   //chỉnh màu nền nhãn dán
		label.setOpaque(true);  					 //chỉnh màu full màn hình GUI
		label.setBorder(border);    					//Thiết lập đường viền
		label.setVerticalAlignment(JLabel.CENTER); 			 // xét chiều dọc của biểu tượng + văn bản trong nhãn
		label.setHorizontalAlignment(JLabel.CENTER);  			 // xét chiều ngang của biểu tượng + văn bản trong nhãn
		//label.setBounds(100, 100, 300, 300);    			// đặt vị trí x, y cố định trong khung cũng như kích thước nhãn thủ công
		
		
		JFrame frame = new JFrame();   
		//frame.setSize(500,500);	 //Đặt kích thước thủ công		
		frame.setTitle("Smile...");            
		//frame.setLayout(null);
		frame.setVisible(true);

		frame.add(label);  //Thêm label vào GUI
		frame.pack();			//Tự điều chỉnh phù hợp với nhãn và văn bản -xoá thủ cônng
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		
		//---------------------------------------------------------------------------------------//
		//  JPanel = một thành phần GUI có chức năng như một thùng chứa để chứa các thành phần khác
		
		/*
		ImageIcon icon = new ImageIcon("D:\\Adobe pts cc 2019\\Ảnh\\imgs.jpg");
		
		JLabel label = new JLabel();
		label.setText("Hi Smile");
		label.setIcon(icon); 
		//label.setVerticalAlignment(JLabel.BOTTOM);    //Chiều dọc
		//label.setHorizontalAlignment(JLabel.CENTER);  //Chiều ngang
		label.setBounds(100, 100, 200, 150); 					//Căn icon thủ công
	
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(new Color(0xc9168e));
		pinkPanel.setBounds(0, 0, 250, 250);               //Căn vị trí 
		pinkPanel.setLayout(null);
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0x23bfde));
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0x1dcc3a));
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(null);          //Chỉng khung
		
		
		JFrame frame = new JFrame();   
		frame.setSize(700,700);		
		frame.setTitle("Smile...");            
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
		
		greenPanel.add(label);         //Thêm icon vào mảng
		
		
		frame.add(pinkPanel);
		frame.add(bluePanel); 
		frame.add(greenPanel);
		*/
		//---------------------------------------------------------------------------------------//
		// JButton = một nút thực hiện một hành động khi được nhấp vào
		
		//MyFrame frame = new MyFrame();
	}

}
