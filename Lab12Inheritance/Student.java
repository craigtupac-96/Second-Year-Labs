/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab12Inheritance;

public class Student extends Person{
	private static int numCounter = 0;
	private int numCourses;
	private String[] courses = new String[2];
	private int[] grades = new int[2];
	private int sum = 0;
	
	public Student(String sName, String sAddress){
		super(sName, sAddress);
	}
	
	public void addCourseGrade(String course, int grade){
		numCourses = numCounter;
		courses[numCourses] = course;
		grades[numCourses] = grade;
		setAverageGrade(grades);
		numCounter++;
	}
	
	public void setAverageGrade(int[] gradeArray){
		for(int index = numCounter; index < gradeArray.length; index++){
			sum += gradeArray[index];
		}
	}
	
	public int getAverageGrade(){
		int avg = sum;
		avg /= grades.length;
		
		return avg;
	}
	
	public String toString(){
		return "Student: "  + super.getName() + super.getAddress();
	}
	
	public void printGrades(){
		System.out.println(super.toString());
		for(int index = 0; index < grades.length; index++){
			System.out.println(courses[index] + ": " + grades[index] + " ");
		}
	}
}
