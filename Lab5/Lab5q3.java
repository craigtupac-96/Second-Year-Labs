/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;       // import Scanner

public class Lab5q3 {
	public static void main(String args[]){
		// Declare variables
		int userInput;
		int sum = 0;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.println("Enter a number greater than 1");
		userInput = input.nextInt(); 
		
		if(userInput >= 2){  // if to check if valid
			for(int index = 2; index <= userInput; index++){
				if(index % 2 == 0){   // checking for even number 
					sum += index;
				}
			}
		}
		else{
			System.out.println("The number entered was not greater than 1");
		}
		System.out.println("The sum is: " + sum);
		input.close();
	}
}
