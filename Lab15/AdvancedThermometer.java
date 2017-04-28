/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AdvancedThermometer implements ActionListener{
	private JTextField inputText;
	private JTextField resultText;
	String[] temperature1 = new String[] {"Celcius", "Fahrenheit", "Kelvin"};
	String[] temperature2 = new String[] {"Fahrenheit", "Celcius", "Kelvin"};
	JComboBox<String> comboOption1;
	JComboBox<String> comboOption2;
	JButton convert = new JButton("Convert");
	String option1;
	String option2;
	double inputValue;
	double resultValue;
	double cel, fahr, kel;     // temperatures used
	// Default Constructor
	public AdvancedThermometer(){
		// New Frame
		JFrame frame = new JFrame("Temperature Converter");
		
		// Labels
		JLabel from = new JLabel("From");
		from.setForeground(Color.GREEN);
		from.setBounds(40, 23, 46, 14);
		frame.getContentPane().add(from);
		
		JLabel to = new JLabel("To");
		to.setForeground(Color.GREEN);
		to.setBounds(195, 22, 46, 14);
		frame.getContentPane().add(to);
		
		JLabel input = new JLabel("Input");
		input.setForeground(Color.GREEN);
		input.setBounds(40, 89, 46, 14);
		frame.getContentPane().add(input);
		
		JLabel result = new JLabel("Result");
		result.setForeground(Color.GREEN);
		result.setBounds(195, 89, 46, 14);
		frame.getContentPane().add(result);
		frame.setVisible(true);
		
		// Combo Boxes
		comboOption1 = new JComboBox<String>(temperature1);
		comboOption1.setBounds(40, 47, 105, 20);
		frame.getContentPane().add(comboOption1);
		
		comboOption2 = new JComboBox<String>(temperature2);
		comboOption2.setBounds(195, 47, 105, 20);
		frame.getContentPane().add(comboOption2);
		
		// Text boxes
		inputText = new JTextField();
		inputText.setBounds(40, 114, 86, 20);
		frame.getContentPane().add(inputText);
		inputText.setColumns(10);
		
		resultText = new JTextField();
		resultText.setBounds(195, 114, 86, 20);
		frame.getContentPane().add(resultText);
		resultText.setColumns(10);
		
		// Convert button
		convert.setBounds(40, 179, 89, 23);
		frame.getContentPane().add(convert);
		convert.addActionListener(this);         // Forgot to implement ActionListener at first
		
		// Frame setup
		frame.setBounds(100, 100, 355, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		// Setting the temperatures's
		Object from = comboOption1.getSelectedItem();
		option1 = from.toString();
		Object to = comboOption2.getSelectedItem();
		option2 = to.toString();
        // Converting the input to type Double
        try{
    	   inputValue = Double.parseDouble(inputText.getText());
        } catch (NumberFormatException nfe) {     
	     JOptionPane.showMessageDialog(null,"Input must be a number.");
        }
        // Converting from celcius
        if(option1.equals("Celcius")){
        	if(option2.equals("Fahrenheit")){
        		resultValue = (inputValue * 9 / 5.0) + 32;
        	}
        	if(option2.equals("Kelvin")){
        		resultValue = inputValue + 273.15;
        	}
        	if(option2.equals("Celcius")){
        		resultValue = inputValue;
        	}
        }
        // converting from fahrenheit
        if(option1.equals("Fahrenheit")){
        	if(option2.equals("Celcius")){
        		resultValue = (inputValue -32) * 5 / 9;
        	}
        	if(option2.equals("Kelvin")){
        		resultValue = (inputValue + 459.67) * 5 / 9;
        	}
        	if(option2.equals("Fahrenheit")){
        		resultValue = inputValue;
        	}
        }
        // converting from kelvin
        if(option1.equals("Kelvin")){
        	if(option2.equals("Fahrenheit")){
        		resultValue = (inputValue * 9 / 5.0) - 459.67;
        	}
        	if(option2.equals("Celcius")){
        		resultValue = inputValue - 273.15;
        	}
        	if(option2.equals("Kelvin")){
        		resultValue = inputValue;
        	}
        }
        resultText.setText(String.valueOf((resultValue)));
	}
}
