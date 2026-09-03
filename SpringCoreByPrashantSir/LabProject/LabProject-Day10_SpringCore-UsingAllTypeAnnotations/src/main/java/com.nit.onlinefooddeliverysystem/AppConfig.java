package com.nit.onlinefooddeliverysystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public DatabaseConnection databaseConnection() {

        DatabaseConnection databaseConnection =
                new DatabaseConnection("FoodDeliveryDB");

        databaseConnection.connectDatabase();

        return databaseConnection;
    }

    @Bean
    @DependsOn("databaseConnection")
    public PaymentGateway paymentGateway() {

        PaymentGateway paymentGateway =
                new PaymentGateway("FoodPay Gateway");

        paymentGateway.startGateway();

        return paymentGateway;
    }

    @Bean
    @DependsOn("paymentGateway")
    public RestaurantService restaurantService() {

        RestaurantService restaurantService =
                new RestaurantService("Rahul Restaurant");

        restaurantService.initializeRestaurant();

        return restaurantService;
    }

    @Bean
    @Scope("prototype")
    public Customer customer() {

        return new Customer(101, "Rahul");
    }

    @Bean
    public OrderService orderService(
            RestaurantService restaurantService,
            Customer customer) {

        return new OrderService(
                1001,
                restaurantService,
                customer
        );
    }
}
