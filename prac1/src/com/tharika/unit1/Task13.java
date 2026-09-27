package com.tharika.unit1;

class Vehicle{
	void start() {
		System.out.println("Start!");
	}
}

class Bike extends Vehicle{
	void ride() {
		System.out.println("Ride!");
	}
}

public class Task13 {
	public static void main(String[] args) {
		Bike b1= new Bike();
		b1.start();
		b1.ride();
	}
}
