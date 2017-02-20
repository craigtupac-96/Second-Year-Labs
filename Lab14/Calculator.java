/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JTextField text = new JTextField();
	JButton one, two, three, four, five, six, seven, eight, nine, zero,  
		dot, mult, div, plus, minus, equals, clear, memory, answer;
	String textfield = "";
	String tempNumber = "";
	int sum;            // for the sum of calculations
	double ans;            // to store the sum after calculation for reuse
	ArrayList numbers = new ArrayList();
	ArrayList operators = new ArrayList();
	// Constructor
	public Calculator(){
		JFrame frame = new JFrame("Calculator");
		numbers.add(0, null);                       // initializing the arraylist
		
		// Textfield
		text.setBounds(10, 11, 284, 34);
		text.setForeground(Color.GREEN);
		text.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		// Number Buttons
		seven = new JButton("7");
		seven.setForeground(Color.GREEN);
		seven.setBackground(Color.DARK_GRAY);
		seven.setBounds(75, 106, 45, 45);
		frame.getContentPane().add(seven);
		seven.addActionListener(this);
		
		eight = new JButton("8");
		eight.setForeground(Color.GREEN);
		eight.setBackground(Color.DARK_GRAY);
		eight.setBounds(130, 106, 45, 45);
		frame.getContentPane().add(eight);
		eight.addActionListener(this);
		
		nine = new JButton("9");
		nine.setForeground(Color.GREEN);
		nine.setBackground(Color.DARK_GRAY);
		nine.setBounds(185, 106, 45, 45);
		frame.getContentPane().add(nine);
		nine.addActionListener(this);
		
		four = new JButton("4");
		four.setForeground(Color.GREEN);
		four.setBackground(Color.DARK_GRAY);
		four.setBounds(75, 162, 45, 45);
		frame.getContentPane().add(four);
		four.addActionListener(this);
		
		five = new JButton("5");
		five.setForeground(Color.GREEN);
		five.setBackground(Color.DARK_GRAY);
		five.setBounds(130, 162, 45, 45);
		frame.getContentPane().add(five);
		five.addActionListener(this);
		
		six = new JButton("6");
		six.setForeground(Color.GREEN);
		six.setBackground(Color.DARK_GRAY);
		six.setBounds(185, 162, 45, 45);
		frame.getContentPane().add(six);
		six.addActionListener(this);
		
		one = new JButton("1");
		one.setForeground(Color.GREEN);
		one.setBackground(Color.DARK_GRAY);
		one.setBounds(75, 218, 45, 45);
		frame.getContentPane().add(one);
		one.addActionListener(this);
		
		two = new JButton("2");
		two.setForeground(Color.GREEN);
		two.setBackground(Color.DARK_GRAY);
		two.setBounds(130, 218, 45, 45);
		frame.getContentPane().add(two);
		two.addActionListener(this);
		
		three = new JButton("3");
		three.setForeground(Color.GREEN);
		three.setBackground(Color.DARK_GRAY);
		three.setBounds(185, 218, 45, 45);
		frame.getContentPane().add(three);
		three.addActionListener(this);

		// Operators
		div = new JButton("/");
		div.setForeground(Color.GREEN);
		div.setBackground(Color.DARK_GRAY);
		div.setBounds(240, 106, 45, 45);
		frame.getContentPane().add(div);
		div.addActionListener(this);
		
		mult = new JButton("*");
		mult.setForeground(Color.GREEN);
		mult.setBackground(Color.DARK_GRAY);
		mult.setBounds(240, 162, 45, 45);
		frame.getContentPane().add(mult);
		mult.addActionListener(this);
		
		minus = new JButton("-");
		minus.setForeground(Color.GREEN);
		minus.setBackground(Color.DARK_GRAY);
		minus.setBounds(240, 218, 45, 45);
		frame.getContentPane().add(minus);
		minus.addActionListener(this);
		
		plus = new JButton("+");
		plus.setForeground(Color.GREEN);
		plus.setBackground(Color.DARK_GRAY);
		plus.setBounds(240, 274, 45, 45);
		frame.getContentPane().add(plus);
		plus.addActionListener(this);

		// Extra Buttons
		equals = new JButton("=");
		equals.setForeground(Color.GREEN);
		equals.setBackground(Color.DARK_GRAY);
		equals.setBounds(185, 274, 45, 45);
		frame.getContentPane().add(equals);
		equals.addActionListener(this);
		
		dot = new JButton(".");
		dot.setForeground(Color.GREEN);
		dot.setBackground(Color.DARK_GRAY);
		dot.setBounds(130, 274, 45, 45);
		frame.getContentPane().add(dot);
		
		zero = new JButton("0");
		zero.setForeground(Color.GREEN);
		zero.setBackground(Color.DARK_GRAY);
		zero.setBounds(75, 274, 45, 45);
		frame.getContentPane().add(zero);
		zero.addActionListener(this);
		
		clear = new JButton("C");
		clear.setForeground(Color.GREEN);
		clear.setBackground(Color.DARK_GRAY);
		clear.setBounds(20, 106, 45, 45);
		frame.getContentPane().add(clear);
		clear.addActionListener(this);
		
		memory = new JButton("Memory");
		memory.setForeground(Color.GREEN);
		memory.setBackground(Color.DARK_GRAY);
		memory.setBounds(20, 67, 85, 28);
		frame.getContentPane().add(memory);
		
		answer = new JButton("Answer");
		answer.setForeground(Color.GREEN);
		answer.setBackground(Color.DARK_GRAY);
		answer.setBounds(115, 67, 85, 28);
		frame.getContentPane().add(answer);
		answer.addActionListener(this);
		
		
		frame.setBounds(100, 100, 320, 400);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		// Number Buttons
		if(event.getSource() == one){
			textfield += "1";
			text.setText(textfield);
			tempNumber += "1";
		}
		else if(event.getSource() == two){
			textfield += "2";
			text.setText(textfield);
			tempNumber += "2";
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
		// Non Number Buttons
		else if(event.getSource() == clear){
			textfield = "";
			text.setText(textfield);
			tempNumber = "";
			numbers.clear();        // clearing the arraylists
			operators.clear();
			numbers.add(0, null);
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
			}
			else{
				numbers.add(tempNumber);
				textfield += "+";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("+");
				tempNumber = "";
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
			}
			else{
				numbers.add(tempNumber);
				textfield += "-";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("-");
				tempNumber = "";
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
			}
			else{
				numbers.add(tempNumber);
				textfield += "*";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("*");
				tempNumber = "";
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
			}
			else{
				numbers.add(tempNumber);
				textfield += "/";
				text.setText(textfield);
				operators.add(tempNumber);
				operators.add("/");
				tempNumber = "";
			}
		}
		else if(event.getSource() == equals){
			if(numbers.get(0) == null){               // .get used to retrieve index
			}
			else{
				numbers.add(tempNumber);
				operators.add(tempNumber);
				System.out.println(numbers + "\t" + operators);
				textfield = "Answer will be here";
				text.setText(textfield);
				String expression = "";
				for(int index = 0; index < operators.size(); index++){
					expression += operators.get(index);
				}
				System.out.println(expression);          // for testing purposes
				try {
					String ans = calculation(expression);
					Double test = Double.parseDouble(ans);;
					System.out.println(test);
					textfield = ans;               
				} catch (ScriptException e){
					e.printStackTrace();
				}
				// Reset everything
				tempNumber = "";
				numbers.clear();             // clearing the arraylists
				operators.clear();
				numbers.add(0, null);
			}
		}
	} // end actionPerformed
	
	public String calculation(String input) throws ScriptException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
		Object result = engine.eval(input);
		String strAnswer = result.toString();            // holds the string representation of the object
		System.out.println(strAnswer);// + "\n" + intAnswer + "\n" + dAnswer);
		
		return strAnswer;
		 
		 
		 
		 
		/*ScriptEngineManager mgr = new ScriptEngineManager();             // Didnt work  
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");        
	    return ((Double) engine.eval(input));*/
	    //return new BigDecimal(engine.eval(input).toString()).intValueExact();
	}
}

/********************************
 * Add decimal later
 * use an array like a stack to push and pop values
 * parse int string to suit
 * if statement to change operators
 * using 2 arraylists
 * Try beanshell
 */
