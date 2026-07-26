package com.nit.project03;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ResultService {

    public ResultService() {
        System.out.println("ResultService Bean Created");
    }

    public void generateResult() {
        System.out.println("Student Result Generated Successfully");
    }
}
