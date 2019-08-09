package com.spring.controllers;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// this method will return our servlet controller configuration classes
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {FrontControllerConfig.class};
	}

	// this method maps the servlet controller configuartion classes to our url patterns
	@Override
	protected String[] getServletMappings() {
		// this meth
		return new String[] {"/"};
	}

}
