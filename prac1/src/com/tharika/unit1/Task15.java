package com.tharika.unit1;

class Book{
	int bookid;
	String title;
	String author;
}

public class Task15 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookid = 10;
		b1.title = "Hello Java!";
		b1.author = "Oracle";
		System.out.println("Book ID: " + b1.bookid +
				"\nBook Title: " + b1.title +
				"\nBook Author: " + b1.author);
	}
}
