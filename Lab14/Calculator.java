/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab14;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
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
		dot, mult, div, plus, minus, equals, clear, answer;
	String textfield = "";
	String tempNumber = "";
	int sum;            // for the sum of calculations
	int ans;            // to store the sum after calculation for reuse
	ArrayList numbers = new ArrayList();
	ArrayList operators = new ArrayList();
	// Constructor
	public Calculator(){
		JFrame frame = new JFrame("Calculator");
		numbers.add(0, null);
	
		JPanel numberPanel = new JPanel();
		numberPanel.setLayout(new GridLayout(3, 3));
		seven = new JButton("7");
		seven.addActionListener(this);
		eight = new JButton("8");
		eight.addActionListener(this);
		nine = new JButton("9");
		nine.addActionListener(this);
		four = new JButton("4");
		four.addActionListener(this);
		five = new JButton("5");
		five.addActionListener(this);
		six = new JButton("6");
		six.addActionListener(this);
		one = new JButton("1");
		one.addActionListener(this);
		two = new JButton("2");
		two.addActionListener(this);
		three = new JButton("3");
		three.addActionListener(this);
		numberPanel.add(seven);
		numberPanel.add(eight);
		numberPanel.add(nine);
		numberPanel.add(four);
		numberPanel.add(five);
		numberPanel.add(six);
		numberPanel.add(one);
		numberPanel.add(two);
		numberPanel.add(three);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new GridLayout(4, 1));
		mult = new JButton("*");
		mult.addActionListener(this);
		div = new JButton("/");
		div.addActionListener(this);
		plus = new JButton("+");
		plus.addActionListener(this);
		minus = new JButton("-");
		minus.addActionListener(this);
		rightPanel.add(mult);
		rightPanel.add(div);
		rightPanel.add(plus);
		rightPanel.add(minus);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(2, 1));
		clear = new JButton("C");
		clear.addActionListener(this);
		answer = new JButton("ANS");
		answer.addActionListener(this);
		leftPanel.add(clear);
		leftPanel.add(answer);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1, 3));
		zero = new JButton("0");
		zero.addActionListener(this);
		equals = new JButton("=");
		equals.addActionListener(this);
		bottomPanel.add(zero);
		bottomPanel.add(new JButton(".")); // add later
		bottomPanel.add(equals);

		frame.setLayout(new BorderLayout());
		frame.add(text, BorderLayout.NORTH);
		frame.add(bottomPanel, BorderLayout.SOUTH);
		frame.add(numberPanel, BorderLayout.CENTER);
		frame.add(rightPanel,  BorderLayout.EAST);
		frame.add(leftPanel,  BorderLayout.WEST);
		frame.setSize(320, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				String test = "";
				for(int index = 0; index < operators.size(); index++){
					test += operators.get(index);
				}
				System.out.println(test);
				try {
					System.out.println(calculation(test));
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
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
	
	public double calculation(String input) throws ScriptException {
	    ScriptEngineManager mgr = new ScriptEngineManager();    
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");        
	    return ((Double) engine.eval(input));
	    //return new BigDecimal(engine.eval(input).toString()).intValueExact();
	}
}

/********************************
 * Add decimal later
 * use an array like a stack to push and pop values
 * parse int string to suit
 * if statement to change operators
 * using 2 arraylists
 */
