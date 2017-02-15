 /*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab12Polymorphism;

public class Vet {
	private String name;
	
	public Vet(String vetName){
		name = vetName;
	}
	
	public void vaccinate(Animal animal){
		System.out.println(name + " is vaccinating");
	
		System.out.println(animal.toString() + "\n");
	}
}