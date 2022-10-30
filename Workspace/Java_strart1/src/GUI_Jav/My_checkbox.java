package GUI_Jav;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class My_checkbox extends JFrame implements ActionListener{
	
	JCheckBox checkBox;
	JButton button;
	ImageIcon icon;
	ImageIcon checkIcon;
	
	My_checkbox(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		icon = new ImageIcon("D:\\Adobe pts cc 2019\\Ảnh\\Icons\\icon4.png");
		checkIcon = new ImageIcon("D:\\Adobe pts cc 2019\\Ảnh\\Icons\\icon5.png");
		
		
		button = new JButton();
		button.setText("Sumbit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'am not a robot.");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN,30));
		checkBox.setIcon(icon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);	
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected()); 
		}
		
	} 
	
	
}
