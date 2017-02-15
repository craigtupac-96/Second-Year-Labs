/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13;

public abstract class Shape
{
	private String name;
	private String colour;
	
	public Shape(String name, String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour;
  	} 
  	
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape Colour = " + this.colour);
  	}
  	
  	public abstract double area();  // this is abstract to tell subclasses they must have an area method
}
