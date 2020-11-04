package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Admin;
import com.cdac.dto.Order;
import com.cdac.dto.User;
import com.cdac.serv.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "admin_menu.htm",method = RequestMethod.GET)
	public String adminhome(ModelMap map) {
		map.put("admin", new Admin());
		return"add_menu_form";
	}
	
	@RequestMapping(value = "addmenu_form.htm",method = RequestMethod.POST)
	public String addmenuform(Admin admin,ModelMap map){
		int userId =5;
		admin.setUserId(userId);
		adminService.addMenu(admin);
		return"add_menu_form";
	}
	
	@RequestMapping(value = "admin_menu_list.htm",method = RequestMethod.GET)
	public String adminmenulist(ModelMap map) {
		int userId =5;
		List<Admin> li= adminService.selectAll(userId);
		map.put("alist", li);
		return"admin_list_form";
	}
	
	@RequestMapping(value = "a_m_delete.htm",method = RequestMethod.GET)
	public String menudelete(@RequestParam int dishId,ModelMap map) {

		adminService.removeMenu(dishId);
		//System.out.println(" after remove method");
		int userId =5;
		List<Admin> li= adminService.selectAll(userId);
		map.put("alist", li);
		//System.out.println("End");
		return"admin_list_form";
	}
	
	@RequestMapping(value = "a_m_update.htm",method = RequestMethod.GET)
	public String menuupdate( @RequestParam int dishId,ModelMap map,HttpSession session) {
		Admin li =  adminService.findMenu(dishId);
		map.put("menu", li);
		//System.out.println("End");
		return"update_admin_menu_form";
		
	}
	
	
	@RequestMapping(value = "a_menu_update.htm",method = RequestMethod.POST)
	public String menuupdateuser( Admin admin,ModelMap map,HttpSession session) {
		
		int userId =5;
		admin.setUserId(userId);
		adminService.modifyMenu(admin);
		List<Admin> li= adminService.selectAll(userId);
		map.put("alist", li);
		//System.out.println("End");
		return"admin_list_form";
		
	}
	
}
