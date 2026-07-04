package com.nit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodDeliveryContext context = new FoodDeliveryContext();

        System.out.println("====== Food Delivery System ======");

        System.out.println("1. Swiggy");
        System.out.println("2. Zomato");

        System.out.print("Enter Your Choice : ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                context.setDeliveryService(new SwiggyDelivery());
                break;

            case 2:
                context.setDeliveryService(new ZomatoDelivery());
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;

        }

        context.executeDelivery();

        sc.close();
    }

}
