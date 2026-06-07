package com.nit.beans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {

    private LocalDate currentDate;
    private double price;

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {

        DayOfWeek day = currentDate.getDayOfWeek();

        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return price - (price * 20 / 100);
        } else {
            return price - (price * 10 / 100);
        }
    }
}
