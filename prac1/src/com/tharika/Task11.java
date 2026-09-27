package com.tharika;

class BankAccount {
    private int accountNumber; 
    private int balance; 

    public BankAccount(int accountNumber, int balance) { 
        this.accountNumber = accountNumber; 
        this.balance = balance; 
    } 

    public int getAccountNumber() { 
        return accountNumber; 
    } 

    public int getBalance() { 
        return balance; 
    } 

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
} 

public class Task11 { 
    public static void main(String[] args) { 
        BankAccount a1 = new BankAccount(1625, 10000); 
        System.out.println("Original Account: " + a1.getAccountNumber()); 
        System.out.println("Original Balance: " + a1.getBalance()); 

        a1.setAccountNumber(9999);
        a1.setBalance(25000);

        System.out.println("Updated Account: " + a1.getAccountNumber()); 
        System.out.println("Updated Balance: " + a1.getBalance()); 
    } 
}
