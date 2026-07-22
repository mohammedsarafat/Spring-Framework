package com.nit.project01;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("startup")
public class BankOperation {

    private double balance = 10000;

    @Autowired
    private ApplicationContext context;

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Deposit Amount : ");
                double dep = sc.nextDouble();
                balance += dep;
                System.out.println("Amount Deposited Successfully");
                break;

            case 2:
                System.out.print("Enter Withdraw Amount : ");
                double with = sc.nextDouble();

                if (with <= balance) {
                    balance -= with;
                    System.out.println("Amount Withdrawn Successfully");
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.println("Current Balance : " + balance);
                break;

            case 4:
                BankReport report = context.getBean(BankReport.class);
                report.generateReport();
                break;

            case 5:
                System.out.println("Thank You...");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}


