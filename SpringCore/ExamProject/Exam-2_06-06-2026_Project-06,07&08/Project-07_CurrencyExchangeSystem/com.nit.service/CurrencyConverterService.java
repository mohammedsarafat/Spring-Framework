
package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nit.entity.CurrencyTransaction;

@Service
public class CurrencyConverterService {

	private ExchangeRateService exchangeRateService;

	@Autowired
	public CurrencyConverterService(@Qualifier("rbi") ExchangeRateService exchangeRateService) {

		this.exchangeRateService = exchangeRateService;
	}

	public void convertCurrency(CurrencyTransaction transaction) {

		if (transaction.getCustomerName() == null || transaction.getCustomerName().trim().isEmpty()) {

			throw new IllegalArgumentException("Customer name cannot be empty");
		}

		if (transaction.getAmount() <= 0) {

			throw new IllegalArgumentException("Amount must be greater than zero");
		}

		double convertedAmount = transaction.getAmount() * exchangeRateService.getExchangeRate();

		System.out.println("Conversion Successful");
		System.out.println("Provider: " + exchangeRateService.getProviderName());

		System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, transaction.getTargetCurrency());

		System.out.println("Status: Success");
	}
}
