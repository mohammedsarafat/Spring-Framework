package com.nit.entity;

public class CurrencyTransaction {

    private int transactionId;
    private String customerName;
    private String sourceCurrency;
    private String targetCurrency;
    private double amount;

   
    public CurrencyTransaction(int transactionId,
                               String customerName,
                               String sourceCurrency,
                               String targetCurrency,
                               double amount) {

        this.transactionId = transactionId;
        this.customerName = customerName;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

	@Override
	public String toString() {
		return "CurrencyTransaction [transactionId=" + transactionId + ", customerName=" + customerName
				+ ", sourceCurrency=" + sourceCurrency + ", targetCurrency=" + targetCurrency + ", amount=" + amount
				+ "]";
	}
    
    
}
