package com.cdac.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.OrderDao;
import com.cdac.dto.Order;

@Service
public class OrderServiceImple implements OrderService{
	@Autowired
	private OrderDao orderDao;
	@Override
	public void addOrder(Order order) {
		orderDao.insertOrder(order);
		
	}

	@Override
	public void removeOrder(int orderId) {
		System.out.println("inside orderservice");
		orderDao.deleteOrder(orderId);		
	}

	@Override
	public Order findOrder(int orderId) {
		
		return orderDao.selectOrder(orderId);
	}

	@Override
	public void modifyOrder(Order order) {
		orderDao.updateOrder(order);
		
	}

	@Override
	public List<Order> selectAlll(int userId) {
		
		return orderDao.selectAll(userId);
	}

}
