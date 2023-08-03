package com.cbfacademy.accounts;

public class Account {
    protected double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;

    };

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
         balance += amount;
        
        
    }

    public void withdraw(double amount){
        if (amount > balance) {
           System.out.println("Insuficient Funds"); 
        }
        else {
            balance -= amount;

        }
        
    }


    
}
