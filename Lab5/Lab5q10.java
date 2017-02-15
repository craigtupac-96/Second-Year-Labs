/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;       // import Scanner

public class Lab5q10 {
	public static void main(String args[]){
		// Declare variables
		int userInput;
		int max;
		int min;
		
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		System.out.println("Enter a number (0 to end)");
		userInput = input.nextInt();
		max = userInput;
		min = userInput;
		if(userInput != 0){
			while(userInput != 0){
				System.out.println("Enter a number");
				userInput = input.nextInt();
			
				if(userInput > max){
					max = userInput;
				}
				if(userInput < min && userInput != 0){
					min = userInput;
				}
			}
		}		
			System.out.println("The max number is " + max);
			System.out.println("The min number is " + min);
			input.close();
	}
}
