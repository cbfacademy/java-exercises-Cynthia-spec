package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overDraftLimit;


    public CurrentAccount(double balance, int accountNumber,double overDraftLimit){
        super(balance, accountNumber);
        this.overDraftLimit = overDraftLimit;
    }

@Override
public void withdraw(double amount){
    if (amount > balance + overDraftLimit) {
       System.out.println("Insuficient Funds"); 
    }
    else {
        balance -= amount;

    }
}
    
}
