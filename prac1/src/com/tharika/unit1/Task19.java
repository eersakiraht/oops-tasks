package com.tharika.unit1;

class Student_{
	int rollNumber;
	String name;
	static String college = "VIT Chennai";
	
	Student_(int rollNumber,String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}
}


public class Task19 {
	public static void main(String[] args) {
		Student_ s1 = new Student_(10,"Tharika");
		Student_ s2 = new Student_(20,"Tharun");
		System.out.println("Roll number: " + s1.rollNumber +
				"\nName: " + s1.name +
				"\nCollege: " + s1.college);
		System.out.println("\nRoll number: " + s2.rollNumber +
				"\nName: " + s2.name +
				"\nCollege: " + s2.college);
	}
}
