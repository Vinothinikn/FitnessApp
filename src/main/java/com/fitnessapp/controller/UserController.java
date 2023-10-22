package com.fitnessapp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeUser(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcomeUser");
		mv.addObject("username", name);
		
		return mv;
	}

}
