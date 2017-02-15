/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab11;

public class Employee {
	static int empNo = 999;
	int employeeNumber;
	String name;
	String type;
	Address[] myAdd = new Address[5];
	int officeNumber;
	
	public Employee(){
		empNo++;
		employeeNumber = empNo;
	}
	
	public Employee(String name, String empType){
		setName(name);
		setType(empType);
	}
	
	public void setName(String str){
		name = str;
	}
	
	public void setType(String empType){
		type = empType;
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public void setAddress(String street, String city, String county, int noOfEmp){
		myAdd[noOfEmp] = new Address();     // Creating a new address object
		myAdd[noOfEmp].setStreet(street);
		myAdd[noOfEmp].setCity(city);
		myAdd[noOfEmp].setCounty(county);
	}
	
	public void setOfficeNo(int num){
		officeNumber = num;
	}
	
	public int getOfficeNo(){
		return officeNumber;
	}
	
	public String toString(){
		return "Employee Name: " + getName() + "\nEmployee Number: " + employeeNumber
				+ "\nEmployee Type: " + getType() + "\nOffice Number: " + getOfficeNo();
	}
	
	//A method to print the employees address
	public void printAddress(int index){
		System.out.println(myAdd[index].toString() + "\n");
	}
}
