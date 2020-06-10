package com.aneesh.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	@Override
	public boolean isValid(String theCode,
			ConstraintValidatorContext CVC) {
			boolean result;
		if(theCode != null) {
		 result = theCode.startsWith(coursePrefix);
		}else {
			result = true;
		}
		
		return result;
	}
	
	@Override
	public void initialize(CourseCode cCode) {
		coursePrefix = cCode.value();
	}


}
