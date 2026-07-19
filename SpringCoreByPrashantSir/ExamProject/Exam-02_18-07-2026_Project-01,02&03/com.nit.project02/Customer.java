package com.nit.project02;


public class Customer {
    private int customerId;
    private String customerName;
    private long accountNumber;
    private String accountType;
    private double balance;
    private String mobileNumber;

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer Details\n" +
                "Customer ID      : " + customerId +
                "\nCustomer Name    : " + customerName +
                "\nAccount Number   : " + accountNumber +
                "\nAccount Type     : " + accountType +
                "\nBalance          : " + balance +
                "\nMobile Number    : " + mobileNumber;
    }
}
