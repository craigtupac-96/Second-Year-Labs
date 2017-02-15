/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;
import java.util.Scanner;       // import Scanner

public class Lab5q4 {
	public static void main(String args[])
	{
		// Declare variables
		int square;
		int cube;
		
		Scanner input = new Scanner(System.in); // new Scanner
		System.out.println("Number\tSquare\tCube");
		// input
		for(int index = 1; index < 6; index++){
			square = index * index;
			cube = index * index * index;
			System.out.println(index + "\t" + square + "\t" + cube);
		}
		input.close();
	}
}
