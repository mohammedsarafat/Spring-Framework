package com.nit.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {

    @Autowired
    private LocalDateTime currentDateTime;

    public String generateWishMessage() {

        int hour = currentDateTime.getHour();

        if (hour < 12) {
            return "Good Morning";
        } else if (hour < 18) {
            return "Good Afternoon";
        } else {
            return "Good Evening";
        }
    }
}
