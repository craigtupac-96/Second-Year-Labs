/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13;

public class Circle extends TwoDShape
{
	private double radius;

  	public Circle(String name, String colour, double r)
  	{ 
  		super(name, colour);
  		setRadius(r); 
  	}

  	public double getRadius()
  	{ 
  		return radius; 
  	}

  	public void setRadius(double r)
  	{ 
  		radius = r; 
  	}

  	public double area()
  	{ 
  		return Math.PI * Math.pow(radius, 2); 
  	}
  	
  	public String toString()
  	{
  		return (super.toString() + "\nRadius = " + radius);
  	}
}
