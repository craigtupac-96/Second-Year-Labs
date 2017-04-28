/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawShapes extends JFrame implements ActionListener{
	private JLabel statusBar;
	private JPanel buttonPanel;
	private JButton rect, line, oval, arc, roundRect;
	private Point clicked = new Point();
	private Point released = new Point();
	private String shapeString = "Rectangle";
	public DrawShapes(String title) {
		super(title);
		setBackground(Color.WHITE);
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		
		// Adding the buttons
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(rect = new JButton("Rectangle"));
		rect.addActionListener(this);
		buttonPanel.add(oval = new JButton("Oval"));
		oval.addActionListener(this);
		buttonPanel.add(roundRect = new JButton("Rounded Rectangle"));
		roundRect.addActionListener(this);
		buttonPanel.add(line = new JButton("Line"));
		line.addActionListener(this);
		buttonPanel.add(arc = new JButton("Arc"));
		arc.addActionListener(this);
		add(buttonPanel, BorderLayout.NORTH);
		
		HandlerClass handler = new HandlerClass();
		addMouseListener(handler);
		addMouseMotionListener(handler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{
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
		// These are mouse motion events
		public void mouseDragged(MouseEvent event){
			statusBar.setText(String.format("Mouse at %d,%d", event.getX(), event.getY()));
		}
		public void mouseMoved(MouseEvent event){
			statusBar.setText(String.format("Mouse at %d,%d", event.getX(), event.getY()));
		}
	}
	
	 public void paint(Graphics g)
     {
		 super.paint(g);
         Graphics2D g2d = (Graphics2D) g;
         double width = released.getX() - clicked.getX();
         double height = released.getY() - clicked.getY();
         
         switch (shapeString) {
         case "Rectangle": {
             g2d.draw(new Rectangle2D.Double(clicked.getX(), clicked.getY(), width, height));
        	 break;
         }
         case "Oval": {
             g2d.draw(new Ellipse2D.Double(clicked.getX(), clicked.getY(), width, height));
        	 break;
         }
         case "Rounded Rectangle": {
             g2d.draw(new RoundRectangle2D.Double(clicked.getX(), clicked.getY(), width, height, 10, 10));
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

	@Override
	public void actionPerformed(ActionEvent action) {
		shapeString = action.getActionCommand(); // This gets the string name of the button
	}
}
