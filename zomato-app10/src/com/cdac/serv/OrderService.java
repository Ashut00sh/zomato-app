package com.cdac.serv;

import java.util.List;

import com.cdac.dto.Order;

public interface OrderService {
	void addOrder(Order order);
	void removeOrder(int orderId);
	Order findOrder(int orderId);
	void modifyOrder(Order order);
	List<Order> selectAlll(int userId);
}
