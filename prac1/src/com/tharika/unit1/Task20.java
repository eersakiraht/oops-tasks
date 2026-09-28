package com.tharika.unit1;

class Mobile{
	String brand;
	int price;
	
	Mobile() {
		System.out.println("Welcome!");
		this.brand="Samsung";
		this.price= 400000;
	}
}


public class Task20 {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println("Brand: "+ m1.brand +
				"\nPrice: " + m1.price);

	}
}
