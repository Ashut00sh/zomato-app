package com.cdac.cntr;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Admin;
import com.cdac.dto.User;
import com.cdac.serv.UserService;

import com.cdac.valid.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	@Autowired
	private MailSender mailSender;

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
			System.out.println("inside validator if");
			return "login_form";
		}
		boolean b = userService.findUser(user);
		 if(b){
			System.out.println("inside else if 1");
			session.setAttribute("userkey", user);
			return "home";
		}
		
		else {
				System.out.println("end else");
				map.put("user", new User());
				return "login_form";
		}
		
	}
	
	@RequestMapping(value = "zadmin_form.htm",method = RequestMethod.GET)
	public String adminform(ModelMap map) {
		map.put("admin", new User());
		return "admin_login_form";
	
	}
	
	
	@RequestMapping(value = "a_login_admin.htm",method = RequestMethod.POST)
	public String adminlogindetail(User user) {
		System.out.println("inside user admin harad"+user.getUserName()+" "+user.getUserPass());
			String Nam="admin";
			String Pass="admin";
		
		if(user.getUserName().equals(Nam)&& user.getUserPass().equals(Pass)) {
			System.out.println("inside if admin");
			return "admin_home";
		}else {
			System.out.println("else");
			return "admin_login_form";
		}
	
	}
	
	
	
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String userName,ModelMap map) {		
		String pass = userService.forgotPassword(userName);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("jadhavashutosh42@gmail.com");  
	        message.setTo(userName);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "check the mail for password";
		}
		map.put("msg", msg);
		return "info";
	}
	
}
