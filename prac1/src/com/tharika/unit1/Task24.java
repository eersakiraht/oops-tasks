package com.tharika.unit1;

class Mobile_shopping {
    String brand;
    int price;
    
    Mobile_shopping() {
        System.out.println("Default Constructor Called!");
        this.brand = "Unknown";
        this.price = 0;
    }
   
    Mobile_shopping(String brand) {
        System.out.println("One-Parameter Constructor Called!");
        this.brand = brand;
        this.price = 0; 
    }
    
    
    Mobile_shopping(String brand, int price) {
        System.out.println("Two-Parameter Constructor Called!");
        this.brand = brand;
        this.price = price;
    }
}

public class Task24 {
    public static void main(String[] args) {
        System.out.println("--- Creating m1 ---");
        Mobile_shopping m1 = new Mobile_shopping();
        
        System.out.println("\n--- Creating m2 ---");
        Mobile_shopping m2 = new Mobile_shopping("Apple");
        
        System.out.println("\n--- Creating m3 ---");
        Mobile_shopping m3 = new Mobile_shopping("Samsung", 400000);
        
        System.out.println("\n--- Mobile Details ---");
        System.out.println("Brand: " + m1.brand + "\nPrice: " + m1.price);
        System.out.println("Brand: " + m2.brand + "\nPrice: " + m2.price);
        System.out.println("Brand: " + m3.brand + "\nPrice: " + m3.price);
    }
}
