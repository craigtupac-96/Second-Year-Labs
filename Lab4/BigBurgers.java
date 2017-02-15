/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab4;
import java.util.Scanner;       // import Scanner
import java.text.DecimalFormat;

public class BigBurgers {
	public static void main(String args[]){
		// Declare variables
		int chip;
		int hamburger;
		final double CHIPCOST = .30;
		final double HAMBURGERCOST = .40;
		final double CHIPSOLD = .75;
		final double HAMBURGERSOLD = .95;
		double chipProf;
		double burgerProf;
		double total;
		
		Scanner input = new Scanner(System.in); // new Scanner
		DecimalFormat format = new DecimalFormat("#.##"); // to format doubles to 2 decimal places
		
		// input
		System.out.println("How many Chips were sold?");
		chip = input.nextInt();
		System.out.println("How many Hamburgers were sold?");
		hamburger = input.nextInt();
		
		// Calculation
		chipProf = (chip * CHIPSOLD) - ( chip * CHIPCOST);
		burgerProf = ((hamburger * HAMBURGERSOLD) - (hamburger * HAMBURGERCOST));
		total = chipProf + burgerProf;
		
		
		
		System.out.println("\nChips sold: " + chip);
		System.out.println("Chips sold: " + hamburger);
		System.out.println("Profit on chips: " + format.format(chipProf));
		System.out.println("Profit on hamburgers: " + format.format(burgerProf));
		System.out.println("Total profit: " + (total));
		input.close();
	}
}
