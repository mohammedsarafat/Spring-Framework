package com.nit.project02;

import java.util.List;

public class Customer {

    private int customerId;
    private String customerName;
    private Address address;
    private List<String> contactNumbers;

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactNumbers(List<String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    @Override
    public String toString() {
        return "Customer Details\n" +
                "-------------------------\n" +
                "Customer Id      : " + customerId + "\n" +
                "Customer Name    : " + customerName + "\n" +
                "Address          : " + address + "\n" +
                "Contact Numbers  : " + contactNumbers;
    }
}
