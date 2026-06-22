package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.beans.Course;
import com.nit.beans.DeliveryMode;

@Component
public class LearningController {

	@Autowired
	@Qualifier("java")
	private Course javaCourse;

	@Autowired
	@Qualifier("python")
	private Course pythonCourse;

	@Autowired
	@Qualifier("dataScience")
	private Course dataScienceCourse;

	@Autowired
	@Qualifier("online")
	private DeliveryMode onlineDelivery;

	@Autowired
	@Qualifier("recorded")
	private DeliveryMode recordedDelivery;

	@Autowired
	@Qualifier("classroom")
	private DeliveryMode classroomDelivery;

	public void enrollJavaCourse() {

		System.out.println("Enrolled in " + javaCourse.getCourseName());

		System.out.println("Delivered via " + onlineDelivery.deliver(javaCourse.getCourseName()));

		System.out.println();
	}

	public void enrollPythonCourse() {

		System.out.println("Enrolled in " + pythonCourse.getCourseName());

		System.out.println("Delivered via " + recordedDelivery.deliver(pythonCourse.getCourseName()));

		System.out.println();
	}

	public void enrollDataScienceCourse() {

		System.out.println("Enrolled in " + dataScienceCourse.getCourseName());

		System.out.println("Delivered via " + classroomDelivery.deliver(dataScienceCourse.getCourseName()));

		System.out.println();
	}
}
