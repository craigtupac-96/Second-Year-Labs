/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab10;

public class SavingsAccount {
	private double savingsBalance;
	private int saverNo = 0;
	private static int count = 1;
	
	public SavingsAccount(){
		savingsBalance = 0;
	}
	
	public SavingsAccount(double savings){
		setSavings(savings);
	}
	
	public void setSavings(double savings){
		System.out.println(savings);
		savingsBalance = savings;
	} 
	
	public void setNumber(){
		saverNo = count;
		count++;
	}
	
	public void calculateMonthlyInterest(double intRate){
		savingsBalance += (savingsBalance * intRate) / 12;
	}
	
	public double getSavings(){
		return savingsBalance;
	}
	
	public String toString(){
		return "Saver No " + saverNo + ": \nBalance after first month: " + getSavings();
	}
}
