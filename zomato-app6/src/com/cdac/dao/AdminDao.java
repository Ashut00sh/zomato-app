package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Admin;
import com.cdac.dto.Order;

public interface AdminDao {
	void insertMenu(Admin admin);
	void deleteMenu(int dishId);
	Admin selectMenu(int dishId);
	void updateMenu(Admin admin);
	List<Admin> selectAllMenu(int userId);

}
