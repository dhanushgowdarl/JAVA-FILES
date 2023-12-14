package com.introclass;

public class CurrentAccount extends Account {

	private static final double OVERDRAFT_LIMIT = 1000.0;

	public CurrentAccount(int accountNumber, double accountBalance) {
		super(accountNumber, "Current", accountBalance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && (getAccountBalance() - amount) >= -OVERDRAFT_LIMIT) {
			setAccountBalance(getAccountBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + getAccountBalance());
		} else {
			System.out.println("Withdrawal failed. Insufficient funds or exceeds overdraft limit.");
		}
	}

	@Override
	public double calculateInterest() {
		// Current account has no interest
		return 0;
	}

	@Override
	public String toString() {
		return "\nOverdraft Limit: $" + OVERDRAFT_LIMIT;
	}

	public static void main(String[] args) {

	}
}