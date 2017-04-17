/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ColorSelect {
	String[] colors = new String[] {"Red", "Blue", "Green", "Yellow"};
	public ColorSelect(){
		JFrame frame = new JFrame("Color Select");
		frame.setBounds(100, 100, 355, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>(colors);
		comboBox.setBounds(10, 11, 319, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox checkBack = new JCheckBox("background");
		checkBack.setBounds(50, 91, 97, 23);
		frame.getContentPane().add(checkBack);
		
		JCheckBox checkFore = new JCheckBox("foreground");
		checkFore.setBounds(195, 91, 97, 23);
		frame.getContentPane().add(checkFore);
		
		JButton ok = new JButton("Ok");
		ok.setBounds(58, 179, 89, 23);
		frame.getContentPane().add(ok);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(195, 179, 89, 23);
		frame.getContentPane().add(cancel);
		frame.setVisible(true);
	}
}
