package com.introclass;

public class Student {

	String name;
	public int rollnum;

	Student() {
		name = "default";
	}

	Student(String stdname, int roll) {
		name = stdname;
		rollnum = roll;
	}

	String introduce() {
		return "My Name is " + name + " and rollnumber is " + rollnum + "batch is ";
	}

	public static void main(String[] args) {
		Student ron = new Student("Ron", 1);
		Student simi = new Student("Simi", 2);
		Student obj = new Student("Simi", 2);
		/*
		 * if (obj.rollnum <= 2) { System.out.println(obj.name + " is in Batch 1"); }
		 * else if (obj.rollnum >= 3 || obj.rollnum <= 4) { System.out.println(obj.name
		 * + " is in batch 2");
		 * 
		 * } else { System.out.println(obj.name + " is in Batch 3"); }
		 * 
		 * }
		 */
		int batch = 0;
		switch (obj.rollnum) {

		case 1:
		case 2:
			batch = 1;
			break;

		case 3:
		case 4:
			batch = 2;
			break;
		case 5:
		case 6:
			batch = 3;
			break;
		default:
			System.out.println("invalid");
		}
		System.out.println(obj.name + " is in " + batch);

		/*
		 * Student anony = new Student();
		 * 
		 * String s = ron.introduce(); System.out.println(s);
		 * 
		 * String r = simi.introduce(); System.out.println(r);
		 * 
		 * String d = anony.introduce(); System.out.println(d);
		 */
	}
}
