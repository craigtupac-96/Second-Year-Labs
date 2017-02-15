/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.*;
import java.awt.event.*;

// Driver class
public class MyColours 
{
  	public static void main(String[] args) 
  	{
  		Frame f = new ChangeColourFrame("Craig's Change Color");
    	f.setSize(350, 200);
    	f.setVisible(true);
  	}
}

// Frame class
class ChangeColourFrame extends Frame 
{
	private static final long serialVersionUID = 1L; // WTF is this???

	public ChangeColourFrame(String title) 
	{
	    // Set title, layout, and background color
	    super(title);
	    setLayout(new FlowLayout());
	    setBackground(Color.gray);
	
	    // Create button listener
	    ButtonListener listener = new ButtonListener();
	
	    // Add "Lighter" button to frame and attach listener
	    Button b = new Button("Lighter");
	    add(b);
	    b.addActionListener(listener);
	
	    // Add "Darker" button to frame and attach listener
	    b = new Button("Darker");
	    add(b);
	    b.addActionListener(listener);
	    
	    b = new Button("Green");
	    add(b);
	    b.addActionListener(listener);
	    
	    b = new Button("Red");
	    add(b);
	    b.addActionListener(listener);
	    
	    b = new Button("Blue");
	    add(b);
	    b.addActionListener(listener);
	
	    // Attach window listener
	    addWindowListener(new WindowCloser());
  	}
  	
  	// Listener for both buttons
  	class ButtonListener implements ActionListener 
  	{
    	public void actionPerformed(ActionEvent evt) 
    	{
      		Color currentBackground = getBackground();
      		String buttonLabel = evt.getActionCommand();

      		// Test label on button and change background color
			if (buttonLabel.equals("Lighter")){
		    	setBackground(currentBackground.brighter());
			}
		    else if(buttonLabel.equals("Darker")){
		    	setBackground(currentBackground.darker());
		    }
		    else if(buttonLabel.equals("Green")){
		    	setBackground(Color.green);
		    }
		    else if(buttonLabel.equals("Red")){
		    	setBackground(Color.red);
		    }
		    else if(buttonLabel.equals("Blue")){
		    	setBackground(Color.blue);
		    }
    	}
  	}

  	// Listener for window
  	class WindowCloser extends WindowAdapter 
  	{
    	public void windowClosing(WindowEvent evt) 
    	{
      		System.exit(0);
    	}
  	}
}
