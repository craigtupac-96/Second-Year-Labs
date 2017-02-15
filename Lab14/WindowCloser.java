/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowCloser extends WindowAdapter {
	public void windowClosing(WindowEvent evt) {
		System.exit(0);
	}
}
