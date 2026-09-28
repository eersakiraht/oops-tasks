package com.tharika.unit1;

import com.tharika.unit2.Parent;

public class Task18 extends Parent {
	public static void main(String[] args) {
    
     Task18 obj = new Task18();

     System.out.println("--- Accessing Fields from com.tharika.unit2 ---");

     System.out.println(obj.publicVar);

     System.out.println(obj.protectedVar);

     System.out.println("Default: [BLOCKED] Cannot access outside package1");

    
     System.out.println("Private: [BLOCKED] Cannot access outside Parent class");
     
     System.out.print("Private via Helper: ");
     obj.showPrivate();
	}
}
