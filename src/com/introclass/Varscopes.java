package com.introclass;

public class Varscopes {

	String glb = "Global";
	static String stc = "Static";

	public String method1() {
		final String lcl = "Local";
		System.out.println(lcl);
		return glb;
	}

	public String method2() {

		String glb = "Global";
		return stc;
	}

	public static void main(String[] args) {
		Varscopes vs = new Varscopes();
		System.out.println(vs.method1());
		System.out.println(vs.method2());

	}

}
