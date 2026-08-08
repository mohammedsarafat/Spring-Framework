package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("   HOSPITAL MANAGEMENT SYSTEM");
		System.out.println("=================================");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OperationConfig.class);

		OperationDao operation = context.getBean("operation", OperationDao.class);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("=================================");
			System.out.println("       PATIENT MANAGEMENT");
			System.out.println("=================================");
			System.out.println("1. Add Patient");
			System.out.println("2. Display All Patients");
			System.out.println("3. Get Patient By ID");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");
			System.out.println("6. Exit");
			System.out.println("=================================");

			System.out.print("Enter your choice : ");

			int choice;

			try {

				choice = Integer.parseInt(sc.nextLine());

			} catch (Exception e) {

				System.out.println("Invalid input! Please enter a number.");

				continue;
			}

			switch (choice) {

			// =================================================
			// 1. ADD PATIENT
			// =================================================

			case 1:

				try {

					Patient patient = new Patient();

					System.out.print("Enter Patient Name : ");

					patient.setPatientName(sc.nextLine());

					System.out.print("Enter Patient Age : ");

					patient.setAge(Integer.parseInt(sc.nextLine()));

					System.out.print("Enter Patient Gender : ");

					patient.setGender(sc.nextLine());

					System.out.print("Enter Patient Disease : ");

					patient.setDisease(sc.nextLine());

					System.out.print("Enter Doctor Name : ");

					patient.setDoctorName(sc.nextLine());

					System.out.print("Enter Contact Number : ");

					patient.setContactNumber(sc.nextLine());

					int result = operation.insertPatient(patient);

					if (result > 0) {

						System.out.println();
						System.out.println("Patient Added Successfully.");

					} else {

						System.out.println();
						System.out.println("Patient Insertion Failed.");
					}

				} catch (Exception e) {

					System.out.println("Invalid input!");

					System.out.println("Error : " + e.getMessage());
				}

				break;

			// =================================================
			// 2. DISPLAY ALL PATIENTS
			// =================================================

			case 2:

				try {

					List<Patient> patients = operation.getAllPatient();

					if (patients.isEmpty()) {

						System.out.println();
						System.out.println("No Patients Available.");

					} else {

						System.out.println();
						System.out.println("==============================================");

						System.out.println("              ALL PATIENTS");

						System.out.println("==============================================");

						for (Patient p : patients) {

							System.out.println("Patient ID       : " + p.getPatientId());

							System.out.println("Patient Name     : " + p.getPatientName());

							System.out.println("Age              : " + p.getAge());

							System.out.println("Gender           : " + p.getGender());

							System.out.println("Disease          : " + p.getDisease());

							System.out.println("Doctor Name      : " + p.getDoctorName());

							System.out.println("Contact Number   : " + p.getContactNumber());

							System.out.println("----------------------------------------------");
						}
					}

				} catch (Exception e) {

					System.out.println("Unable to fetch patients.");

					System.out.println("Error : " + e.getMessage());
				}

				break;

			// =================================================
			// 3. GET PATIENT BY ID
			// =================================================

			case 3:

				try {

					System.out.print("Enter Patient ID : ");

					int patientId = Integer.parseInt(sc.nextLine());

					Patient patient = operation.getPatientById(patientId);

					if (patient != null) {

						System.out.println();
						System.out.println("=================================");

						System.out.println("        PATIENT DETAILS");

						System.out.println("=================================");

						System.out.println("Patient ID       : " + patient.getPatientId());

						System.out.println("Patient Name     : " + patient.getPatientName());

						System.out.println("Age              : " + patient.getAge());

						System.out.println("Gender           : " + patient.getGender());

						System.out.println("Disease          : " + patient.getDisease());

						System.out.println("Doctor Name      : " + patient.getDoctorName());

						System.out.println("Contact Number   : " + patient.getContactNumber());

						System.out.println("=================================");

					} else {

						System.out.println("Patient Not Found.");
					}

				} catch (Exception e) {

					System.out.println("Patient Not Found.");
				}

				break;

			// =================================================
			// 4. UPDATE PATIENT
			// =================================================

			case 4:

				try {

					System.out.print("Enter Patient ID : ");

					int patientId = Integer.parseInt(sc.nextLine());

					Patient patient = new Patient();

					patient.setPatientId(patientId);

					System.out.print("Enter New Patient Name : ");

					patient.setPatientName(sc.nextLine());

					System.out.print("Enter New Patient Age : ");

					patient.setAge(Integer.parseInt(sc.nextLine()));

					System.out.print("Enter New Patient Gender : ");

					patient.setGender(sc.nextLine());

					System.out.print("Enter New Patient Disease : ");

					patient.setDisease(sc.nextLine());

					System.out.print("Enter New Doctor Name : ");

					patient.setDoctorName(sc.nextLine());

					System.out.print("Enter New Contact Number : ");

					patient.setContactNumber(sc.nextLine());

					int result = operation.updatePatient(patientId, patient);

					if (result > 0) {

						System.out.println();
						System.out.println("Patient Updated Successfully.");

					} else {

						System.out.println();
						System.out.println("Patient Not Found.");
					}

				} catch (Exception e) {

					System.out.println("Patient Update Failed.");

					System.out.println("Error : " + e.getMessage());
				}

				break;

			// =================================================
			// 5. DELETE PATIENT
			// =================================================

			case 5:

				try {

					System.out.print("Enter Patient ID : ");

					int patientId = Integer.parseInt(sc.nextLine());

					int result = operation.deletePatient(patientId);

					if (result > 0) {

						System.out.println();
						System.out.println("Patient Deleted Successfully.");

					} else {

						System.out.println();
						System.out.println("Patient Not Found.");
					}

				} catch (Exception e) {

					System.out.println("Patient Deletion Failed.");

					System.out.println("Error : " + e.getMessage());
				}

				break;

			// =================================================
			// 6. EXIT
			// =================================================

			case 6:

				System.out.println();
				System.out.println("=================================");

				System.out.println(" Application Closed Successfully");

				System.out.println("=================================");

				sc.close();
				context.close();

				return;

			// =================================================
			// DEFAULT
			// =================================================

			default:

				System.out.println();
				System.out.println("Invalid Choice!");

				System.out.println("Please select 1 to 6.");

				break;
			}
		}
	}
}
