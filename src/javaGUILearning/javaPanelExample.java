package javaGUILearning;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class javaPanelExample {
	public static void main(String [] args) {
		ImagePanel panel1 = new ImagePanel(new ImageIcon("C://Users/amitsin/Pictures/javaImage.jpg").getImage());
		
		JFrame frame1 = new JFrame();
		frame1.setTitle("What the hell");
		frame1.getContentPane().add(panel1);
		frame1.pack();
		frame1.setVisible(true);
		
		}

}

class ImagePanel extends JPanel{
	private Image img;
	public ImagePanel(String img) {
		this(new ImageIcon(img).getImage());
		this.setName("My ImagePanel");
		this.setBackground(Color.BLUE);
	}
	
	public ImagePanel(Image img) {
		this.img = img;
		Dimension size = new Dimension((img.getWidth(null))/2, (img.getHeight(null))/2);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
				
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null);
	}
}