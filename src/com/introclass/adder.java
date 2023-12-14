package com.introclass;

public class adder {
	public static Integer add(Integer x, Integer y) {
		return x + y;
	}

	public static Character charr(Character x, Character y) {
		return (char) (x + y);
	}

	public static Boolean bool(Boolean x, Boolean y) {
		return x && y;
	}

	public static Float float_add(Float x, Float y) {
		return x + y;
	}

	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		// int a=5,b=7;int c=a+b;
		// System.out.println("Result "+c);
		Integer z = add(2, 3);
		System.out.println("Integer Result " + z);
		Character c = charr('k', 't');
		System.out.println("Character Result " + c);
		Boolean b = bool(true, false);
		System.out.println("Boolean Result " + b);
		Float f = float_add(2.3f, 3.4f);
		System.out.println("Float Result " + f);
	}

}
