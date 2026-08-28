package com.nit.bankmanagementsystem;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankOperation bankOperation =
                context.getBean(BankOperation.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    bankOperation.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    bankOperation.withdraw(withdrawAmount);
                    break;

                case 3:
                    bankOperation.checkBalance();
                    break;

                case 4:

                  
                    BankReport report =
                            context.getBean(BankReport.class);

                    report.generateReport();
                    break;

                case 5:
                    System.out.println("Thank you for using Bank Management System.");

                    context.close();
                    sc.close();

                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
