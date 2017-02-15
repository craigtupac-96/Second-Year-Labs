/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ButtonTest extends Frame {
	Button button1;
	public ButtonTest(String title){
		super(title);
		button1 = new Button("1");
		setLayout( new FlowLayout() );
		add(button1);
		addWindowListener(new WindowCloser()); // Attach window listener
	}
}

