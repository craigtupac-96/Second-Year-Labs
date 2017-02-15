/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab12Polymorphism;
import java.util.Scanner;

public class VetDriver {

	public static void main(String[] args) {
		String name;
		Scanner input = new Scanner(System.in);
		Dog dog = new Dog("Poodle", 5, 'm');
		Cat cat = new Cat("Manx", 3, 'f');
		
		System.out.println("Enter name");
		name = input.next();
		
		// vet object
		Vet vet = new Vet(name);
		vet.vaccinate(dog);
		vet.vaccinate(cat);
		input.close();
	}
}