package com.spring.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// the below annotations are used to replace our xml files, web and mvc-front-controller-servlet
@Configuration
@ComponentScan({"com.spring.controllers", "com.spring.service"})

public class FrontControllerConfig {

	// used Bean annotation to contain object of InternalResourceViewResolver as Spring Bean
	//  with the help of this Spring Bean we can point to all jsp files in views folder 
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
}
