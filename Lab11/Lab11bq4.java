/*
Craig Lawlor
C00184465
*/
package Lab11;
import java.util.Scanner;

public class Lab11bq4 {

	public static void main(String[] args) {
		int arrSize;
		int vowels;
		char temp;
		int conson;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arrSize = input.nextInt();
		
		char[] myArr = new char[arrSize];
		
		for(int index = 0 ; index < myArr.length; index++){
			System.out.println("Enter a character");
			myArr[index] = input.next().charAt(0);                 // char input for Scanner
			temp = myArr[index];								   // Must be a shorter way
			temp = Character.toUpperCase(temp);
			myArr[index] = temp;
		}
		
		vowels = vowelCounter(myArr);
		conson = arrSize - vowels;
		
		System.out.println("The number of vowels in the array: " + vowels); 
		System.out.println("The number of consonants in the array: " + conson); 
		
		input.close();
	}

	public static int vowelCounter(char[] theArray){
		int count = 0;
		
		for(int index = 0; index < theArray.length; index++){
			if(theArray[index] == 'A' || theArray[index] == 'E' 
					|| theArray[index] == 'I' || theArray[index] == 'O' || theArray[index] == 'U' ){
				count++;
			}
        }
		return count;
	}	
}	


