/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab8;

public class ThermometerDriver
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() );
		
	} // end main
} // end class ThermTest
