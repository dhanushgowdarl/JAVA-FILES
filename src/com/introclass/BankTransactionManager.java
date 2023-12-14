package com.introclass;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTransactionManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> transactionList = new ArrayList<>();

		double totalBalance = 0;

		System.out.println("Bank Transaction Manager");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");

		int choice;
		do {
			System.out.print("Enter your choice (1-3): ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: $");
				double depositAmount = scanner.nextDouble();
				transactionList.add(depositAmount);
				totalBalance += depositAmount;
				break;

			case 2:
				System.out.print("Enter withdrawal amount: $");
				double withdrawalAmount = scanner.nextDouble();
				if (withdrawalAmount <= totalBalance) {
					transactionList.add(-withdrawalAmount); // Use negative value for withdrawals
					totalBalance -= withdrawalAmount;
				} else {
					System.out.println("Insufficient funds. Withdrawal canceled.");
				}
				break;

			case 3:
				System.out.println("Transaction history:");

				for (int i = 0; i < transactionList.size(); i++) {
					if (transactionList.get(i) > 0) {
						System.out.println("Deposit: $" + transactionList.get(i));
					} else {
						System.out.println("Withdrawal: $" + Math.abs(transactionList.get(i)));
					}
				}

				System.out.println("Total Balance: $" + totalBalance);
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 3.");
			}

		} while (choice != 3);

		scanner.close();
	}
}
