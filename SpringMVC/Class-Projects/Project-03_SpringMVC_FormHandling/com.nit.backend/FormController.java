package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.nit.model.Student;

@Controller
public class FormController {

    @GetMapping("/home")
    public String home() {
        return "homePage";
    }

    @GetMapping("/about")
    public String about() {
        return "aboutUs";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/submit")
    public ModelAndView submit(@ModelAttribute Student student) {

        ModelAndView mav = new ModelAndView();

        mav.setViewName("studentProfilePage");

        mav.addObject("student", student);

        return mav;
    }
    
    @GetMapping("/profile")
    public String profilePage() {
        return "profilePage";
    }

}
