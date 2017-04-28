/*
 * Author: Craig Lawlor
 */
package Lab15;

import javax.swing.JFrame;

public class PaintPictureDriver {

	public static void main(String[] args) {
		JFrame frame = new PaintPicture("Paint Application");
		frame.setSize(650, 530);
		frame.setLocation(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
