package com.nit.strategy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("====== Shopping Cart System ======");

        System.out.println("1. Amazon");
        System.out.println("2. Flipkart");
        System.out.println("3. Myntra");
        System.out.println("");

        System.out.print("Enter Platform Choice : ");
        int choice = sc.nextInt();

        System.out.print("Enter Bill Amount : ");
        double amount = sc.nextDouble();

        switch (choice) {

            case 1:
                cart.setStrategy(new AmazonStrategy());
                break;

            case 2:
                cart.setStrategy(new FlipkartStrategy());
                break;

            case 3:
                cart.setStrategy(new MyntraStrategy());
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;

        }

        double finalAmount = cart.checkout(amount);

        System.out.println("-----------------------------");
        System.out.println("Original Amount : " + amount);
        System.out.println("Final Amount    : " + finalAmount);

        sc.close();
    }

}
