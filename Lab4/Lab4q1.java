/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab4;
import java.util.Scanner;       // import Scanner

public class Lab4q1 {
	public static void main(String args[]){
		// Declare variables
		String fName;
		String lName;
		int firstLength;
		int lastLength;
		char f;
		char l;
		char fLast;
		char lLast;
		boolean containsA;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.println("Enter the first name");
		fName = input.next(); 
		System.out.println("Enter the last name");
		lName = input.next();
		firstLength = fName.length();
		lastLength = lName.length();
		f = fName.charAt(0); 
		l = lName.charAt(0);
		fLast = fName.charAt(fName.length()-1);
		lLast = lName.charAt(lName.length()-1);
		
		for(int index = 0; index < fName.length(); index++){
			if(fName.charAt(index) == 'a'){
				containsA = true;
			}
		}
		
		System.out.println("\nOutput\n");
		if(containsA = true){
			System.out.println("The name has an a");
		}
		else{
			System.out.println("The name has no a");
		}
		System.out.println("First name: " + fName);
		System.out.println("Last name: " + lName);
		System.out.println("First name length: " + firstLength);
		System.out.println("Last name length: " + lastLength);
		System.out.println("First initial: " + f);
		System.out.println("Last initial: " + l);
		System.out.println("First char: " + fLast);
		System.out.println("Last char: " + lLast);
		System.out.println(fName.toUpperCase() + " " + lName.toUpperCase());
		input.close();
	}
}
