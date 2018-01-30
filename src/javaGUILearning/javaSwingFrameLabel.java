package javaGUILearning;

import javax.swing.*;

public class javaSwingFrameLabel {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Hello World Swing Example");
		JLabel label1 = new JLabel("Hello World");
		frame.getContentPane().add(label1);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
	}

}
