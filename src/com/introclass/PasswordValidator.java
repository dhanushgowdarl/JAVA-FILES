package com.introclass;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Create a password for your bank account: ");
		String password = scanner.nextLine();

		if (isValidPassword(password)) {
			System.out.println("Password is valid. Thank you!");
		} else {
			System.out.println("Invalid password. Please follow the password rules.");
		}

		scanner.close();
	}

	private static boolean isValidPassword(String password) {
		if (password.length() < 8) {
			return false;
		}

		boolean hasUppercase = false;
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUppercase = true;
				break;
			}
		}

		if (!hasUppercase) {
			return false;
		}

		boolean hasDigit = false;
		for (char ch : password.toCharArray()) {
			if (Character.isDigit(ch)) {
				hasDigit = true;
				break;
			}
		}

		return hasDigit;
	}
}
