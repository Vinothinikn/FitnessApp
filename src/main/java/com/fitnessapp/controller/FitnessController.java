package com.fitnessapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FitnessController {
	
	@RequestMapping(value = "/fitness")
	public String fitness() {
		ModelAndView mv = new ModelAndView();
		
		return "fitness";
	}

}
