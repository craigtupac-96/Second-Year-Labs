/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventShapes extends JFrame {
	private JLabel statusBar;
	private Point clicked = new Point();
	private Point released = new Point();
	private String shapeString = "Rectangle";
	public KeyEventShapes(String title) {
		super(title);
		setBackground(Color.WHITE);
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		addMouseListener(handler);
		
		KeyHandler keyHandle = new KeyHandler();
		addKeyListener(keyHandle);
	}
	
	private class HandlerClass implements MouseListener{
		public void mouseClicked(MouseEvent event){
		}
		public void mousePressed(MouseEvent event){
			clicked.setLocation(event.getX(), event.getY());
		}
		public void mouseReleased(MouseEvent event){
			released.setLocation(event.getX(), event.getY());
			repaint();
		}
		public void mouseEntered(MouseEvent event){
		}
		public void mouseExited(MouseEvent event){
		}	
	}
	
	// Key Handler Class
	private class KeyHandler implements KeyListener{
		// key pressed method
		@Override
		public void keyPressed(KeyEvent key) {
			char shapeChar = key.getKeyChar();
			
			switch(shapeChar){
				case 'r': {
					shapeString = "Rectangle";
					statusBar.setText("Rectangle");
					break;
				}
				case 'o': {
					shapeString = "Oval";
					statusBar.setText("Oval");
					break;
				}
				case 'c': {
					shapeString = "Circle";
					statusBar.setText("Circle");
					break;
				}
				case 'l': {
					shapeString = "Line";
					statusBar.setText("Line");
					break;
				}
				case 'a': {
					shapeString = "Arc";
					statusBar.setText("Arc");
					break;
				}
				default: ;
		        break;
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	 public void paint(Graphics g)
     {
		 super.paint(g);
         Graphics2D g2d = (Graphics2D) g;
         double width = released.getX() - clicked.getX();
         double height = released.getY() - clicked.getY();
         
         // switch statement to decide which shape to draw
         switch (shapeString) {
	         case "Rectangle": {
	        	 g2d.draw(new Rectangle2D.Double(clicked.getX(), clicked.getY(), width, height));
	        	 break;
	         }
	         case "Oval": {
	        	 g2d.draw(new Ellipse2D.Double(clicked.getX(), clicked.getY(), width, height));
	        	 break;
	         }
	         case "Circle": {
	        	 g2d.draw(new Ellipse2D.Double(clicked.getX(), clicked.getY(), width, width));  // using n ellipse with the width and height set to width
	        	 break;
	         }
	         case "Line": {
	        	 g2d.draw(new Line2D.Double(clicked.getX(), clicked.getY(), released.getX(), released.getY()));
	        	 break;
	         }
	         case "Arc": {
	        	 g2d.draw(new Arc2D.Double(clicked.getX(), clicked.getY(), width, height, 90, 35, Arc2D.OPEN));
	        	 break;
	         }
	         default: ;
	         break;
         }
     }
}
