/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator extends Frame{
	// Constructor
	public Calculator(String title){
	super(title);
		
	// Attach window listener
	addWindowListener(new WindowCloser());
	}
}


