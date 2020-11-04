package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Order;
import com.cdac.dto.User;
import com.cdac.serv.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping(value = "order_form.htm",method = RequestMethod.GET)
	public String Orderadd(ModelMap map) {
		map.put("order", new Order());
		return "add_order";
	}
	
	@RequestMapping(value = "order_list.htm",method = RequestMethod.POST)
	public String addOrderlist(Order order,ModelMap map,HttpSession session) {
		//System.out.println(order.getMenuName());
		int userId =((User) session.getAttribute("userkey")).getUserId();
		order.setUserId(userId);
		orderService.addOrder(order);
		
		return "home";
	}
	
	@RequestMapping(value = "menu_list.htm",method = RequestMethod.GET)
	public String menulistadd(ModelMap map,HttpSession session) {
		int userId =((User) session.getAttribute("userkey")).getUserId();
		List<Order> li= orderService.selectAlll(userId);
		map.put("olist", li);
		return"menu_list_form";
	}
	
	@RequestMapping(value = "o_delete.htm",method = RequestMethod.GET)
	public String menudelete(@RequestParam int orderId,ModelMap map,HttpSession session) {
		//System.out.println("inside ordercontroller odelete");
		orderService.removeOrder(orderId);
		//System.out.println(" after remove method");
		int userId =((User) session.getAttribute("userkey")).getUserId();
		List<Order> li= orderService.selectAlll(userId);
		map.put("olist", li);
		//System.out.println("End");
		return"menu_list_form";
		
	}
	
	
	@RequestMapping(value = "o_update.htm",method = RequestMethod.GET)
	public String menuupdate( @RequestParam int orderId,ModelMap map,HttpSession session) {
		Order li = orderService.findOrder(orderId);
		map.put("order", li);
		//System.out.println("End");
		return"update_menu_list_form";
		
	}
	
	@RequestMapping(value = "menu_update.htm",method = RequestMethod.POST)
	public String menuupdateuser( Order order,ModelMap map,HttpSession session) {
		
		int userId =((User) session.getAttribute("userkey")).getUserId();
		order.setUserId(userId);
		orderService.modifyOrder(order);
		List<Order> li= orderService.selectAlll(userId);
		map.put("olist", li);
		//System.out.println("End");
		return"menu_list_form";
		
	}
} 
