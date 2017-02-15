/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab3;
import java.util.Scanner;       // import Scanner

public class CodeString {
	public static void main(String args[]){
		// Declare variables
		String str;
		String newStr = "";
		char ch;
		
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		System.out.println("Enter a String");
		str = input.next();
		
		for(int index = 0; index < str.length(); index ++) // loop backwards through string
		{
			ch = str.charAt(index);
			ch++;
			newStr += ch;
		}
		
		System.out.println("Input: " + str);
		System.out.println("Output: " + newStr);
		input.close();
	}
}
