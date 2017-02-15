/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab9;

public class Rectangle {
	int length;
	int width;
	
	public Rectangle(){            // Default constructor
		setLength(1);
		setWidth(1);
	}

	// Constructor
	public Rectangle(int len, int wid){
		setLength(len);
		setWidth(wid);
	}


	// Setters
	public void setLength(int len){
		length = len;
	}

	public void setWidth(int wid){
		width = wid;
	}
	
	// Getters
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getArea(){
		return length * width;
	}
	
	public int getPer(){
		return (length * 2) + (width * 2);
	}
	
	// toString method
	public String toString(){
		return "Length: " + getLength() + ", Width: " + getWidth();
	}

	public void printRect(){	
		String middle = "";
		for(int index = 0; index < width; index++){
			System.out.print("* ");
		}
		for(int index = 0; index < length -2; index++){
			middle += " ";
		}
		System.out.println();
		for(int index = 0; index < length-2; index++){
			System.out.println("*" + middle + "*");
		}
		for(int index = 0; index < width; index++){
			System.out.print("* ");
		}
	}
}
