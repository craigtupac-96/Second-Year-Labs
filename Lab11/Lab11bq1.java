/*
Craig Lawlor
C00184465
*/
package Lab11;
import java.util.Scanner;

public class Lab11bq1 {

	public static void main(String[] args) {
		int arrSize;
		int evenNumbers;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arrSize = input.nextInt();
		
		int myArr[] = new int[arrSize];
		
		for(int index = 0; index < myArr.length; index++){
			System.out.println("Enter an integer");
			myArr[index] = input.nextInt();
		}
		for(int index = 0; index < myArr.length; index++){
			System.out.println(myArr[index]);
		}
		
		evenNumbers = isEven(myArr);             // method call
		
		System.out.println("There are " + evenNumbers + " even numbers in the array");
		
		input.close();
	}

	public static int isEven(int[] theArray){
		int even = 0;
		
		for(int index = 0; index < theArray.length; index++){
			if(theArray[index] % 2 == 0){
				even++;
			}
		}
	
		return even;
	}

}
