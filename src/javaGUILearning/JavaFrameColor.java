package javaGUILearning;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class JavaFrameColor {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Color Test");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.BLUE);
		frame1.setPreferredSize(new Dimension(400,300));
		frame1.pack();
		frame1.setVisible(true);
	}

}
