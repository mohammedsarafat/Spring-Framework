package com.nit.project02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:com/nit/project02/application.properties")
public class AppConfig {

    @Value("${senderName}")
    private String senderName;

    @Value("${receiverName}")
    private String receiverName;

    @Value("${packageWeight}")
    private double packageWeight;

    @Value("${distance}")
    private double distance;

    @Value("${chargePerKilogram}")
    private double chargePerKilogram;

    @Value("${deliveryCharge}")
    private double deliveryCharge;

    @Value("${gstPercentage}")
    private double gstPercentage;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Courier courier() {

        Courier courier = new Courier();

        courier.setSenderName(senderName);
        courier.setReceiverName(receiverName);
        courier.setPackageWeight(packageWeight);
        courier.setDistance(distance);
        courier.setChargePerKilogram(chargePerKilogram);
        courier.setDeliveryCharge(deliveryCharge);
        courier.setGstPercentage(gstPercentage);

        return courier;
    }
}
