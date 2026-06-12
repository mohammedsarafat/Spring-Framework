package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.PaymentService;
import com.nit.beans.Student;
import com.nit.beans.StudentController;
import com.nit.beans.StudentRepository;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s = context.getBean(Student.class);
		PaymentService service = context.getBean(PaymentService.class);
		StudentRepository repo = context.getBean(StudentRepository.class);
		StudentController controller = context.getBean(StudentController.class);

		s.studying();
		service.tot_price();
		repo.display();
		controller.getController();

	}

}
