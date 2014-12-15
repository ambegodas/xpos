/**
 * @autor pathmasri
 * Dec 15, 2014 5:17:56 AM
 */
package com.test.xpos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	String message = "Welcome to ";
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Test") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	

}
