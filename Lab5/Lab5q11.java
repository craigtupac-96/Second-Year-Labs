/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;

public class Lab5q11{
	public static void main(String args[]){
		// Declare variables
		System.out.println("Unicode value\t" + "Character");
		// input
		for(int index = 32; index < 127; index++){
			System.out.println(index + "\t\t" + (char)index);
		}
	}
}
