/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab5;

public class Lab5q8 {
	public static void main(String args[]){
		// Declare variables
		double celsius;
		
		System.out.println("Fahrenheit\tCelsius");
		// input	
		for(double index = 32; index <= 212; index += 12){
			celsius =  ((index - 32)*5)/9;
			//celsius = (5/9) * (index - 32);
			System.out.println(index + "\t\t" + Math.round(celsius));
			
			if(celsius >= -10 && celsius <= 5){
				System.out.print("Very Cold");
			}
			else if(celsius >= 6 && celsius <= 15){
				System.out.print("Cold");
			}
			else if(celsius >= 16 && celsius <= 22){
				System.out.print("Warm");
			}
			else if(celsius >= 22 && celsius<= 30){
				System.out.print("Hot");
			}
			else{
				System.out.print("Error, temperature out of range");
			}
		}
	}
}
