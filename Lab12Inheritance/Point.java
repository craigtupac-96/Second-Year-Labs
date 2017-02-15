/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab12Inheritance;

public class Point {
	protected int x;
	protected int y;
	
	public Point(){
		
	}
	
	public Point(int num1, int num2){
		setX(num1);
		setY(num2);
	}
	
	public void setX(int num1){
		x = num1;
	}
	
	public void setY(int num2){
		y = num2;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "\nX= " + getX() + "\nY= " + getY();
	}
}
