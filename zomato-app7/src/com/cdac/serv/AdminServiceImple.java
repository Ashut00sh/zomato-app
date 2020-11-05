package com.cdac.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AdminDao;
import com.cdac.dto.Admin;

@Service
public class AdminServiceImple implements AdminService{
	@Autowired
	private AdminDao adminDao;

	@Override
	public void addMenu(Admin admin) {
		adminDao.insertMenu(admin);
	}

	@Override
	public void removeMenu(int dishId) {
		adminDao.deleteMenu(dishId);
		
	}

	@Override
	public Admin findMenu(int dishId) {
	
		return adminDao.selectMenu(dishId);
	}

	@Override
	public void modifyMenu(Admin admin) {
		adminDao.updateMenu(admin);		
	}

	@Override
	public List<Admin> selectAll(int userId) {
		System.out.println("adminseviceimple ");
		return adminDao.selectAllMenu(userId);
		 
	}

}
