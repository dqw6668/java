package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Components {
	public static void main(String[] args) {
JFrame frame=new JFrame("MY COMPONENTS");
JButton jbtok=new JButton("OK");
frame.add(jbtok);
frame.setSize(400,300);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
	}

}
