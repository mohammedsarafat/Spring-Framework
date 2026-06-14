package com.nit.service;

import org.springframework.stereotype.Component;

@Component("rbi")
public class RBIExchangeService implements ExchangeRateService {

    @Override
    public double getExchangeRate() {
        return 0.01175;
    }

    @Override
    public String getProviderName() {
        return "RBI";
    }
}
