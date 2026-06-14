package com.nit.service;

import org.springframework.stereotype.Component;

@Component("forex")
public class ForexExchangeService implements ExchangeRateService {

	@Override
	public double getExchangeRate() {
		return 0.01170;
	}

	@Override
	public String getProviderName() {
		return "FOREX";
	}
}
