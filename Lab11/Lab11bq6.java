/*
Craig Lawlor
C00184465
*/
package Lab11;
import java.util.Scanner;

public class Lab11bq6 {

	public static void main(String[] args) {
		int arrSize;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arrSize = input.nextInt();
		
		String[] myArr = new String[arrSize];
		
		for(int index = 0 ; index < myArr.length; index++){
			System.out.println("Enter a String");
			myArr[index] = input.next();                 
		}
		
		for(int index = 0 ; index < myArr.length; index++){
			if(palindromeCheck(myArr[index])){
				System.out.println(myArr[index] + " is a palindrome");
			}
			else{
				System.out.println(myArr[index] + " is not a palindrome");
			}
		}
		
		input.close();
	}

	public static boolean palindromeCheck(String test){
		String backward = "";
		boolean palin = false;
		
		for(int index = test.length()-1; index >= 0; index--){
			backward += test.charAt(index);
		}
		
		if(test.equals(backward)){
			palin = true;
		}
		return palin;
	}	
}	
