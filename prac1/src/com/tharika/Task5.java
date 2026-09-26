//Task-5

package com.tharika;

class Student{
	int rollNumber;
	String name;
	String department;
	float cgpa;

	public Student(int rollNumber,String name,String department,float cgpa) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.department = department;
		this.cgpa = cgpa;
	}
	public int printRollNumber() {
		return rollNumber;
	}
	public String printName() {
		return name;
	}
	public String printDepartment() {
		return department;
	}
	public float printCgpa() {
		return cgpa;
	}
	
	@Override
	public String toString() {
		return "Name is: " + name
				+ "\nAge, Department and CGPA are: "
				+ rollNumber + " " + department + " " + cgpa;
	}
}

public class Task5{
	public static void main(String[] args) {
		Student s1 = new Student(1234,"Thari","CSE",8.1f);
		System.out.println(s1);
	}
}