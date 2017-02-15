/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;       // import Scanner

public class Lab5q7 {
	
	public static void main(String args[]){
		// Declare variables
		int celsius;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input	
		System.out.println("Enter celsius");
		celsius = input.nextInt();
		
		if(celsius >= -10 && celsius <= 5){
			System.out.println("Very Cold");
		}
		else if(celsius >= 6 && celsius <= 15){
			System.out.println("Cold");
		}
		else if(celsius >= 16 && celsius <= 22){
			System.out.println("Warm");
		}
		else if(celsius >= 22 && celsius<= 30){
			System.out.println("Hot");
		}
		else{
			System.out.println("Error, temperature out of range");
		}
		input.close();
	}
}
