package com.nit.bankmanagementsystem;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("bankStartup")
public class BankOperation {

    private double balance = 10000;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully.");
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully.");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
