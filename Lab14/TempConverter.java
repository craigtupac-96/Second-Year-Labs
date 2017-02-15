/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.*;
import java.awt.event.*;
//import jpb.*;

// Driver class
public class TempConverter {
  public static void main(String[] args) {
    Frame frame = 
      new ConvertTempFrame("Temperature Conversion");
    frame.setSize(200, 75);
    frame.setLocation(500,400);
    frame.setVisible(true);
  }
}
// Frame class
class ConvertTempFrame extends Frame {
	private static final long serialVersionUID = 1L;
private TextField fahrenField = new TextField();
  private TextField celsiusField = new TextField();

  // Constructor
  public ConvertTempFrame(String title) {
    // Set title for frame and choose layout
    super(title);
    setLayout(new GridLayout(2, 2));

    // Add Fahrenheit label and text field to frame; attach
    // listener to text field
    add(new Label("Fahrenheit"));
    add(fahrenField);
    fahrenField.addActionListener(new FahrenheitListener());
    // Add Celsius label and text field to frame; attach
    // listener to text field
    add(new Label("Celsius"));
    add(celsiusField);
    celsiusField.addActionListener(new CelsiusListener());

    // Attach window listener
    addWindowListener(new WindowCloser());
  }

  // Listener for fahrenField
  class FahrenheitListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      String fahrenheitString = fahrenField.getText();
      double fahrenheit = Double.parseDouble(fahrenheitString);
      double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
      celsius = Math.rint(celsius * 100.0) / 100.0;	// The print method returns the integer that 
      												// is closest in value to the argument.
      celsiusField.setText(celsius + "");
    }
  }
  // Listener for celsiusField
  class CelsiusListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
      String celsiusString = celsiusField.getText();
      double celsius = Double.parseDouble(celsiusString);
      double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
      fahrenheit = Math.rint(fahrenheit * 100.0) / 100.0; 	// The rint method returns the integer that 
      														// is closest in value to the argument.
      fahrenField.setText(fahrenheit + "");
    }
  }

  // Listener for window
  class WindowCloser extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
      System.exit(0);
    }
  }
}
