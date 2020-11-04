package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Order;

@Repository
public class OrderDaoImple implements OrderDao{
	@Autowired
	private HibernateTemplate hibernateTamplate;
	@Override
	public void insertOrder(Order order) {
		//System.out.println(order.toString()+" "+"insde orderdaoimple");
		order.setUserId(1);
		hibernateTamplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				//System.out.println("1");
				session.save(order);
				//System.out.println("2");
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public void deleteOrder(int orderId) {
		hibernateTamplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(orderId);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public Order selectOrder(int orderId) {
		Order order=hibernateTamplate.execute(new HibernateCallback<Order>() {

			@Override
			public Order doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Order or = (Order)session.get(Order.class, orderId );
				tr.commit();
				session.flush();
				session.close();
				return or;
			}
		});
		return order;
	}

	@Override
	public void updateOrder(Order order) {
		
		hibernateTamplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(order);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public List<Order> selectAll(int userId) {
		List<Order> orderList = hibernateTamplate.execute(new HibernateCallback<List<Order>>() {

			@Override
			public List<Order> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				
				Query q = session.createQuery("from Order where userId=?");
				q.setInteger(0, userId);
				List<Order> or = q.list();
				System.out.println(or);
				tr.commit();
				session.flush();
				session.close();
				return or;
			}
		});
		return orderList;
	}

}
