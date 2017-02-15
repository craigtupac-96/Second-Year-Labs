/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab12Polymorphism;

public class Dog extends Animal
{
	
	public Dog(String type, int age, char gender)
	{ 
		super(type, age, gender);
	}

	public void eat()
	{
		System.out.println("Dog is eating.");
	}
	
	public void sleep()
	{
		System.out.println("Dog is sleeping.");
	}
	public void makeSound()
	{
		System.out.println("woof woof");
	}

	public String toString()
	{		
		return ("Dog has been vaccinated: " + "\nType: " + type + ", Age: " + age + ", Gender: " + gender);
	}
}
