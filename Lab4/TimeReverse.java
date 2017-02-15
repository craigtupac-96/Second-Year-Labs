/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab4;
import java.util.Scanner;       // import Scanner

public class TimeReverse {
	public static void main(String args[]){
		// Declare variables
		int hours;
		int minutes;
		int seconds;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.println("Enter the seconds");
		seconds = input.nextInt(); 		
		
		//calculation
		hours = seconds / 60 / 60;          // Martins code
		minutes = (seconds / 60) % 60;
		seconds = seconds % 60;
		
		/*hours = seconds / 60 / 60;
		minutes = seconds /60;
		newSeconds = seconds - ((hours * 60) + (minutes * 60));*/  // ---- wrong

		System.out.println("\nTime: " + hours + ":" + minutes + ":" + seconds);
		input.close();
	}
}
