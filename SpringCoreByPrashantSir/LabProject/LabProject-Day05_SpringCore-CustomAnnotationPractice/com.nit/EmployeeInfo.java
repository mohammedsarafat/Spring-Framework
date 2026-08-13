package com.nit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeInfo {

    int id();

    String name();

    String department();
}
