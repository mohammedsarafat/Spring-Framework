package com.nit;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nit")
public class HospitalManagementApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        HospitalManagementApplication.class);

        PatientService patientService =
                context.getBean(PatientService.class);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. Generate Medical Report");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String registerName = scanner.nextLine();

                    patientService.registerPatient(registerName);
                    break;

                case 2:
                    System.out.print("Enter patient name: ");
                    String searchName = scanner.nextLine();

                    patientService.searchPatient(searchName);
                    break;

                case 3:
                    System.out.print("Enter patient name: ");
                    String appointmentName = scanner.nextLine();

                    patientService.bookAppointment(appointmentName);
                    break;

                case 4:

                    MedicalReportService reportService =
                            context.getBean(MedicalReportService.class);

                    reportService.generateMedicalReport();
                    break;

                case 5:

                    System.out.println(
                            "Thank you for using Hospital Management System.");

                    context.close();
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
