/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;

import javax.swing.JFrame;

public class DrawShapesDriver {
	public static void main(String[] args) {
		JFrame frame = new DrawShapes("Draw Shapes");
	    frame.setSize(600, 530);
	    frame.setLocation(400, 150);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}