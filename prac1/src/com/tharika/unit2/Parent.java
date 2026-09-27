package com.tharika.unit2;

public class Parent {
    
    public String publicVar = "Public: Hello Everywhere!";

   
    protected String protectedVar = "Protected: Hello Subclasses!";

    
    String defaultVar = "Default: Hello Package Buddies!";

    
    private String privateVar = "Private: Hidden from everyone else!";

    
    public void showPrivate() {
        System.out.println(privateVar);
    }
}
