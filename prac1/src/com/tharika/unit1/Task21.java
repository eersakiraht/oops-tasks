package com.tharika.unit1;

class Mobile_{
	String brand;
	int price;
	
	Mobile_(String brand,int price) {
		System.out.println("Welcome!");
		this.brand=brand;
		this.price= price;
	}
}

public class Task21 {
	public static void main(String[] args) {
		Mobile_ m1 = new Mobile_("Samsung",400000);
		System.out.println("Brand: "+ m1.brand +
				"\nPrice: " + m1.price);
		Mobile_ m2 = new Mobile_("Xiaomi",150000);
		System.out.println("Brand: "+ m2.brand +
				"\nPrice: " + m2.price);

	}
}
