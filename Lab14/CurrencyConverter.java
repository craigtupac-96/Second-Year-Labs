/*
 * Author: Craig Lawlor
 */
package Lab14;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class CurrencyConverter implements ActionListener{
	private JTextField inputText;
	private JTextField resultText;
	String[] currency1 = new String[] {"Euro", "US Dollar", "British Pound", "UAE Dirham"};
	String[] currency2 = new String[] {"US Dollar", "Euro", "British Pound", "UAE Dirham"};
	JComboBox<String> comboOption1;
	JComboBox<String> comboOption2;
	JButton convert = new JButton("Convert");
	String option1;
	String option2;
	double inputValue;
	double resultValue;
	double euro, dollar, pound, dirham;     // currencies used
	DecimalFormat decPlaces = new DecimalFormat("#.##"); // to format doubles to 2 decimal places
	public CurrencyConverter(){
		// New Frame
		JFrame frame = new JFrame("Currency Converter");
		
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
		comboOption1 = new JComboBox<String>(currency1);
		comboOption1.setBounds(40, 47, 105, 20);
		frame.getContentPane().add(comboOption1);
		
		comboOption2 = new JComboBox<String>(currency2);
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
		// Setting the currency's
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
        if(option1.equals("Euro")){
         	euro = 1;
        	dollar = 1.06;
         	pound = 0.85;
         	dirham = 3.90;
         	if(option2.equals("US Dollar")){
         		resultValue = inputValue * dollar;
         	}
         	if(option2.equals("Euro")){
         		resultValue = inputValue * euro;
         	}
         	if(option2.equals("British Pound")){
         		resultValue = inputValue * pound;
         	}
         	if(option2.equals("UAE Dirham")){
         		resultValue = inputValue * dirham;
         	}
         } // end euro
         if(option1.equals("US Dollar")){
         	euro = 0.94;
         	dollar = 1;
         	pound = 0.80;
         	dirham = 3.67;
         	if(option2.equals("Euro")){
         		resultValue = inputValue * dollar;
         	}
         	if(option2.equals("US Dollar")){
         		resultValue = inputValue * dollar;
         	}
         	if(option2.equals("British Pound")){
         		resultValue = inputValue * pound;
         	}
         	if(option2.equals("UAE Dirham")){
         		resultValue = inputValue * dirham;
         	}
        } // end dollar
        if(option1.equals("British Pound")){
          	dollar = 1.25;
          	euro = 1.18;
          	pound = 1;
          	dirham = 4.60;
          	if(option2.equals("US Dollar")){
          		resultValue = inputValue * dollar;
          	}
          	if(option2.equals("Euro")){
          		resultValue = inputValue * pound;
          	}
          	if(option2.equals("British Pound")){
          		resultValue = inputValue * pound;
          	}
          	if(option2.equals("UAE Dirham")){
          		resultValue = inputValue * dirham;
          	}
         } // end pound
         if(option1.equals("UAE Dirham")){
          	dollar = 0.27;
          	pound = 0.22;
          	euro = 0.26;
          	dirham = 1;
          	if(option2.equals("US Dollar")){
          		resultValue = inputValue * dollar;
          	}
          	if(option2.equals("British Pound")){
          		resultValue = inputValue * pound;
          	}
          	if(option2.equals("Euro")){
          		resultValue = inputValue * dirham;
          	}
          	if(option2.equals("UAE Dirham")){
          		resultValue = inputValue * dirham;
          	}
          } // end dirham
        DecimalFormat decPlaces = new DecimalFormat("#.##"); // to format doubles to 2 decimal places
    	resultText.setText(String.valueOf(decPlaces.format(resultValue)));
	} // end actionListener
}









