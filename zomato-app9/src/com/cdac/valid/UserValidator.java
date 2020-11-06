package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

@Service
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName", "userkey", "username required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userPass", "passkey","password requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email", "ekey","email requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"phone", "phkey","phone requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"address", "addkey","address requird");
		
//		User user =(User) target;
//	if(user.getUserPass()!=null) {
//		if(user.getUserPass().length()<=2) {
//			errors.rejectValue("userPass","passkey","More than two char requird");
//		}
//	}
	}
	

}
