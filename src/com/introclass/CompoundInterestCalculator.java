package com.introclass;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of customers: ");
		int numberOfCustomers = scanner.nextInt();

		for (int customer = 1; customer <= numberOfCustomers; customer++) {
			System.out.println("\nCustomer " + customer + ":");

			System.out.print("Enter initial balance for customer " + customer + ": $");
			double initialBalance = scanner.nextDouble();

			System.out.print("Enter annual interest rate for customer " + customer + " (%): ");
			double annualInterestRate = scanner.nextDouble();

			System.out.print("Enter the number of years for customer " + customer + ": ");
			int numberOfYears = scanner.nextInt();

			double futureBalance = initialBalance * Math.pow((1 + annualInterestRate / 100), numberOfYears);

			System.out.println("Future balance for customer " + customer + ": $" + futureBalance);
		}

		scanner.close();
	}
}
