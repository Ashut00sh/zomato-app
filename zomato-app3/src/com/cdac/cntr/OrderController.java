package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Order;
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
	public String addOrderlist(Order order,ModelMap map) {
		//System.out.println(order.getMenuName());
		orderService.addOrder(order);
		
		return "home";
	}
} 
