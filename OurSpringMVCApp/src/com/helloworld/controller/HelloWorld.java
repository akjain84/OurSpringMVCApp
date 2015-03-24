package com.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Arun and Rajeev
 *
 */

@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello Arun and Rajeev, Spring MVC Tutorial</h3>This message is coming from HelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
