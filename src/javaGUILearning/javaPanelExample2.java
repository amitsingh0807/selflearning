package javaGUILearning;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class javaPanelExample2 extends JFrame {
	public static void main(String[] args) {
		new javaPanelExample2();
	}
	
	public javaPanelExample2() {
		this.setTitle("My Picture");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		ImageIcon pic1 = new ImageIcon("C://Users/amitsin/Pictures/javaImage.jpg");
		panel1.add(new JLabel(pic1));
		this.add(panel1);
		this.pack();
		this.setVisible(true);
		
	}
	

}
