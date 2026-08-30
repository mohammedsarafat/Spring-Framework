package com.nit;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Lazy
@Data
public class MedicalReportService {

    private String reportStatus = "Not Generated";

    public MedicalReportService() {

        System.out.println("--------------------------------------");
        System.out.println("Medical Report Service Initialized...");
        System.out.println("--------------------------------------");
    }

    public void generateMedicalReport() {

        reportStatus = "Generated";

        System.out.println("Generating Medical Report...");
        System.out.println("Reading patient records...");
        System.out.println("Analyzing medical information...");
        System.out.println("Medical Report Generated Successfully.");
    }
}
