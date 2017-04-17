/*
 * Author: Craig Lawlor
 */
package Lab14;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiConversionTool implements ActionListener{
	JButton currency, temperature, weight, length;
	JFrame frame;
	// currency converter variables
	JTextField inputText;
	JTextField resultText;
	JButton convert = new JButton("Convert");
	JButton test = new JButton("Test");
	String option1;
	String option2;
	String conversionType;
	double inputValue;
	double resultValue;
	double euro, dollar, pound, dirham;     // currencies used
	double cel, fahr;    // temps used
	double kg, poun, stone, gram;   // weights used
	double cent, mil, metre, inch;  // lengths used
	DecimalFormat decPlaces = new DecimalFormat("#.##"); // to format doubles to 2 decimal places
	// Combobox variables/arrays
	JComboBox<String> comboOption1;
	JComboBox<String> comboOption2;
	String[] currency1 = new String[] {"Euro", "US Dollar", "British Pound", "UAE Dirham"};
	String[] currency2 = new String[] {"US Dollar", "Euro", "British Pound", "UAE Dirham"};
	String[] temperature1 = new String[] {"Celcius", "Fahrenheit"};
	String[] temperature2 = new String[] {"Fahrenheit", "Celcius"};
	String[] weight1 = new String[] {"Kilogram", "Pound", "Stone", "Gram"};
	String[] weight2 = new String[] {"Pound", "Kilogram", "Stone", "Gram"};
	String[] length1 = new String[] {"Centimetre", "Millimetre", "Metre", "Inch"};
	String[] length2 = new String[] {"Millimetre", "Centimetre", "Metre", "Inch"};
	DefaultComboBoxModel<String> cur1 = new DefaultComboBoxModel<String>(currency1);
	DefaultComboBoxModel<String> cur2 = new DefaultComboBoxModel<String>(currency2);
	DefaultComboBoxModel<String> temp1 = new DefaultComboBoxModel<String>(temperature1);
	DefaultComboBoxModel<String> temp2 = new DefaultComboBoxModel<String>(temperature2);
	DefaultComboBoxModel<String> wei1 = new DefaultComboBoxModel<String>(weight1);
	DefaultComboBoxModel<String> wei2 = new DefaultComboBoxModel<String>(weight2);
	DefaultComboBoxModel<String> len1 = new DefaultComboBoxModel<String>(length1);
	DefaultComboBoxModel<String> len2 = new DefaultComboBoxModel<String>(length2);
	// Default Constructor
	public MultiConversionTool(){
		frame = new JFrame("Multi Conversion Tool");
		
		currency = new JButton("Currency");
		currency.setForeground(Color.GREEN);
		currency.setBackground(Color.DARK_GRAY);
		currency.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(currency);
		currency.addActionListener(this);
		
		temperature = new JButton("Temperature");
		temperature.setForeground(Color.GREEN);
		temperature.setBackground(Color.DARK_GRAY);
		temperature.setBounds(109, 11, 119, 23);
		frame.getContentPane().add(temperature);
		temperature.addActionListener(this);
		
		weight = new JButton("Weight");
		weight.setForeground(Color.GREEN);
		weight.setBackground(Color.DARK_GRAY);
		weight.setBounds(238, 11, 89, 23);
		frame.getContentPane().add(weight);
		weight.addActionListener(this);
		
		length = new JButton("Length");
		length.setForeground(Color.GREEN);
		length.setBackground(Color.DARK_GRAY);
		length.setBounds(347, 11, 89, 23);
		frame.getContentPane().add(length);
		length.addActionListener(this);
		
		// Labels
		JLabel from = new JLabel("From");
		from.setForeground(Color.GREEN);
		from.setBounds(40, 50, 46, 14);
		frame.getContentPane().add(from);
		
		JLabel to = new JLabel("To");
		to.setForeground(Color.GREEN);
		to.setBounds(195, 50, 46, 14);
		frame.getContentPane().add(to);
		
		JLabel input = new JLabel("Input");
		input.setForeground(Color.GREEN);
		input.setBounds(40, 115, 46, 14);
		frame.getContentPane().add(input);
		
		JLabel result = new JLabel("Result");
		result.setForeground(Color.GREEN);
		result.setBounds(195, 115, 46, 14);
		frame.getContentPane().add(result);
		frame.setVisible(true);
		
		// Combo Boxes
		comboOption1 = new JComboBox<String>();
		comboOption1.setForeground(Color.GREEN);
		comboOption1.setBackground(Color.DARK_GRAY);
		comboOption1.setBounds(40, 70, 105, 20);
		frame.getContentPane().add(comboOption1);
		
		
		comboOption2 = new JComboBox<String>();
		comboOption2.setForeground(Color.GREEN);
		comboOption2.setBackground(Color.DARK_GRAY);
		comboOption2.setBounds(195, 70, 105, 20);
		frame.getContentPane().add(comboOption2);
		
		// Text boxes
		inputText = new JTextField();
		inputText.setForeground(Color.GREEN);
		inputText.setBackground(Color.DARK_GRAY);
		inputText.setBounds(40, 135, 86, 20);
		frame.getContentPane().add(inputText);
		inputText.setColumns(10);
		
		resultText = new JTextField();
		resultText.setForeground(Color.GREEN);
		resultText.setBackground(Color.DARK_GRAY);
		resultText.setBounds(195, 135, 86, 20);
		frame.getContentPane().add(resultText);
		resultText.setColumns(10);
		
		// Convert button
		convert.setBounds(40, 200, 89, 23);
		convert.setForeground(Color.GREEN);
		convert.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(convert);
		convert.addActionListener(this);
		
		// Frame setup
		frame.setBounds(100, 100, 463, 313);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	} // end constructor
	
	public void currencyConverter(){
		comboOption1.setModel(cur1);
		comboOption2.setModel(cur2);
		conversionType = "Currency";
		currency.setForeground(Color.BLACK);
		currency.setBackground(Color.GREEN);
		temperature.setForeground(Color.GREEN);
		temperature.setBackground(Color.DARK_GRAY);
		weight.setForeground(Color.GREEN);
		weight.setBackground(Color.DARK_GRAY);
		length.setForeground(Color.GREEN);
		length.setBackground(Color.DARK_GRAY);
	}
	public void temperatureConverter(){
		comboOption1.setModel(temp1);
		comboOption2.setModel(temp2);
		conversionType = "Temperature";
		currency.setForeground(Color.GREEN);
		currency.setBackground(Color.DARK_GRAY);
		temperature.setForeground(Color.BLACK);
		temperature.setBackground(Color.GREEN);
		weight.setForeground(Color.GREEN);
		weight.setBackground(Color.DARK_GRAY);
		length.setForeground(Color.GREEN);
		length.setBackground(Color.DARK_GRAY);
	}
	public void weightConverter(){
		comboOption1.setModel(wei1);
		comboOption2.setModel(wei2);
		conversionType = "Weight";
		currency.setForeground(Color.GREEN);
		currency.setBackground(Color.DARK_GRAY);
		temperature.setForeground(Color.GREEN);
		temperature.setBackground(Color.DARK_GRAY);
		weight.setForeground(Color.BLACK);
		weight.setBackground(Color.GREEN);
		length.setForeground(Color.GREEN);
		length.setBackground(Color.DARK_GRAY);
	}
	public void lengthConverter(){
		comboOption1.setModel(len1);
		comboOption2.setModel(len2);
		conversionType = "Length";
		currency.setForeground(Color.GREEN);
		currency.setBackground(Color.DARK_GRAY);
		temperature.setForeground(Color.GREEN);
		temperature.setBackground(Color.DARK_GRAY);
		weight.setForeground(Color.GREEN);
		weight.setBackground(Color.DARK_GRAY);
		length.setForeground(Color.BLACK);
		length.setBackground(Color.GREEN);
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == currency){
			inputText.setText("");     // Reset text boxes when a new button is clicked
			resultText.setText("");
			currencyConverter();
		}
		if(event.getSource() == temperature){
			inputText.setText("");     // Reset text boxes when a new button is clicked
			resultText.setText("");
			temperatureConverter();
		}
		if(event.getSource() == weight){
			inputText.setText("");     // Reset text boxes when a new button is clicked
			resultText.setText("");
			weightConverter();
		}
		if(event.getSource() == length){
			inputText.setText("");     // Reset text boxes when a new button is clicked
			resultText.setText("");
			lengthConverter();
		}
		if(event.getSource() == convert){
			// Setting the dropdown options
			Object from = comboOption1.getSelectedItem();
	        option1 = from.toString();
	        Object to = comboOption2.getSelectedItem();
	        option2 = to.toString();
	        // Currency conversion
	        if(conversionType.equals("Currency")){
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
	        } // end Currency conversion
	        // Temperature conversion
	        if(conversionType.equals("Temperature")){
	        	try{
	        		inputValue = Double.parseDouble(inputText.getText());
		        } catch (NumberFormatException nfe) {     
		     	     JOptionPane.showMessageDialog(null,"Input must be a number.");
		             }
	        	if(option1.equals("Celcius")){
	        		fahr = 33.8;
	        		if(option2.equals("Fahrenheit")){
	        			resultValue = (inputValue * 9 / 5.0) + 32;  
	        		}
	        		else{
	        			resultValue = inputValue;
	        		}
	        	}
	        	if(option1.equals("Fahrenheit")){
	        		cel = -17.22;
	        		if(option2.equals("Celcius")){
	        			resultValue = (inputValue -32) * 5 / 9;
	        		}
	        		else{
	        			resultValue = inputValue;
	        		}
	        }
	        DecimalFormat decPlaces = new DecimalFormat("#.######"); // to format doubles to 6 decimal places
	        resultText.setText(String.valueOf(decPlaces.format(resultValue)));
	        } // end Temperature conversion
	        // Weight conversion
	        if(conversionType.equals("Weight")){
	        	try{
	        		inputValue = Double.parseDouble(inputText.getText());
		        } catch (NumberFormatException nfe) {     
		     	     JOptionPane.showMessageDialog(null,"Input must be a number.");
		             }
	        	if(option1.equals("Kilogram")){
	        		kg = 1;
	        		poun = 2.20462;
	        		stone = 0.157473;
	        		gram = 1000;
	        		if(option2.equals("Pound")){
	        			resultValue = inputValue * poun;
	        		}
	        		if(option2.equals("Stone")){
	        			resultValue = inputValue * stone;
	        		}
	        		if(option2.equals("Gram")){
	        			resultValue = inputValue * gram;
	        		}
	        		if(option2.equals("Kilogram")){
	        			resultValue = inputValue * kg;
	        		}
	        	}
	        	if(option1.equals("Pound")){
	        		kg = 0.453592;
	        		poun = 1;
	        		stone = 0.0714286;
	        		gram = 453.592;
	        		if(option2.equals("Pound")){
	        			resultValue = inputValue * poun;
	        		}
	        		if(option2.equals("Stone")){
	        			resultValue = inputValue * stone;
	        		}
	        		if(option2.equals("Gram")){
	        			resultValue = inputValue * gram;
	        		}
	        		if(option2.equals("Kilogram")){
	        			resultValue = inputValue * kg;
	        		}
	        	}
	        	if(option1.equals("Stone")){
	        		kg = 6.35029;
	        		poun = 14;
	        		stone = 1;
	        		gram = 6350.29;
	        		if(option2.equals("Pound")){
	        			resultValue = inputValue * poun;
	        		}
	        		if(option2.equals("Stone")){
	        			resultValue = inputValue * stone;
	        		}
	        		if(option2.equals("Gram")){
	        			resultValue = inputValue * gram;
	        		}
	        		if(option2.equals("Kilogram")){
	        			resultValue = inputValue * kg;
	        		}
	        	}
	        	if(option1.equals("Gram")){
	        		kg = 0.001;
	        		poun = 0.00220462;
	        		stone = 0.000157473;
	        		gram = 1;
	        		if(option2.equals("Pound")){
	        			resultValue = inputValue * poun;
	        		}
	        		if(option2.equals("Stone")){
	        			resultValue = inputValue * stone;
	        		}
	        		if(option2.equals("Gram")){
	        			resultValue = inputValue * gram;
	        		}
	        		if(option2.equals("Kilogram")){
	        			resultValue = inputValue * kg;
	        		}
	        	}
	        	DecimalFormat decPlaces = new DecimalFormat("#.######"); // to format doubles 6 to decimal places
		        resultText.setText(String.valueOf(decPlaces.format(resultValue)));
	        } // end weight conversion
	        // Length conversion
	        if(conversionType.equals("Length")){
	        	try{
	        		inputValue = Double.parseDouble(inputText.getText());
		        } catch (NumberFormatException nfe) {     
		     	     JOptionPane.showMessageDialog(null,"Input must be a number.");
		             }
	        	if(option1.equals("Centimetre")){
	        		cent = 1;
	        		mil = 10;
	        		metre = 0.01;
	        		inch = 0.393701;
	        		if(option2.equals("Millimetre")){
	        			resultValue = inputValue * mil;
	        		}
	        		if(option2.equals("Centimetre")){
	        			resultValue = inputValue * cent;
	        		}
	        		if(option2.equals("Metre")){
	        			resultValue = inputValue * metre;
	        		}
	        		if(option2.equals("Inch")){
	        			resultValue = inputValue * inch;
	        		}
	        	}
	        	if(option1.equals("Millimetre")){
	        		cent = 0.1;
	        		mil = 1;
	        		metre = 0.001;
	        		inch = 0.0393701;
	        		if(option2.equals("Centimetre")){
	        			resultValue = inputValue * cent;
	        		}
	        		if(option2.equals("Millimetre")){
	        			resultValue = inputValue * mil;
	        		}
	        		if(option2.equals("Metre")){
	        			resultValue = inputValue * metre;
	        		}
	        		if(option2.equals("Inch")){
	        			resultValue = inputValue * inch;
	        		}
	        	}
	        	if(option1.equals("Metre")){
	        		cent = 100;
	        		mil = 1000;
	        		metre = 1;
	        		inch = 39.3701;
	        		if(option2.equals("Centimetre")){
	        			resultValue = inputValue * cent;
	        		}
	        		if(option2.equals("Millimetre")){
	        			resultValue = inputValue * mil;
	        		}
	        		if(option2.equals("Metre")){
	        			resultValue = inputValue * metre;
	        		}
	        		if(option2.equals("Inch")){
	        			resultValue = inputValue * inch;
	        		}
	        	}
	        	if(option1.equals("Inch")){
	        		cent = 2.54;
	        		mil = 25.4;
	        		metre = 0.0254;
	        		inch = 1;
	        		if(option2.equals("Centimetre")){
	        			resultValue = inputValue * cent;
	        		}
	        		if(option2.equals("Millimetre")){
	        			resultValue = inputValue * mil;
	        		}
	        		if(option2.equals("Metre")){
	        			resultValue = inputValue * metre;
	        		}
	        		if(option2.equals("Inch")){
	        			resultValue = inputValue * inch;
	        		}
	        	}
	        	DecimalFormat decPlaces = new DecimalFormat("#.######"); // to format doubles 6 to decimal places
		        resultText.setText(String.valueOf(decPlaces.format(resultValue)));
	        } // end length conversion
		}
	}
}
