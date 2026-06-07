package com.nit.beans;

import java.time.LocalDate;

public class DatePrinter {

    private LocalDate currentDate;

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void printDate() {
        System.out.println("Current Date: " + currentDate);
    }
}
