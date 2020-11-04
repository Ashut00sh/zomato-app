package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Order;

public interface OrderDao {

	void insertOrder(Order order);
	void deleteOrder(int orderId);
	Order selectOrder(int orderId);
	void updateOrder(Order order);
	List<Order> selectAll(int userId);
}
