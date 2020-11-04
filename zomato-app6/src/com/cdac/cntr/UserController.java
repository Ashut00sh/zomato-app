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
	public String register(User user,ModelMap map) {
//			userValidator.validate(user, result);
//			if(result.hasErrors()) {
//				return"reg_form";
//			}else {
			userService.addUser(user);
			return"index";
			//}
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
		}else if(user.getUserName()=="admin" && user.getUserPass()=="admin"){
		System.out.println("mota else");
		System.out.println(user.getUserName()+user.getUserPass());
			System.out.println("inside if admin_home");
		return"admin_home";
		}else {
		boolean b = userService.findUser(user);
		System.out.println("chota else aafter find user");
			if(b) {
				System.out.println("inside else in if");
				session.setAttribute("userkey", user);
				return "home";
			}else{
				map.put("user", new User());
				return "login_form";
			}	
		}
	 }
	}

