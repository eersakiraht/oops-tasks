package com.tharika.unit1;

class Calculator{
	int add(int a,int b) {
		return a + b;
	}
	
	int subtract(int a,int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
}

public class Task17 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result_a = c.add(5, 4);
		int result_s = c.subtract(5, 4);
		int result_m = c.multiply(5, 4);
		System.out.println("Addition: " + result_a);
		System.out.println("Subtraction: " + result_s);
		System.out.println("Multiplication: " + result_m);
	}
}