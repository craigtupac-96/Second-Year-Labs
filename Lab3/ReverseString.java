/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab3;
import java.util.Scanner;       // import Scanner

public class ReverseString {
	public static void main(String args[]){
		// Declare variables
		String str;
		String reverse = "";
		char ch;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.println("Enter a String");
		str = input.next();
		
		for(int index = str.length()-1; index >= 0; index --){ // loop backwards through string
			ch = str.charAt(index);
			reverse += ch;
		}
		
		System.out.println("Input: " + str);
		System.out.println("Output: " + reverse);
		input.close();
	}
}
