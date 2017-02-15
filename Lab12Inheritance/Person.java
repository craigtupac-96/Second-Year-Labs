/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab12Inheritance;

public class Person {
	   // Instance variables
	   private String name;
	   private String address;
	   
	   // Constructor
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   
	   public String toString() {
	      return name + "(" + address + ")";
	   }
}
