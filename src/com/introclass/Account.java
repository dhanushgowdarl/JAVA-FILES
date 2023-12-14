package com.introclass;

public class Account {

	private int accountNumber;
	private String accountType;
	private double accountBalance;

	public Account() {
	}

	public Account(int accountNumber, String accountType, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			accountBalance += amount;
			System.out.println("Deposit of $" + amount + " successful. New balance: $" + accountBalance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + accountBalance);
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount.");
		}
	}

	// Calculate interest method
	public double calculateInterest() {
		double interestRate = 4.5;
		return (accountBalance * interestRate) / 100;
	}

	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\nAccount Type: " + accountType + "\nAccount Balance: $"
				+ accountBalance;
	}

	public static void main(String[] args) {
		Account savingsAccount = new Account(12345, "Savings", 1000.0);
		Account currentaccount = new Account(2345, "Current", 1000.0);

		System.out.println(savingsAccount.toString());
		System.out.println(currentaccount.toString());

		savingsAccount.deposit(500.0);
		savingsAccount.withdraw(200.0);

		double interest = savingsAccount.calculateInterest();
		System.out.println("Interest earned: $" + interest);
	}
}
