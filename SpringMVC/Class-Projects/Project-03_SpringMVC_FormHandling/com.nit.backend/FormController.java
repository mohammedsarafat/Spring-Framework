package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nit.model.Student;

@Controller
public class FormController {

	@RequestMapping("/home")
	public String getHomePage() {
		return "homePage";
	}

	@RequestMapping("/about")
	public String getAboutUs() {
		return "aboutUs";
	}

	@RequestMapping("/profile")
	public ModelAndView getProfilePage() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("profilePage");
		mav.addObject("Msg", "Profile page is very important.");
		return mav;
	}

	@RequestMapping("/registration")
	public ModelAndView getForm() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		return mav;
	}

	@PostMapping("/submit")
	public ModelAndView submit(Student student) {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("profilePage2");

		mav.addObject("student", student);

		return mav;
	}
}
