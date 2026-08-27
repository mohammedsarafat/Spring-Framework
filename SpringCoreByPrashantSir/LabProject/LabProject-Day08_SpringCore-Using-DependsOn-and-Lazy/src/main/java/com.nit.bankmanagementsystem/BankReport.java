package com.nit.bankmanagementsystem;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BankReport {

    public BankReport() {
        System.out.println("Bank Report Module Initialized...");
    }

    public void generateReport() {
        System.out.println("--------------------------------");
        System.out.println("Generating Bank Report...");
        System.out.println("Account Balance Report Generated.");
        System.out.println("--------------------------------");
    }
}
