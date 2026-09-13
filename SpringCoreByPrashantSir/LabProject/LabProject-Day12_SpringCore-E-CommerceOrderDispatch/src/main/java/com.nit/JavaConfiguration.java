package com.nit;

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
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:DomesticFedex.properties"),
        @PropertySource("classpath:InternationalFedex.properties")
})
public class JavaConfiguration {

    @Bean
    public Bluedart bluedart(Environment environment) {

        String tracking =
                environment.getProperty("bluedartTracking");

        return new Bluedart(tracking);
    }

    @Bean
    public Delhivery delhivery(Environment environment) {

        String tracking =
                environment.getProperty("delhiveryTracking");

        return new Delhivery(tracking);
    }

    @Bean
    public DTDC dtdc(Environment environment) {

        String tracking =
                environment.getProperty("dtdcTracking");

        return new DTDC(tracking);
    }

    @Bean
    @Primary
    public Fedex fedexDomestic(Environment environment) {

        String vendor =
                environment.getProperty("domesticVendor");

        String tracking =
                environment.getProperty("domesticTracking");

        return new Fedex(vendor, tracking);
    }

    @Bean
    public Fedex fedexInternational(Environment environment) {

        String vendor =
                environment.getProperty("intlVendor");

        String tracking =
                environment.getProperty("intlTracking");

        return new Fedex(vendor, tracking);
    }
}
