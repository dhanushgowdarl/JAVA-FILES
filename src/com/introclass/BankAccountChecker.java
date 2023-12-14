package com.introclass;

import java.util.Scanner;

public class BankAccountChecker {

	public static void main(String[] args) {
		int[] accountNumbers = { 12345, 67890, 54321 };
		double[] accountBalances = { 1000.50, 5000.25, 200.75 };

		Scanner scanner = new Scanner(System.in);

		boolean isValidAccount = false;

		while (!isValidAccount) {
			System.out.print("Enter your account number: ");
			int enteredAccountNumber = scanner.nextInt();

			int indexOfAccount = -1;
			for (int i = 0; i < accountNumbers.length; i++) {
				if (accountNumbers[i] == enteredAccountNumber) {
					isValidAccount = true;
					indexOfAccount = i;
					break;
				}
			}

			if (isValidAccount) {
				System.out.println("Account Balance: $" + accountBalances[indexOfAccount]);
			} else {
				System.out.println("Invalid account number. Please try again.");
			}
		}
		scanner.close();
	}
}
