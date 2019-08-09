package com.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("text1") int num1, @RequestParam("text2") int num2, HttpServletRequest request, HttpServletResponse response) {

		// commented out because we are grabbing the request parameters by using annotation
//		int num1 = Integer.parseInt(request.getParameter("text1"));
//		int num2 = Integer.parseInt(request.getParameter("text2"));
		
		// used the service class below to run the sum logic outside of controller class
		//  to achieve high cohesion
		AddService as = new AddService(); 
		int sum = as.add(num1, num2);
		
		// instead of returning the value, it is best to return object of ModelAndView
		//  to achieve low coupling meaning we can now easily change our view page
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("sum", sum);
		
		return mv;
	}
}
