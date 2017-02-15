/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;       // import Scanner

public class Lab5q6 {
	public static void main(String args[]){
		// Declare variables
		int age;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input	
		System.out.println("Enter your age");
		age = input.nextInt();
		
		if(age >= 18){
			System.out.println("You can vote");
		}
		else{
			System.out.println("You can not vote");
		}
		input.close();
	}
}
