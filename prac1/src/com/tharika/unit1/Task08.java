package com.tharika.unit1;

abstract class Shape{
	abstract double area();
}

class Rectangle extends Shape{
	
	int l,b;
	public Rectangle(int l,int b) {
		this.l =l;
		this.b =b;
	}
	@Override
	double area() {
		int a = l*b;
		return a;
	}
}

class Circle extends Shape{
	
	double r;
	
	public Circle(int r) {
		this.r = r;
	}
	@Override
	double area() {
		double a = 3.14*r*r;
		return a;
	}
}

public class Task08{
	public static void main(String[] args) {
		Shape r1 = new Rectangle(5,7);
		Shape c1 = new Circle(5);
		System.out.println("Rectangle Area: "+ r1.area());
		System.out.println("Circle Area: " + c1.area());
		
	}
}