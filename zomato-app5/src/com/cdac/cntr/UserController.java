package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.User;
import com.cdac.serv.UserService;

import com.cdac.valid.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;


	@RequestMapping(value="regi_form.htm",method = RequestMethod.GET)
	public  String regform(ModelMap map) {
		map.put("user",new User());
		return "reg_form";
	}
	
	@RequestMapping(value="reg.htm",method = RequestMethod.POST)
	public String register(User user,ModelMap map,BindingResult result) {
			userValidator.validate(user, result);
			if(result.hasErrors()) {
				return"reg_form";
			}else {
			userService.addUser(user);
			return"index";
			}
	}
	
	@RequestMapping(value = "zlogin_form.htm",method = RequestMethod.GET)
	public String loginform(ModelMap map) {
		map.put("user", new User());
		return "login_form";
	}
	
	@RequestMapping(value = "login.htm",method = RequestMethod.POST)
	public String loginuser(User user,BindingResult result,ModelMap map,HttpSession session) {
		System.out.println("inside usercontroller");
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "login_form";
		}
		boolean b = userService.findUser(user);
			if(b) {
			session.setAttribute("userkey", user);
			return "home";
			}else {
				map.put("user", new User());
				return "login_form";
			}
			
				
			
	}
}
