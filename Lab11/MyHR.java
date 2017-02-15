/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab11;
import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		int option = 0;
		int numOfEmp = 0;
		String tempName;
		String tempType;
		int officeCount = 0;
		int officeMax = 0;
		int empOfficeNo;
		
		Scanner input = new Scanner(System.in);
		Employee[] myArr = new Employee[5];      // using an object array for the 5 employee objects`		
		Office[] officeArr = new Office[3];
		
		officeArr[officeCount] = new Office();
		System.out.println("Menu (-1 to exit)\n1: List all offices\n2: Add a new employee\n3: List all employees");
		while(option != -1){
			option = input.nextInt();
			// Using a switch statement to manage the menu
	        switch (option){
	            case 1:  
	                     break;
	            case 2:  if(numOfEmp < 5){               // adding an employee if numOfEmp is 5 or less
	            	     System.out.println("Enter employee name");
	            		 tempName = input.next();
	            		 System.out.println("Enter employee type (staff or manager)");
	            		 tempType = input.next();
	            		 if(tempType.equals("Manager")){
	            			 
	            		 }
	            		 myArr[numOfEmp] = new Employee();
	            		 myArr[numOfEmp].setName(tempName);
	            		 myArr[numOfEmp].setType(tempType);
	            		 
	            		 System.out.println("Enter street");
	            		 String street = input.next();
	            		 System.out.println("Enter city");
	            		 String city = input.next();
	            		 System.out.println("Enter county");
	            		 String county = input.next();
	            		 
	            		 myArr[numOfEmp].setAddress(street, city, county, numOfEmp);
	            		 if(officeMax == 2){
	            			 officeMax = 0;
	            			 officeCount++;
	            			 officeArr[officeCount] = new Office();
	            			 empOfficeNo = officeArr[officeCount].getOfficeNo();
	            			 myArr[numOfEmp].setOfficeNo(empOfficeNo);      // is this too messy
	            			 officeMax++;
	            		 }
	            		 else{
	            			 empOfficeNo = officeArr[officeCount].getOfficeNo();
	            			 myArr[numOfEmp].setOfficeNo(empOfficeNo);
	            			 officeMax++;
	            		 }
	            		 numOfEmp++;
	            		 }
	            		 else{
	            			 System.out.println("Max number of employees reached");
	            			 option = -1;              // to break the loop
	            		 }
                		 break;
	            case 3:  for(int index=  0; index < numOfEmp; index++){
	            		 	System.out.println(myArr[index].toString());
	            		 	System.out.println("\nAddress:");
	            		 	myArr[index].printAddress(index);
	            		 }
	            default: ;
	                     break;
	        }
		}input.close();
	}
}
