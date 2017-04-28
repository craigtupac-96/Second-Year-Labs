/*
 * Author: Craig Lawlor
 */
package Lab15;

import java.awt.Color;

public class PaintPictureObject {
	private String shapeType;
	private double xCo, yCo, hi, wi;
	private Boolean filled;
	private Color color;
	
	PaintPictureObject(){
		
	}
	// Rectangle, Oval, Line Constructor
	PaintPictureObject(String shape, double clickX, double clickY, double width, double height, Color col, Boolean fill){
		shapeType = shape;
		xCo = clickX;
		yCo = clickY;
		hi = height;
		wi = width;
		color = col;
		filled = fill;
	}
	
	public String shapeType(){
		return shapeType;
	}
	
	public Color objectColor(){
		return color;
	}
	
	public Boolean filled(){
		return filled;
	}
	
	public double clickX(){
		return xCo;
	}
	
	public double clickY(){
		return yCo;
	}
	
	public double height(){
		return hi;
	}
	
	public double width(){
		return wi;
	}
}
