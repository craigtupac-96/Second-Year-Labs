/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab3;
import java.util.Scanner;       // import Scanner

public class Numbers {
	
	public static void main(String args[]){
		// Declare variables
		int integer;
		float fl;
		long lg;
		double db;
		String str;
		
		Scanner input = new Scanner(System.in); // new Scanner
		
		// input
		System.out.print("Enter your integer: ");
		integer = input.nextInt();
		System.out.print("Enter your float: ");
		fl = input.nextFloat();
		System.out.print("Enter your long: ");
		lg = input.nextLong();
		System.out.print("Enter your double: ");
		db = input.nextDouble();
		System.out.print("Enter your string: ");
		str = input.next();
		
		System.out.println("\n\n~~~Input~~~");
		System.out.println("Integer: " + integer);
		System.out.println("Float: " + fl);
		System.out.println("Long: " + lg);
		System.out.println("Double: " + db);
		System.out.println("String: " + str);
		
		System.out.println("~~~Additions~~~");
		System.out.println("Integer + Float: " + integer + fl);
		System.out.println("Integer + Long: " + integer + lg);
		System.out.println("Integer + Double: " + integer + db);
		System.out.println("Integer + String: " + integer + str + "\n");
		System.out.println("Float + Long: " + fl + lg);
		System.out.println("Float + Double: " + fl + db);
		System.out.println("Float + String: " + fl + str + "\n");
		System.out.println("Long + Double: " + lg + db);
		System.out.println("Long + String: " + lg + str);
		System.out.println("Double + String: " + db + str );
		input.close();
	}
}
