package com.nit.onlinefooddeliverysystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantService {

    private String restaurantName;

    public void initializeRestaurant() {

        System.out.println("Restaurant Service Initialized...");

    }
}
