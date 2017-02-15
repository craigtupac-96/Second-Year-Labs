/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab6;
import java.util.Scanner;

public class Lab6q1 {
	public static void main(String args[]){
		// Declare variables
		String stars = "";
		int num;
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		System.out.println("Enter a number");
		num = input.nextInt();
		
		for(int index = 0; index < num; index++){
			stars += "*";
		}
		System.out.println(stars);
		input.close();
	}
}
