package com.introclass;

public class Account1 {

	// Attributes
	private int accountNumber;
	private String accountType;
	private double accountBalance;

	// Default constructor
	public Account1() {
	}

	public Account1(int accountNumber, String accountType, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	// Deposit methods
	public void deposit(float amount) {
		deposit((double) amount);
	}

	public void deposit(int amount) {
		deposit((double) amount);
	}

	public void deposit(double amount) {
		if (amount > 0) {
			accountBalance += amount;
			System.out.println("Deposit of $" + amount + " successful. New balance: $" + accountBalance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw methods
	public void withdraw(float amount) {
		withdraw((double) amount);
	}

	public void withdraw(int amount) {
		withdraw((double) amount);
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + accountBalance);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}

	public static void main(String[] args) {
		Account savingsAccount = new Account(12345, "Savings", 1000.0);
		System.out.println(savingsAccount.toString());

		// Deposit using different data types
		savingsAccount.deposit(500.0);
		savingsAccount.deposit(200);
		savingsAccount.deposit(50.5);

		// Withdraw using different data types
		savingsAccount.withdraw(300.0);
		savingsAccount.withdraw(100);
		savingsAccount.withdraw(20.5);

		// Check account details after transactions
		System.out.println("Account Details After Transactions:\n" + savingsAccount.toString());
	}
}
