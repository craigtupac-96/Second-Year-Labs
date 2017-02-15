/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;

public class Lab5q9 {
	
	public static void main(String args[]){
		// Declare variables
		int userInput;
		int max;
		
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		System.out.println("Enter a number");
		userInput = input.nextInt();
		max = userInput;
		for(int index = 0; index < 9; index++){
			System.out.println("Enter a number");
			userInput = input.nextInt();
			
			if(userInput > max){
				max = userInput;
			}
		}		
			System.out.println("The max number is " + max);
			input.close();
	}
}
