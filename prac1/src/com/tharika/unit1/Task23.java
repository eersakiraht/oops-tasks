package com.tharika.unit1;

class Mobile_shop{
    String brand;
    int price;
   
    Mobile_shop() {
        System.out.println("Welcome!");
  
        this.brand = "Samsung";
        this.price = 400000;
    }
}

public class Task23 {
    public static void main(String[] args) {
  
        Mobile_shop m1 = new Mobile_shop();
        System.out.println("Brand: " + m1.brand + "\nPrice: " + m1.price);
    }
}
