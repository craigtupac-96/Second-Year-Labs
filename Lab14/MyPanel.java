/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class MyPanel extends Frame{
	Panel pan1;
	Panel pan2;
	public MyPanel(String title){
		super(title);
		pan1 = new Panel();
		pan2 = new Panel();
		Button but1 = new Button("test1");
		add(but1);
		Button but2 = new Button("test2");
		add(but2);
		Button but3 = new Button("test3");
		add(but3);
		Button but4 = new Button("test4");
		add(but4);

		addWindowListener(new WindowCloser());
	}
}
