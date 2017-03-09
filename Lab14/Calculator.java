/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JTextField text = new JTextField();
	JTextField mem = new JTextField();
	JButton one, two, three, four, five, six, seven, eight, nine, zero,  
		dot, mult, div, plus, minus, equals, clear, memory, mClear, mPlus, mMin, mMult, mDiv;
	String textfield = "";
	String tempNumber = "";
	String answerString = "";         // to contain the answer
	String memoryNum = "";
	int dotCount = 0;
	boolean answerBool;
	ArrayList<String> numbers = new ArrayList<String>();
	ArrayList<String> operators = new ArrayList<String>();
	// Constructor
	public Calculator(){
		JFrame frame = new JFrame("Calculator");
		numbers.add(0, null);                       // initializing the arraylist
		
		// Textfield
		text.setBounds(11, 11, 284, 45);
		text.setForeground(Color.GREEN);
		text.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		// Number Buttons
		seven = new JButton("7");
		seven.setForeground(Color.GREEN);
		seven.setBackground(Color.DARK_GRAY);
		seven.setBounds(68, 121, 52, 45);
		frame.getContentPane().add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setForeground(Color.GREEN);
		eight.setBackground(Color.DARK_GRAY);
		eight.setBounds(125, 121, 52, 45);
		frame.getContentPane().add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setForeground(Color.GREEN);
		nine.setBackground(Color.DARK_GRAY);
		nine.setBounds(182, 121, 52, 45);
		frame.getContentPane().add(nine);
		nine.addActionListener(this);
		
		four = new JButton("4");
		four.setForeground(Color.GREEN);
		four.setBackground(Color.DARK_GRAY);
		four.setBounds(68, 177, 52, 45);
		frame.getContentPane().add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setForeground(Color.GREEN);
		five.setBackground(Color.DARK_GRAY);
		five.setBounds(125, 177, 52, 45);
		frame.getContentPane().add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setForeground(Color.GREEN);
		six.setBackground(Color.DARK_GRAY);
		six.setBounds(182, 177, 52, 45);
		frame.getContentPane().add(six);
		six.addActionListener(this);
		
		one = new JButton("1");
		one.setForeground(Color.GREEN);
		one.setBackground(Color.DARK_GRAY);
		one.setBounds(68, 233, 52, 45);
		frame.getContentPane().add(one);
		one.addActionListener(this);
		
		two = new JButton("2");
		two.setForeground(Color.GREEN);
		two.setBackground(Color.DARK_GRAY);
		two.setBounds(125, 233, 52, 45);
		frame.getContentPane().add(two);
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setForeground(Color.GREEN);
		three.setBackground(Color.DARK_GRAY);
		three.setBounds(182, 233, 52, 45);
		frame.getContentPane().add(three);
		three.addActionListener(this);

		// Operators
		div = new JButton("/");
		div.setForeground(Color.GREEN);
		div.setBackground(Color.DARK_GRAY);
		div.setBounds(239, 121, 52, 45);
		frame.getContentPane().add(div);
		div.addActionListener(this);
		
		mult = new JButton("*");
		mult.setForeground(Color.GREEN);
		mult.setBackground(Color.DARK_GRAY);
		mult.setBounds(239, 177, 52, 45);
		frame.getContentPane().add(mult);
		mult.addActionListener(this);
		
		minus = new JButton("-");
		minus.setForeground(Color.GREEN);
		minus.setBackground(Color.DARK_GRAY);
		minus.setBounds(239, 233, 52, 45);
		frame.getContentPane().add(minus);
		minus.addActionListener(this);
		
		plus = new JButton("+");
		plus.setForeground(Color.GREEN);
		plus.setBackground(Color.DARK_GRAY);
		plus.setBounds(239, 289, 52, 45);
		frame.getContentPane().add(plus);
		plus.addActionListener(this);

		// Extra Buttons
		equals = new JButton("=");
		equals.setForeground(Color.GREEN);
		equals.setBackground(Color.DARK_GRAY);
		equals.setBounds(182, 289, 52, 45);
		frame.getContentPane().add(equals);
		equals.addActionListener(this);
		
		dot = new JButton(".");
		dot.setForeground(Color.GREEN);
		dot.setBackground(Color.DARK_GRAY);
		dot.setBounds(125, 289, 52, 45);
		frame.getContentPane().add(dot);
		dot.addActionListener(this);
		
		zero = new JButton("0");
		zero.setForeground(Color.GREEN);
		zero.setBackground(Color.DARK_GRAY);
		zero.setBounds(68, 289, 52, 45);
		frame.getContentPane().add(zero);
		zero.addActionListener(this);
		
		clear = new JButton("C");
		clear.setForeground(Color.GREEN);
		clear.setBackground(Color.DARK_GRAY);
		clear.setBounds(11, 121, 52, 45);
		frame.getContentPane().add(clear);
		clear.addActionListener(this);
		
		memory = new JButton("M");
		memory.setForeground(Color.GREEN);
		memory.setBackground(Color.DARK_GRAY);
		memory.setBounds(11, 85, 52, 25);
		frame.getContentPane().add(memory);
		memory.addActionListener(this);
		
		mClear = new JButton("Mc");
		mClear.setForeground(Color.GREEN);
		mClear.setBackground(Color.DARK_GRAY);
		mClear.setBounds(11, 177, 52, 25);
		frame.getContentPane().add(mClear);
		mClear.addActionListener(this);
		
		mPlus = new JButton("M+");
		mPlus.setForeground(Color.GREEN);
		mPlus.setBackground(Color.DARK_GRAY);
		mPlus.setBounds(68, 85, 52, 25);
		frame.getContentPane().add(mPlus);
		mPlus.addActionListener(this);
		
		mMin = new JButton("M-");
		mMin.setForeground(Color.GREEN);
		mMin.setBackground(Color.DARK_GRAY);
		mMin.setBounds(125, 85, 52, 25);
		frame.getContentPane().add(mMin);
		mMin.addActionListener(this);
		
		mMult = new JButton("M*");
		mMult.setForeground(Color.GREEN);
		mMult.setBackground(Color.DARK_GRAY);
		mMult.setBounds(181, 85, 52, 25);
		frame.getContentPane().add(mMult);
		mMult.addActionListener(this);
		
		mDiv = new JButton("M/");
		mDiv.setForeground(Color.GREEN);
		mDiv.setBackground(Color.DARK_GRAY);
		mDiv.setBounds(239, 85, 52, 25);
		frame.getContentPane().add(mDiv);
		mDiv.addActionListener(this);
		
		// Memory textfield
		mem.setForeground(Color.GREEN);
		mem.setBackground(Color.DARK_GRAY);
		mem.setBounds(11, 309, 47, 25);
		frame.getContentPane().add(mem);
		mem.setColumns(10);
		
		JLabel label = new JLabel("Memory");
		label.setForeground(Color.GREEN);
		label.setBounds(11, 289, 47, 14);
		frame.getContentPane().add(label);
		
		frame.setBounds(100, 100, 320, 400);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		// This if statement will clear the textfield if any of these buttons are pressed after an answer 
		if(event.getSource() == one && answerBool || event.getSource() == two && answerBool || event.getSource() == three && answerBool || 
				event.getSource() == four && answerBool || event.getSource() == five && answerBool || event.getSource() == six && answerBool ||
				event.getSource() == seven && answerBool || event.getSource() == eight && answerBool || event.getSource() == nine && answerBool ||
				event.getSource() == zero && answerBool || event.getSource() == dot && answerBool || event.getSource() == memory && answerBool ||
				event.getSource() == mPlus && answerBool || event.getSource() == mMin && answerBool || event.getSource() == mMult && answerBool ||
				event.getSource() == mDiv && answerBool 
				){
			textfield = "";
			text.setText(textfield);
		}
		// Number Buttons
		if(event.getSource() == one){
			if (operators.isEmpty()){
				textfield += "";
				text.setText(textfield);
			}
			textfield += "1";
			text.setText(textfield);
			tempNumber += "1";
			answerBool = false;
		}
		else if(event.getSource() == two){
			textfield += "2";
			text.setText(textfield);
			tempNumber += "2";
			answerBool = false;
		}
		else if(event.getSource() == three){
			textfield += "3";
			text.setText(textfield);
			tempNumber += "3";
		}
		else if(event.getSource() == four){
			textfield += "4";
			text.setText(textfield);
			tempNumber += "4";
		}
		else if(event.getSource() == five){
			textfield += "5";
			text.setText(textfield);
			tempNumber += "5";
		}
		else if(event.getSource() == six){
			textfield += "6";
			text.setText(textfield);
			tempNumber += "6";
		}
		else if(event.getSource() == seven){
			textfield += "7";
			text.setText(textfield);
			tempNumber += "7";
		}
		else if(event.getSource() == eight){
			textfield += "8";
			text.setText(textfield);
			tempNumber += "8";
		}
		else if(event.getSource() == nine){
			textfield += "9";
			text.setText(textfield);
			tempNumber += "9";
		}
		else if(event.getSource() == zero){
			textfield += "0";
			text.setText(textfield);
			tempNumber += "0";
		}
		else if(event.getSource() == dot){
			dotCount++;
			if(dotCount == 1){
				textfield += ".";
				text.setText(textfield);
				tempNumber += ".";
			}
		}
		// Non Number Buttons
		else if(event.getSource() == clear){
			textfield = "";
			text.setText(textfield);
			tempNumber = "";
			numbers.clear();        // clearing the arraylists
			operators.clear();
			numbers.add(0, null);
			dotCount = 0;
		}
		else if(event.getSource() == plus && tempNumber != ""){
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, tempNumber);
				textfield += "+";
				text.setText(textfield);
				operators.add(0, tempNumber);
				operators.add("+");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(tempNumber);
				textfield += "+";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("+");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == minus && tempNumber != ""){  
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, tempNumber);
				textfield += "-";
				text.setText(textfield);
				operators.add(0, tempNumber);
				operators.add("-");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(tempNumber);
				textfield += "-";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("-");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == mult && tempNumber != ""){
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, tempNumber);
				textfield += "*";
				text.setText(textfield);
				operators.add(0, tempNumber);
				operators.add("*");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(tempNumber);
				textfield += "*";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("*");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == div && tempNumber != ""){
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, tempNumber);
				textfield += "/";
				text.setText(textfield);
				operators.add(0, tempNumber);
				operators.add("/");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(tempNumber);
				textfield += "/";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("/");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == memory && memoryNum == ""){    // The memory button
			if(tempNumber == ""){
				memoryNum = answerString;                // if there is no number entered the last answer will be store in memory
			}
			else{
				textfield = "";
				text.setText(textfield);
				memoryNum = tempNumber;
				tempNumber = "";
			}
			mem.setText(memoryNum);
			dotCount = 0;              // CLearing the dot count so the next number can contain a decimal	
		}
		else if(event.getSource() == mClear){         // Clear the memory
				memoryNum = "";
				mem.setText("");
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
		}
		else if(event.getSource() == mPlus &&  memoryNum != ""){                        // memory plus 
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, memoryNum);
				textfield += memoryNum + "+";
				text.setText(textfield);
				operators.add(0, memoryNum);
				operators.add("+");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(memoryNum);
				textfield += memoryNum + "+";
				text.setText(textfield);
				operators.add(memoryNum);
				operators.add("+");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == mMin &&  memoryNum != ""){                        // memory minus
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, memoryNum);
				textfield += memoryNum + "-";
				text.setText(textfield);
				operators.add(0, memoryNum);
				operators.add("-");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(memoryNum);
				textfield += memoryNum + "-";
				text.setText(textfield);
				operators.add(memoryNum);
				operators.add("-");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		else if(event.getSource() == mMult &&  memoryNum != ""){                        // memory mult
				if(numbers.get(0) == null){               // .get used to retrieve index
					numbers.remove(0);
					numbers.add(0, memoryNum);
					textfield += memoryNum + "*";
					text.setText(textfield);
					operators.add(0, memoryNum);
					operators.add("*");
					tempNumber = "";
					dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
				}
				else{
					numbers.add(memoryNum);
					textfield += memoryNum + "*";
					text.setText(textfield);
					operators.add(memoryNum);
					operators.add("*");
					tempNumber = "";
					dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
				}
		}
		else if(event.getSource() == mDiv &&  memoryNum != ""){                        // memory divide
			if(numbers.get(0) == null){               // .get used to retrieve index
				numbers.remove(0);
				numbers.add(0, memoryNum);
				textfield += memoryNum + "/";
				text.setText(textfield);
				operators.add(0, memoryNum);
				operators.add("/");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
			else{
				numbers.add(memoryNum);
				textfield += memoryNum + "/";
				text.setText(textfield);
				operators.add(memoryNum);
				operators.add("/");
				tempNumber = "";
				dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
			}
		}
		
		else if(event.getSource() == equals && tempNumber != ""){          // wont allow equals if the last button was an operator
					if(numbers.get(0) == null){               // .get used to retrieve index
					}
					else{
						numbers.add(tempNumber);
						operators.add(tempNumber);
						text.setText(textfield);
						String expression = "";             // clearing the expression to be calculated before the string is sent to the engine
						for(int index = 0; index < operators.size(); index++){
							expression += operators.get(index);
						}
						try {
							answerString = calculation(expression);     // This calls the method calculation and returns the answer as a string
							if(answerString.equals("Infinity")){
								textfield = "You can't divide by zero";
								text.setText(textfield);
							}
							else{
								textfield = answerString;
								text.setText(textfield);
							}
						} catch (ScriptException e){
							e.printStackTrace();
						}
						// Reset everything
						tempNumber = "";
						numbers.clear();                // clearing the arraylists
						operators.clear();
						numbers.add(0, null);
						dotCount = 0;              // CLearing the dot count so the next number can contain a decimal
						answerBool = true;
					}
		}
	} // end actionPerformed
	
	public String calculation(String input) throws ScriptException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
		Object result = engine.eval(input);
		String strAnswer = result.toString();            // holds the string representation of the object
		System.out.println(strAnswer);// + "\n" + intAnswer + "\n" + dAnswer);           // testing ------------------
		
		return strAnswer;
	}
}

/********************************
 * Add decimal later
 * 
 * parse int string to suit
 * if statement to change operators
 * 
 * if last button pressed was =     use bool     (second action listener)
 * if last button was operator
 * 
 * using 2 arraylists
 * 
 */
//Double test = Double.parseDouble(answerString);;
//System.out.println(test);   // get rid         // testing --------------------
//System.out.println(expression);          // for testing purposes
//System.out.println(numbers + "\t" + operators);                // testing --------------------
