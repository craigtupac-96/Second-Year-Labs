/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab6;
import java.util.Scanner;       // import Scanner

public class Lab6q3 {
	public static void main(String args[]){
		// Declare variables
		String stars = "";
		int num = 0;
		Scanner input = new Scanner(System.in); // new Scanner
		// input
		
		System.out.println("Enter a number");
		num = input.nextInt();
		
		while(num > 0){
			for(int index = num; index > 0; index--){
			stars += "*";
		}
		System.out.println(stars);
		stars = "";
		num--;
		}
		input.close();
	}
}
