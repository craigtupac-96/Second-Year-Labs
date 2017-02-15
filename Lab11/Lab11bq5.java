/*
Craig Lawlor
C00184465
*/
package Lab11;
import java.util.Scanner;

public class Lab11bq5 {

	public static void main(String[] args) {
		int arrSize;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arrSize = input.nextInt();
		
		char[] myArr = new char[arrSize];
		
		for(int index = 0 ; index < myArr.length; index++){
			System.out.println("Enter a character");
			myArr[index] = input.next().charAt(0);                 // char input for Scanner
		}
		
		if(palindromeCheck(myArr)){
			System.out.println("The array is a palindrome");
		}
		else{
			System.out.println("The array is not a palindrome");
		}
		
		input.close();
	}

	public static boolean palindromeCheck(char[] theArray){
		String forward = "";
		String backward = "";
		boolean palin = false;
		
		for(int index = 0 ; index < theArray.length; index++){
			forward += theArray[index];
		}
		
		for(int index = theArray.length-1; index >= 0; index--){
			backward += theArray[index];
		}
		
		if(forward.equals(backward)){
			palin = true;
		}
		return palin;
	}	
}	


