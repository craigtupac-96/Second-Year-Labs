package Lab12Inheritance;

public class Circle extends Point{
	protected int radius;
	
	public Circle(){
		
	}
	
	public Circle(int x, int y, int rad){
		super(x, y);
		setRadius(rad);
	}
	
	public void setRadius(int rad){
		radius = rad;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public String toString(){
		return "\nX= " + super.getX() + "\nY= " + super.getY() + "\nRadius= " + getRadius();
	}
}
