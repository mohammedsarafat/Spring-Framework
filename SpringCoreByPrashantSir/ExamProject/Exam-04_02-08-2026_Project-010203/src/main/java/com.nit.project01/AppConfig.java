package com.nit.project01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/nit/project01/application.properties")
public class AppConfig {

    @Value("${customerName}")
    private String customerName;

    @Value("${movieName}")
    private String movieName;

    @Value("${numberOfTickets}")
    private int numberOfTickets;

    @Value("${ticketPrice}")
    private double ticketPrice;

    @Value("${convenienceCharge}")
    private double convenienceCharge;

    @Value("${discountPercentage}")
    private double discountPercentage;

    @Bean
    public static org.springframework.context.support.PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new org.springframework.context.support.PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public MovieBooking movieBooking() {

        MovieBooking booking = new MovieBooking();

        booking.setCustomerName(customerName);
        booking.setMovieName(movieName);
        booking.setNumberOfTickets(numberOfTickets);
        booking.setTicketPrice(ticketPrice);
        booking.setConvenienceCharge(convenienceCharge);
        booking.setDiscountPercentage(discountPercentage);

        return booking;
    }
}
