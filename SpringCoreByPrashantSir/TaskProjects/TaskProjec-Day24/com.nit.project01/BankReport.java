package com.nit.project01;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BankReport {

    public BankReport() {
        System.out.println("Loading Report Module...");
    }

    public void generateReport() {
        System.out.println("Generating Bank Report...");
    }
}
