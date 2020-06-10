package com.aneesh.springSecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcServletInitializer extends
				AbstractAnnotationConfigDispatcherServletInitializer{


	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {DemoAppConfig.class};
		
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
