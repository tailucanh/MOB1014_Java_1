package GUI_Jav;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Layered_Pane {

	public static void main(String[] args) {
		// JLayeredPane = Swing container cung cấp 
		// kích thước thứ ba cho các thành phần định vị
		// ex. độ sâu, chỉ số Z
		//Có các thành phần xếp chồng nhau 
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150,200,200);
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
		/* Xắp xếp thứ tự thành phần chồng nhau
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);  
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		*/
		
		//Cách 2:
		layeredPane.add(label1, Integer.valueOf(2));
		layeredPane.add(label2, Integer.valueOf(0));  
		layeredPane.add(label3, Integer.valueOf(1));
		
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
