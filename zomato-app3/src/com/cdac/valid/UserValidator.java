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
		System.out.println("inside user validator ");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName", "userkey", "username required");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userPass", "passkey","password requird");
		System.out.println("inside user validator 1");
	//User user =(User) target;
//	if(user.getUserPass()!=null) {
//		if(user.getUserPass().length()<2) {
//			errors.rejectValue("userPass","pakey","More than two char requird");
//		}
//	}
	}
	

}
