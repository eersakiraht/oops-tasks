package com.tharika.unit1;

abstract class Vehicle_{
	abstract void start();
}

class Car extends Vehicle_{
	void start() {
		System.out.println("Car is started with a key");
	}
}

class Bike_ extends Vehicle_{
	void start() {
		System.out.println("Bike is started with a kick!");
	}
}

public class Task14 {
	public static void main(String[] args) {
		Vehicle_ v1 = new Car();
		Vehicle_ v2 = new Bike_();
		v1.start();
		v2.start();
	}
}
