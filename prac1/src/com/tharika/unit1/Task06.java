//Task 6

package com.tharika.unit1;

class Student1{
	int rollNumber;
	String name;
	String department;
	
	public Student1(int rollNumber, String name, String department) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.department = department;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public String getname() {
		return name;
	}
	public String department() {
		return department;
	}
	
	@Override
	public String toString() {
		return "\nRoll Number: " + rollNumber 
				+ "\nName: " + name 
				+ "\nDepartment: " + department;
	}
}
public class Task06 {
	public static void main(String[] args) {
		Student1 s1 = new Student1(477,"Tharika","CSE");
		Student1 s2 = new Student1(478,"Tharun","useless");
		System.out.print(s1);
		System.out.print(s2);
	}
}
