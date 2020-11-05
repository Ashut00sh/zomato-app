package com.cdac.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

public class RegistrerValid implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("inside register valid");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName", "userkey", "username required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userPass", "passkey","password requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email", "ekey","email requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"phone", "pkey","phone requird");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"address", "addkey","address requird");
	}

}
