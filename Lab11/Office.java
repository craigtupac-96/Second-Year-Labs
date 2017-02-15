/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab11;

public class Office{
	static int officeNo = 99;
	int number;
	
	//default constructor
	public Office(){
		officeNo++;
		number = officeNo;
	}
	
	public int getOfficeNo(){
		return number;
	}
}
