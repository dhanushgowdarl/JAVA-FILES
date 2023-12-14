package com.introclass;

import java.util.Scanner;

public class ATMTransactionSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter current balance: $");
		double currentBalance = scanner.nextDouble();

		System.out.println("Options:");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");

		System.out.print("Enter your choice (1-3): ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Your current balance is: $" + currentBalance);
			break;

		case 2:
			System.out.print("Enter the withdrawal amount: $");
			double withdrawalAmount = scanner.nextDouble();

			if (withdrawalAmount > 0 && withdrawalAmount <= currentBalance
					&& (withdrawalAmount % 100 == 0 || withdrawalAmount % 500 == 0)) {
				currentBalance -= withdrawalAmount;
				System.out.println("Withdrawal successful. Remaining balance: $" + currentBalance);
			} else {
				System.out.println("Invalid withdrawal amount or insufficient funds.");
			}
			break;

		case 3:
			System.out.print("Enter the deposit amount: $");
			double depositAmount = scanner.nextDouble();

			if (depositAmount > 0) {
				currentBalance += depositAmount;
				System.out.println("Deposit successful. Updated balance: $" + currentBalance);
			} else {
				System.out.println("Invalid deposit amount.");
			}
			break;

		default:
			System.out.println("Invalid choice. Please enter a number between 1 and 3.");
		}

		scanner.close();
	}
}
