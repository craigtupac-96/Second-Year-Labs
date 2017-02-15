/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab10;

public class BankCustomer {
	private String name;
	private String address;
	public SavingsAccount[] saves = new SavingsAccount[3];
	private int count = 0;
	private double totalSavings;
	
	public BankCustomer(){
		name = "";
		address = "";
	}

	public BankCustomer(String custName, String custAddress){
		setName(custName);
		setAddress(custAddress);
	}
	
	// Setters
	public void setName(String custName){
		name = custName;
	}
	
	public void setAddress(String custAddress){
		address = custAddress;
	}
	
	// Getters
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void addAccount(SavingsAccount accountSavings){
		saves[count] = accountSavings;
		count++;
	}
	
	public void balance(){
		for(int index = 0; index < count; index++){
			totalSavings += saves[index].getSavings();
		}
	}
	
	public String toString(){
		return "Acount name: " + name + "\nAddress: " + "\nTotal Savings = " + totalSavings;	
	} 
}
