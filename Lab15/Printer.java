/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Printer {
	JButton ok, cancel, setup, help;
	JLabel label1, label2;
	JTextArea textArea1, textArea2, textArea3;
	JRadioButton radio1, radio2, radio3;
	JCheckBox check1, check2, check3, check4;
	// Default Constructor
	public Printer(){
		JFrame frame = new JFrame("Printer");
		frame.setBounds(100, 100, 480, 300);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ok = new JButton("Ok");
		ok.setBounds(365, 29, 89, 23);
		frame.getContentPane().add(ok);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(365, 80, 89, 23);
		frame.getContentPane().add(cancel);
		
		setup = new JButton("Setup...");
		setup.setBounds(365, 130, 89, 23);
		frame.getContentPane().add(setup);
		
		help = new JButton("Help");
		help.setBounds(365, 180, 89, 23);
		frame.getContentPane().add(help);
		
		label1 = new JLabel("Printer: MyPrinter");
		label1.setForeground(Color.CYAN);
		label1.setBounds(10, 11, 103, 14);
		frame.getContentPane().add(label1);
		
		label2 = new JLabel("Print Quality:");
		label1.setForeground(Color.CYAN);
		label1.setBounds(10, 225, 70, 14);
		frame.getContentPane().add(label1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(85, 222, 56, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox check1 = new JCheckBox("Print to file");
		check1.setBounds(208, 221, 83, 23);
		frame.getContentPane().add(check1);
		
		JCheckBox check2 = new JCheckBox("Image");
		check2.setBounds(100, 54, 56, 23);
		frame.getContentPane().add(check2);
		
		JCheckBox check3 = new JCheckBox("Text");
		check3.setBounds(100, 102, 57, 23);
		frame.getContentPane().add(check3);
		
		JCheckBox check4 = new JCheckBox("Code");
		check4.setBounds(100, 150, 57, 23);
		frame.getContentPane().add(check4);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(23, 53, 70, 120);
		frame.getContentPane().add(textArea1);
		
		textArea2 = new JTextArea();
		textArea2.setBounds(164, 53, 39, 120);
		frame.getContentPane().add(textArea2);
		
		textArea3 = new JTextArea();
		textArea3.setBounds(285, 53, 70, 120);
		frame.getContentPane().add(textArea3);
		
		radio1 = new JRadioButton("Selection");
		radio1.setBounds(209, 54, 70, 23);
		frame.getContentPane().add(radio1);
		
		radio2 = new JRadioButton("All");
		radio2.setBounds(208, 102, 70, 23);
		frame.getContentPane().add(radio2);
		
		radio3 = new JRadioButton("Applet");
		radio3.setBounds(208, 150, 70, 23);
		frame.getContentPane().add(radio3);
		frame.setVisible(true);
	}
}
