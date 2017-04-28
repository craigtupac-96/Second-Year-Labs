/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawRect extends JFrame{
	private JPanel drawPanel;
	private JLabel statusBar;
	Point clicked = new Point();
	Point released = new Point();
	
	public DrawRect(String title) {
		super(title);
		
		drawPanel = new JPanel();
		drawPanel.setBackground(Color.WHITE);
		add(drawPanel, BorderLayout.CENTER);       // adding to the JFrame
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		drawPanel.addMouseListener(handler);
		drawPanel.addMouseMotionListener(handler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			statusBar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			//statusBar.setText("You pressed down the mouse");
			clicked.setLocation(event.getX(), event.getY());
			System.out.println(clicked.getX() + ", " + clicked.getY());
		}
		public void mouseReleased(MouseEvent event){
			//statusBar.setText("You released the button");
			released.setLocation(event.getX(), event.getY());
			repaint();
		}
		public void mouseEntered(MouseEvent event){
			/*statusBar.setText("You entered the area");
			drawPanel.setBackground(Color.RED);*/
		}
		public void mouseExited(MouseEvent event){
			/*statusBar.setText("The mouse has left the window");
			drawPanel.setBackground(Color.WHITE);*/
		}
		// These are mouse motion events
		public void mouseDragged(MouseEvent event){
		//	statusBar.setText("Your are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event){
		//	statusBar.setText("You moved the mouse");
		}
	}
	
	 public void paint(Graphics g)
     {
		 super.paint(g);
         Graphics2D g2d = (Graphics2D) g;
         double width = released.getX() - clicked.getX();
         double height = released.getY() - clicked.getY();
         Rectangle2D.Double rect = new Rectangle2D.Double(clicked.getX(), clicked.getY(), width, height);
         g2d.draw(rect);
         double area = width * height;
         statusBar.setText("Area: " + area + "");
     }
}
