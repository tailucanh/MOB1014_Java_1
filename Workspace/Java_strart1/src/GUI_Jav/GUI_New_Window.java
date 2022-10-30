package GUI_Jav;



import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_New_Window {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("HelloSmile");
	
	GUI_New_Window(){
		label.setBounds(100,50,200,200);
		label.setFont(new Font("Times New Roman", Font.PLAIN,30));
		
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
}
