package com.introclass;

import java.util.Scanner;

public class LoanEligibilityChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter customer's credit score: ");
		int creditScore = scanner.nextInt();

		System.out.print("Enter customer's annual income: $");
		double annualIncome = scanner.nextDouble();

		scanner.close();

		if (creditScore > 700 && annualIncome >= 50000) {
			System.out.println("Congratulations! You are eligible for a loan.");
		} else {
			System.out.println("Sorry, You are not eligible for a loan.");
		}
	}
}
