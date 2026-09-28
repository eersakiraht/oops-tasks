package com.tharika.unit1;

class Mobile_store {
    String brand;
    int price;
    
    Mobile_store(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    Mobile_store(Mobile_store otherMobile) {
        this.brand = otherMobile.brand; 
        this.price = otherMobile.price;
    }
}

public class Task22 {
    public static void main(String[] args) {
        Mobile_store m1 = new Mobile_store("Apple iPhone", 120000);
        Mobile_store m2 = new Mobile_store(m1);

        System.out.println("Brand: " + m1.brand + "\nPrice: " + m1.price);
        System.out.println("Brand: " + m2.brand + "\nPrice: " + m2.price);
    }
}
















public class Task22 {

	public static void main(String[] args) {
		

	}

}
