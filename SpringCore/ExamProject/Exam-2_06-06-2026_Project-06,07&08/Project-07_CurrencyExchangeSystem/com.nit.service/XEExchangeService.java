
package com.nit.service;

import org.springframework.stereotype.Component;

@Component("xe")
public class XEExchangeService implements ExchangeRateService {

    @Override
    public double getExchangeRate() {
        return 0.01180;
    }

    @Override
    public String getProviderName() {
        return "XE";
    }
}
