package javaGUILearning;
import javax.swing.*;

public class javaDialog1 {
	public static void main(String [] args) {
		JFrame frame2 = new JFrame("Dialog Test");
		JDialog dialog1 = new JDialog(frame2,"New Dialog");
		
		frame2.pack();
		
		//dialog1.pack();
		dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog1.setVisible(true);
	
		
	}
	

}
