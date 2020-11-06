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

import com.cdac.dto.Admin;
import com.cdac.dto.Order;
@Repository
public class AdminDaoImple implements AdminDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public void insertMenu(Admin admin) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(admin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public void deleteMenu(int dishId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Admin(dishId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public Admin selectMenu(int dishId) {
	Admin admin=	hibernateTemplate.execute(new HibernateCallback<Admin>() {
			@Override
			public Admin doInHibernate(Session session) throws HibernateException {
			Transaction tr = session.beginTransaction();
			Admin ad = (Admin)session.get(Admin.class,dishId);
				return ad;
			}
		});
		return admin;
	}

	@Override
	public void updateMenu(Admin admin) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(admin);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public List<Admin> selectAllMenu(int userId) {
	List<Admin> ad = hibernateTemplate.execute(new HibernateCallback<List<Admin>>() {
		
			@Override
			public List<Admin> doInHibernate(Session session) throws HibernateException {
				System.out.println("inside selectall before transaction");
				Transaction tr = session.beginTransaction();
				System.out.println("befor create query");
				Query q= session.createQuery("from Admin where userId=?");
				System.out.println("after create query");
				q.setInteger(0, userId);
				List<Admin> al=q.list();
				System.out.println("get list in al");
				tr.commit();
				session.flush();
				session.close();
				return al;
			}
		});
		return ad;
	}

}
