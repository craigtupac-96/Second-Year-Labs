package Lab13;

public class Triangle extends TwoDShape{
	private double base;
	private double height;
	
	public Triangle(String name, String colour, double b, double h){
		super(name, colour);
		setBase(b);
		setHeight(h);
	}
	
	public void setBase(double b){
		base = b;
	}
	
	public void setHeight(double h){
		height = h;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double area(){
		return (.5 * base * height);
	}
	
	public String toString(){
  		return (super.toString() + "\nBase = " + base + "\nHeight = " + height);
  	}
}
