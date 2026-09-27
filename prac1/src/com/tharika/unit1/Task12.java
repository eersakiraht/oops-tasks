package com.tharika.unit1;

class Employee_{
	private int employeeid;
	private String employeeName;
	private int salary;
	
	public Employee_(int employeeid,String employeeName,int salary) {
		this.employeeid = employeeid;
		this.employeeName =employeeName;
		this.salary = salary;
	}
	
	public int getemployeeid() {
		return employeeid;
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	
	public int getsalary() {
		return salary;
	}
	
	public void setemployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setsalary(int salary) {
		this.salary = salary;
	}
}
	

public class Task12 {
	public static void main(String[] args) {
		Employee_ e1 = new Employee_(25,"Tharika",250000);
		System.out.println("Original salary: " + e1.getsalary());
		e1.setsalary(300000);
		System.out.println("Updated salary: " + e1.getsalary());
	}
}
