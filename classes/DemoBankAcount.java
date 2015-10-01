// You
// 09-22-15
//This program will demonstrate the use of the BankAccount class

import java.util.Scanner;
import java.text.DecimalFormat; // this is new... check it out!

public class DemoBankAcount {

	public static void main(String[] args) {

		// Declare variables
		double balance,
			   interestRate,
			   depositAmount,
			   withdrawAmount;

		// Create object of both Scanner and BankAccount classes
		Scanner keyScan = new Scanner(System.in);
		BankAccount myBankAccount;
		DecimalFormat moneyFormat = new DecimalFormat("$ #,##0.00"); //nothing wrong here

		// Ask user for input and store in appropriate variables
		System.out.print("What is the starting balance of your bank account: ");
		balance = keyScan.nextDouble();
		System.out.print("What is the starting interest rate of your bank account: ");
		interestRate = keyScan.nextDouble();

		// Initialize BankAccount object
		myBankAccount = new BankAccount();
		myBankAccount.deposit(balance);
		myBankAccount.setInterestRate(interestRate);

		// Perform some transactions
		myBankAccount.deposit(5);
		myBankAccount.withdraw(12);
		myBankAccount.withdraw(10.59);
		myBankAccount.addInterest();

		// Show results
		System.out.println(moneyFormat.format(myBankAccount.getBalance())); //nothing wrong here
		System.out.println(moneyFormat.format(myBankAccount.getInterest())); //nothing wrong here

		BankAccount obj2 = new BankAccount(50.25, 0.05, 50);

		// Close Scanner object
		keyScan.close();

	}

}
