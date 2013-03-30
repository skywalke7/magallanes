package com.kuku.administrator.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//import static com.kuku.administrator.util.Constants.GENDER;

public class NotEmptyValidator implements ConstraintValidator<NotEmpty , String>{

	private NotEmpty notEmpty;
	
	public void initialize(NotEmpty constraintAnnotation) {
		// TODO Auto-generated method stub
		this.notEmpty = constraintAnnotation;
		
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		/*if(value != null && !value.isEmpty() && notEmpty.field().equals(GENDER)){
			
			return true;
		
		}*/if(value == null || value.isEmpty()){
			
			return false;
			
		}else{
			
			return true;
			
		}
	}

}
