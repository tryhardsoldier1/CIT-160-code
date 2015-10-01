// Spyke Krepshaw
// 02-17-15
// This program will hold data and perform methods for/on a bank account

public class BankAccount {

	// Declare global private variables
	private double balance;
	private double interestRate;
	private double interest;

	// Constructors
	// Default constructor
	public BankAccount(){
		balance = 0;
		interestRate = 0;
		interest = 0;
	}

	public BankAccount(double  bal, double iRate, double in){
		balance = bal;
		interestRate = iRate;
		interest = in;
	}

	// Setter / Mutators
	public void setInterestRate(double iRate){
		interestRate = iRate;
	}

	public void deposit(double amount){
		// balance = balance + amount;
		balance = balance + amount;
	}

	public void withdraw(double amount){
		// balance = balance - amount; 
		balance = balance - amount;
	}

	public void addInterest(){
		interest = balance * interestRate;
		balance = balance + interest;
	}

	// Getters / Accessors
	public double getBalance(){
		return balance;
	}

	public double getInterestRate(){
		return interestRate;
	}

	public double getInterest(){
		return interest;
	}
}
