/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BasicThermometer implements ActionListener { // forgot to implement ActionListener again...
	private JTextField textField;
	JLabel celOutput;
	JButton button;
	double fahr;
	double cel;
	String output;
	public BasicThermometer(){
		JFrame frame = new JFrame("Fahrenheit to Celcius Converter");

		
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		textField.setForeground(Color.BLACK);
		textField.setBounds(91, 54, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel enterPromt = new JLabel("Enter Fahrenheit");
		enterPromt.setForeground(Color.ORANGE);
		enterPromt.setBounds(91, 30, 86, 14);
		frame.getContentPane().add(enterPromt);
		
		celOutput = new JLabel("Celcius: ");
		celOutput.setForeground(Color.ORANGE);
		celOutput.setBounds(91, 125, 141, 14);
		frame.getContentPane().add(celOutput);
		
		button = new JButton("Convert");
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(new Color(255, 200, 0));
		button.setBounds(91, 203, 89, 23);
		frame.getContentPane().add(button);
		button.addActionListener(this);
		
		frame.setBounds(100, 100, 300, 300);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		fahr = Double.parseDouble(textField.getText());
		cel = (fahr -32) * 5 / 9;
		output = "Celcius: " + cel;
		celOutput.setText(output);
	}
}
