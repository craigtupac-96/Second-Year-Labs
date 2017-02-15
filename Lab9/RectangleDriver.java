/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab9;
import java.util.Scanner;

public class RectangleDriver {

	public static void main(String[] args) {
		int length;
		int width;
		
		Scanner input = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter the length"); // If to check conditions
		length = input.nextInt();
		
		if(checkIf(length)){
			rect.setLength(length);
		}
		else{
			System.out.println("Input out of bounds.\nEnter the length"); // If to check conditions
			length = input.nextInt();
			rect.setLength(length);
		}
		
		System.out.println("Enter the width");
		width = input.nextInt();
		
		if(checkIf(width)){
			rect.setWidth(width);
		}
		else{
			System.out.println("Input out of bounds.\nEnter the width"); // If to check conditions
			width = input.nextInt();
			rect.setWidth(width);
		}
		
		input.close();    // closing the scanner class 
		
		System.out.println(rect.toString());
		System.out.println("Area = " + rect.getArea() + ", Perimeter = " + rect.getPer());
		rect.printRect();
	}
	
	// method to check if above 0 and less than or equal to 40
	public static boolean checkIf(int number){
		if(number > 0 && number <= 40){
			return true;
		}
		else{
			return false;
		}
	}
}