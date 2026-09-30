package com.tharika.unit1;

abstract class Employee_staff {
    abstract double calculateSalary();
}

class Manager extends Employee_staff {
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee_staff {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Task09 {
    public static void main(String[] args) {
        Employee_staff m1 = new Manager(2000.0, 500.0);
        Employee_staff d1 = new Developer(50.0, 40);
        System.out.println("Manager salary: " + m1.calculateSalary());
        System.out.println("Developer salary: " + d1.calculateSalary());
    }
}
