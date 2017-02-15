/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;

public class Lab5q5 {
	public static void main(String args[]){
		// Declare variables
		double celsius;
		
		System.out.println("Fahrenheit\tCelsius");
		// input	
		for(double index = 32; index <= 212; index += 12){
			celsius =  ((index - 32)*5)/9;
			//celsius = (5/9) * (index - 32);
			System.out.println(index + "\t\t" + Math.round(celsius));
		}
	}
}
