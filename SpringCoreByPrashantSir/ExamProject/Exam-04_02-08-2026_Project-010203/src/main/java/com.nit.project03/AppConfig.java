package com.nit.project03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:com/nit/project03/application.properties")
public class AppConfig {

    @Value("${ownerName}")
    private String ownerName;

    @Value("${vehicleNumber}")
    private String vehicleNumber;

    @Value("${vehicleType}")
    private String vehicleType;

    @Value("${insuranceAmount}")
    private double insuranceAmount;

    @Value("${premiumPercentage}")
    private double premiumPercentage;

    @Value("${gstPercentage}")
    private double gstPercentage;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public VehicleInsurance vehicleInsurance() {

        VehicleInsurance insurance = new VehicleInsurance();

        insurance.setOwnerName(ownerName);
        insurance.setVehicleNumber(vehicleNumber);
        insurance.setVehicleType(vehicleType);
        insurance.setInsuranceAmount(insuranceAmount);
        insurance.setPremiumPercentage(premiumPercentage);
        insurance.setGstPercentage(gstPercentage);

        return insurance;
    }
}
