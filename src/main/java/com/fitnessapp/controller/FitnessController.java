package com.fitnessapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fitnessapp.data.FitnessData;


@Controller
public class FitnessController {
	
	@RequestMapping(value = "/fitness")
	public ModelAndView fitness(HttpServletRequest request) {
		double randomDouble = Math.random();
        int workoutId = (int) (randomDouble * 100);
		ModelAndView mv = new ModelAndView();
		FitnessData fitness = new FitnessData();
		fitness.setWorkOutName(request.getParameter("workOutName"));
		fitness.setWorkOutDate(request.getParameter("workOutDate"));
		fitness.setWorkOutId(workoutId);
		fitness.setWorkOutTime(request.getParameter("workOutTime"));
		mv.setViewName("fitness");
		mv.addObject("fitnessdata", fitness);
		return mv;
	}

}
