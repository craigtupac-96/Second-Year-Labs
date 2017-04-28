package Lab15;

import javax.swing.JFrame;

public class KeyEventShapesDriver {
	public static void main(String[] args) {
		JFrame frame = new KeyEventShapes("Draw Shapes");
		frame.setSize(600, 530);
		frame.setLocation(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
