/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab12Polymorphism;

public class Cat extends Animal
{
	
	public Cat(String type, int age, char gender)
	{ 
		super(type, age, gender);
	}

	public void eat()
	{
		System.out.println("Cat is eating.");
	}
	
	public void sleep()
	{
		System.out.println("Cat is sleeping.");
	}
	public void makeSound()
	{
		System.out.println("prrrrrr");
	}

	public String toString()
	{		
		return ("Cat has been vaccinated: " + "\nType: " + type + ", Age: " + age + ", Gender: " + gender);
	}
}
