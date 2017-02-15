/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab6;
import java.util.Scanner;       // import Scanner

public class Lab6q2 {
	public static void main(String args[]){
		// Declare variables
		String stars = "";
		int num = 0;
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		
		while(num != -1){
			System.out.println("Enter a number (-1 to exit)");
			num = input.nextInt();
			
			for(int index = 0; index < num; index++){
				stars += "*";
			}
			System.out.println(stars);
			stars = "";
		}
		input.close();
	}
}
