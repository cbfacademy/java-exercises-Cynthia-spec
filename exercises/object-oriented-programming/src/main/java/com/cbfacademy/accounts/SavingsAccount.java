package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

private double interest;

    
    public SavingsAccount(double balance, int accountNumber,double interest){
        super(balance, accountNumber);
        this.interest = interest;
    }
    
    
    public void addInterest() {
        balance += balance * interest;
       
       
   }


    
}
