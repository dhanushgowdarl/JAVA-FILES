package com.introclass;

public class Savings extends Account {

	private double interestRate;

	public Savings(int accountNumber, double accountBalance, double interestRate) {
		super(accountNumber, "Savings", accountBalance);
		this.interestRate = interestRate;
	}

	@Override
	public double calculateInterest() {
		// Calculate interest based on the balance and interest rate
		return getAccountBalance() * (interestRate / 100);
	}

	@Override
	public String toString() {
		return super.toString() + "\nInterest Rate: " + interestRate + "%";
	}
}
