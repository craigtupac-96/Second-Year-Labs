/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Password{
	public static void main(String args[]) throws IOException{
		String p1, p2;         // password and confirmed password
    	boolean confirmed = false;
		int attempts = 0;
  
    		BufferedReader keyboardInput;
    		// std. i/p is keyboard for console apps and buffered I/O
    		keyboardInput = new BufferedReader(new InputStreamReader(System.in));
    		// password strings
    		p1 = new String("");
    		p2 = new String("");
    
    		System.out.print("Enter your new password: ");
    		p1  = keyboardInput.readLine();
    		System.out.println();                    // new line
    
    		while (!confirmed && attempts < 3)
    		{
      			System.out.print("Please confirm your new password: ");
      			p2  = keyboardInput.readLine();
      			System.out.println();
    
      			if (p1.equals(p2))  // object equality
        				confirmed = true;
      			else{
        				System.out.println("Confirmation error, try again");
        				attempts++;
      			}
     		}
    		if (attempts < 3)
      			System.out.println("New password confirmed ok");
    		else
      			System.out.println("3 fails - exiting");
  	}
}
