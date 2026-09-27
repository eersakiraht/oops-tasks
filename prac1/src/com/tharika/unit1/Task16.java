package com.tharika.unit1;

class Employee__{
	int employeeid;
	String employeeName;
	int salary;
}


public class Task16 {
	public static void main(String[] args) {
		Employee__ e1 = new Employee__();
		e1.employeeid = 5;
		e1.employeeName = "Tharika";
		e1.salary = 350000;
		System.out.println("Employee ID: " + e1.employeeid +
				"\nEmployee Name: " + e1.employeeName +
				"\nEmployee Salary: " + e1.salary);
	}
}
