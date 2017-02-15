/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13;

public class Cylinder extends ThreeDShape
{
  	private double height;
  	private double radius;

  	public Cylinder(String name, String colour, double radius, double height)
  	{ 
    	super(name, colour); 
    	setRadius(radius);
    	setHeight(height);
  	}

  	public void setHeight(double height)
  	{ 
  		this.height = height; 
  	}

  	public double getHeight()
  	{ 
  		return height; 
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
  		return 2 * Math.PI * radius * height; 
  	}
  	
	public double volume()
	{
		return Math.PI * Math.pow(radius, 2) * height; 
	}
	
	public String toString()
  	{
  		return (super.toString() + "\nRadius = " + radius + "\nHeight = " + height);
  	}

}