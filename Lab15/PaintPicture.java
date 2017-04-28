/*
 * Author: Craig Lawlor
 * 
 * Incomplete------
 */
package Lab15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Lab10.SavingsAccount;


public class PaintPicture extends JFrame implements ActionListener{
	private JPanel buttonPanel;
	private JButton rect, line, oval, arc, roundRect, clear;
	private Point clicked = new Point();
	private Point released = new Point();
	private String shapeString = "Rectangle";
	PaintPictureObject temp = new PaintPictureObject();
	private PaintPictureObject[] shapes = new PaintPictureObject[100];
	int objectArrayCounter = 0;
	Color tempColor ; //= Color.black;
	Boolean filled;
	JComboBox<String> comboBox;
	String[] colours = {"Black", "Red", "Yellow", "Blue", "Green"};
	String myColor = "Black";
	JRadioButton fill;
	Graphics2D g2d;
	public PaintPicture(String title){
		super(title);
		
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
		
		comboListener thecombolistener = new comboListener(); 
		comboBox = new JComboBox<String>(colours);
		comboBox.addActionListener(thecombolistener);
		buttonPanel.add(comboBox);  

		fill = new JRadioButton("Filled");
		fill.setSelected(false);
		buttonPanel.add(fill);
		add(buttonPanel, BorderLayout.NORTH);
		clear = new JButton("Clear");
		// anonymous class for actionlistener (very nice)
		clear.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						objectArrayCounter = 0;
						shapes = new PaintPictureObject[100];
						clicked = new Point();
						released = new Point();
						shapeString = "Rectangle";
						repaint();
					}
			
				});  // ); needed for anonymous
		buttonPanel.add(clear);
		

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
		}
		public void mouseMoved(MouseEvent event){
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent action) {
		shapeString = action.getActionCommand(); // This gets the string name of the button
	}
	
	// paint method
	public void paint(Graphics g)
    {
		 super.paint(g);
        g2d = (Graphics2D) g;
        double width = released.getX() - clicked.getX();
        double height = released.getY() - clicked.getY();
        
        // Switch statement to set the values in the object array index
        switch (shapeString) {
        case "Rectangle": {
        	colorSet();
        	if(fill.isSelected()){
        		new Rectangle2D.Double(clicked.getX(), clicked.getY(), width, height);
        		filled = true;
        	}
        	else{
        		new Rectangle2D.Double(clicked.getX(), clicked.getY(), width, height);
        		filled = false;
        	}
        	// Sending to the object constructor
        	temp = new PaintPictureObject("Rectangle", clicked.getX(), clicked.getY(), width, height, g2d.getColor(), filled);
       	 break;
        }
        case "Oval": {
        	colorSet();
        	if(fill.isSelected()){
        		new Ellipse2D.Double(clicked.getX(), clicked.getY(), width, height);
        		filled = true;
        	}
        	else{
        		new Ellipse2D.Double(clicked.getX(), clicked.getY(), width, height);
        		filled = false;
        	}
        	// Sending to the object constructor
        	temp = new PaintPictureObject("Oval", clicked.getX(), clicked.getY(), width, height, g2d.getColor(), filled);
       	 break;
        }
        case "Rounded Rectangle": {
        	colorSet();
        	if(fill.isSelected()){
        		filled = true;
        	}
        	else{
        		filled = false;
        	}
        	// Sending to the object constructor
        	temp = new PaintPictureObject("Rounded Rectangle", clicked.getX(), clicked.getY(), width, height, g2d.getColor(), filled);
       	 break;
        }
        case "Line": {
        	colorSet();
        	if(fill.isSelected()){
        		new Line2D.Double(clicked.getX(), clicked.getY(), released.getX(), released.getY());
        		filled = true;
        	}
        	else{
        		new Line2D.Double(clicked.getX(), clicked.getY(), released.getX(), released.getY());
        		filled = false;
        	}
        	// Sending to the object constructor
        	temp = new PaintPictureObject("Line", clicked.getX(), clicked.getY(), released.getX(), released.getY(), g2d.getColor(), filled);
       	 break;
        }
        case "Arc": {
        	colorSet();
        	if(fill.isSelected()){
        		new Arc2D.Double(clicked.getX(), clicked.getY(), width, height, 90, 35, Arc2D.OPEN);
        		filled = true;
        	}
        	else{
        		new Arc2D.Double(clicked.getX(), clicked.getY(), width, height, 90, 35, Arc2D.OPEN);
        	}
        	// Sending to the object constructor
        	temp = new PaintPictureObject("Arc", clicked.getX(), clicked.getY(), width, height, g2d.getColor(), filled);
       	 break;
        }
        default: ;
         break;
        }
        // add all the items to the object array
        shapes[objectArrayCounter] = temp;
    	objectArrayCounter++;
    	
    	// For loop to produce each shape in the array
    	for(int index = 0; index < objectArrayCounter; index++){
    		
    		switch (shapes[index].shapeType()) {
            case "Rectangle": {
            	g2d.setColor(shapes[index].objectColor());
            	if(shapes[index].filled()){
            		Rectangle2D rect = new Rectangle2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height());
            		g2d.fill(rect);
            	}
            	else{
            		g2d.draw(new Rectangle2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height()));
            	}
           	 break;
            }
            case "Oval": {
            	g2d.setColor(shapes[index].objectColor());
            	if(shapes[index].filled()){
            		Ellipse2D oval = new Ellipse2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height());
            		g2d.fill(oval);
            	}
            	else{
            		g2d.draw(new Ellipse2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height()));
            	}
           	 break;
            }
            case "Rounded Rectangle": {
            	g2d.setColor(shapes[index].objectColor());
            	if(shapes[index].filled()){
            		RoundRectangle2D round = new RoundRectangle2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height(), 20, 20);
            		g2d.fill(round);
            	}
            	else{
            		g2d.draw(new RoundRectangle2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height(), 20, 20));
            	}
           	 break;
            }
            case "Line": {
            	g2d.setColor(shapes[index].objectColor());
            	g2d.draw(new Line2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height()));
           	 break;
            }
            case "Arc": {
            	g2d.setColor(shapes[index].objectColor());
            	if(shapes[index].filled()){
            		Arc2D arc = new Arc2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height(), 90, 35, Arc2D.OPEN);
            		g2d.fill(arc);
            	}
            	else{
            		g2d.draw(new Arc2D.Double(shapes[index].clickX(), shapes[index].clickY(), shapes[index].width(), shapes[index].height(), 90, 35, Arc2D.OPEN));
            	}
           	 break;
            }
            default: ;
             break;
            }
    	}
    }
	
	public void colorSet(){
		switch (myColor) {
	        case "Black": {
	            g2d.setColor(Color.BLACK);
	       	 break;
	        }
	        case "Red": {
	        	g2d.setColor(Color.RED);
		     break;
	        }
	        case "Yellow": {
	        	g2d.setColor(Color.YELLOW);
		     break;
	        }  
	        case "Blue": {
	        	g2d.setColor(Color.BLUE);
		     break;
	        }   
	        case "Green": {
	        	g2d.setColor(Color.GREEN);
	         break;
	        }
	        default: ;
	        break;    
		}
	}
	

	 class comboListener implements ActionListener
	 {
		@Override
		public void actionPerformed(ActionEvent comboEvent) {
			Object from = comboBox.getSelectedItem();
	        myColor = from.toString();   // getting the string and changing it to upper case
	        
	        switch (myColor) {
		        case "Black": {
		            g2d.setColor(Color.BLACK);
		       	 break;
		        }
		        case "Red": {
		        	g2d.setColor(Color.RED);
			       	 break;
		        }
		        case "Yellow": {
		        	g2d.setColor(Color.YELLOW);
			       	 break;
		        }  
		        case "Blue": {
		        	g2d.setColor(Color.BLUE);
			       	 break;
		        }   
		        case "Green": {
		        	g2d.setColor(Color.GREEN);
		        	break;
		        }
		        default: ;
		        break;    
	        }
		}
	 }
}
