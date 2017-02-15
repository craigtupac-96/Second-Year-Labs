/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab4;
import java.util.Scanner;       // import Scanner

public class Time {
	public static void main(String args[]){
		// Declare variables
		int hours;
		int minutes;
		int seconds;
		int total = 0;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.println("Enter the hours");
		hours = input.nextInt(); 	
		System.out.println("Enter the minutes");
		minutes = input.nextInt();
		System.out.println("Enter the seconds");
		seconds = input.nextInt();	
		//calculation
		total = ((hours * 60) + minutes) * 60 + seconds;
		System.out.println("\nTime: " + hours + ":" + minutes + ":" + seconds);
		System.out.println("\nTotal Time: " + total);
		input.close();
	}
}
