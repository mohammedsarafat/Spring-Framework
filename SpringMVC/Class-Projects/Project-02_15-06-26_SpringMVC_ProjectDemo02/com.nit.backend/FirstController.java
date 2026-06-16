package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/hello")
	public String getHelloPage() {
		return "helloPage";
	}
}
 