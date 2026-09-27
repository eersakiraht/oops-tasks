package com.tharika.unit1;

abstract class Animal{
	abstract void sound();
}

class Dog extends Animal{
	void sound() {
		System.out.println("Bark!");
	}
}


class Cat extends Animal{
	void sound() {
		System.out.println("Meow!");
	}
}


public class Task10 {
	public static void main(String[] args) {
		Animal d1 = new Dog();
		Animal c1 = new Cat();
		d1.sound();
		c1.sound();

	}
}
