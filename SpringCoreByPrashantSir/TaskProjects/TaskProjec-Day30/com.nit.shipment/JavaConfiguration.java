package com.nit.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.nit")
@PropertySources({
    @PropertySource("application.properties"),
    @PropertySource("DomesticFedex.properties"),
    @PropertySource("InternationalFedex.properties")
})
public class JavaConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public Bluedart bluedart() {
        return new Bluedart(
                env.getProperty("bluedartTracking"));
    }

    @Bean
    public Delhivery delhivery() {
        return new Delhivery(
                env.getProperty("delhiveryTracking"));
    }

    @Bean
    public DTDC dtdc() {
        return new DTDC(
                env.getProperty("dtdcTracking"));
    }

    @Bean
    @Primary
    public Fedex fedexDomestic() {

        return new Fedex(
                env.getProperty("domesticVendor"),
                env.getProperty("domesticTracking"));
    }

    @Bean
    public Fedex fedexInternational() {

        return new Fedex(
                env.getProperty("intlVendor"),
                env.getProperty("intlTracking"));
    }
}
