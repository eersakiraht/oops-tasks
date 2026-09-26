//Task 7

package com.tharika;

class Employee{
	int ID;
	String name;
	int salary;
	
	public Employee(int ID,String name,int salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
    public String toString() {
        return "ID: " + ID
             + "\nName: " + name
             + "\nSalary: " + salary;
    }
}

public class Task7 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(100,"Tharika",25000);
		System.out.println(emp1);
	}
}
