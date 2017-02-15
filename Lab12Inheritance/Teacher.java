/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab12Inheritance;

public class Teacher extends Person{
	private String[] courses;
	
	public Teacher(String sName, String sAddress){
		super(sName, sAddress);
	}
	
	public boolean addCourse(String course){
		boolean added = true;
		return added;
	}
	
	public boolean removeCourse(String course){
		boolean removed = true;
		return removed;
	}
	
	public String toString(){
		return "Teacher: "  + super.getName() + super.getAddress();
	}
}
