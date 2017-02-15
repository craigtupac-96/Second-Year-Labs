/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab10;

public class BankCustomerDriver {

	public static void main(String[] args) {
		String name = "Craig Lawlor";
		String address = "Carlow";
		
		SavingsAccount acc1 = new SavingsAccount(2000);
		SavingsAccount acc2 = new SavingsAccount(3000);
		SavingsAccount acc3 = new SavingsAccount(4000);
		
		BankCustomer cust = new BankCustomer(name , address);
		cust.addAccount(acc1);
		cust.addAccount(acc2);
		cust.addAccount(acc3);
		cust.balance();                   // to calculate balance
		
		System.out.println(cust.toString());
	}
}
