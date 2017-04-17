/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Align {
	private JTextField textField1;
	private JTextField textField2;
	JButton ok, cancel, help;
	JLabel label1, label2;
	JCheckBox checkBox1, checkBox2;
	// Defualt Constructor
	public Align(){
		JFrame frame = new JFrame("Align");
		frame.setBounds(100, 100, 355, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ok = new JButton("Ok");
		ok.setBounds(225, 50, 89, 23);
		frame.getContentPane().add(ok);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(225, 106, 89, 23);
		frame.getContentPane().add(cancel);
		
		help = new JButton("Help");
		help.setBounds(225, 163, 89, 23);
		frame.getContentPane().add(help);
		
		textField1 = new JTextField();
		textField1.setText("8");
		textField1.setBounds(149, 85, 43, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("8");
		textField2.setColumns(10);
		textField2.setBounds(149, 138, 43, 20);
		frame.getContentPane().add(textField2);
		
		label1 = new JLabel("X");
		label1.setForeground(Color.CYAN);
		label1.setBounds(135, 88, 15, 14);
		frame.getContentPane().add(label1);
		
		label2 = new JLabel("Y");
		label2.setForeground(Color.CYAN);
		label2.setBounds(135, 141, 15, 14);
		frame.getContentPane().add(label2);
		
		checkBox1 = new JCheckBox("Snap to grid");
		checkBox1.setBounds(17, 84, 97, 23);
		frame.getContentPane().add(checkBox1);
		
		checkBox2 = new JCheckBox("Show grid");
		checkBox2.setBounds(17, 137, 97, 23);
		frame.getContentPane().add(checkBox2);
		frame.setVisible(true);
	}
}
