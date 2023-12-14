package com.introclass;

import java.util.Date;

public class HelloWorld {

	static String greeting = "Hello World";
	static int x = 10, y = 5;
	// static int y = 5;
	static int sum = x + y;

	static Date today;

	// char myfav = 'a';

	public static void main(String[] args) {

		// System.out.println(greeting + "From Gyanendra" + " 04/12");

		// System.out.println(greeting + args[0]);

		// System.out.println(args[0] + ' ' + args[6]);

		today = new Date();

		System.out.println(sum);

		System.out.println(today);

	}

}
