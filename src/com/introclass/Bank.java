package com.introclass;

public class Bank {

	public static void main(String[] args) {
		// constructor
		Account savingsAccount = new Account(12345, "Savings", 1000.0);
		System.out.println("Initial Account Details:\n" + savingsAccount.toString());

		deposit(savingsAccount, 500.0);
		withdraw(savingsAccount, 200.0);

		System.out.println("Account Details After Transactions:\n" + savingsAccount.toString());

		if (savingsAccount.getAccountType().equalsIgnoreCase("Savings")) {
			double interest = savingsAccount.calculateInterest();
			savingsAccount.deposit(interest);
			System.out.println("Interest earned: $" + interest);
		}

		System.out.println("Account Details After Adding Interest:\n" + savingsAccount.toString());
	}

	// Deposit method
	private static void deposit(Account account, double amount) {
		account.deposit(amount);
	}

	// Withdraw method
	private static void withdraw(Account account, double amount) {
		account.withdraw(amount);
	}
}
