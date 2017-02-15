/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab10;

public class SavingsAccountDriver {
	public static void main(String[] args){
		double annualInterestRate = .04;
		
		SavingsAccount saver1 = new SavingsAccount();
		saver1.setSavings(2000.00);
		saver1.setNumber();
		saver1.calculateMonthlyInterest(annualInterestRate);
		System.out.println(saver1.toString());
		
		SavingsAccount saver2 = new SavingsAccount();
		saver2.setSavings(3000.00);
		saver2.setNumber();
		saver2.calculateMonthlyInterest(annualInterestRate);
		System.out.println(saver2.toString() + "\n");
		
		saver1.calculateMonthlyInterest(modifyInterestRate());
		System.out.println(saver1.toString());
		saver2.calculateMonthlyInterest(modifyInterestRate());
		System.out.println(saver2.toString());
	}
	
	public static double modifyInterestRate(){
		double annualInterestRate = .05;
		
		return annualInterestRate;
	}
}

