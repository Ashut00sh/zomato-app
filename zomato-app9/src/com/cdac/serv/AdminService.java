package com.cdac.serv;

import java.util.List;

import com.cdac.dto.Admin;

public interface AdminService {
	void addMenu(Admin admin);
	void removeMenu(int dishId);
	Admin findMenu(int dishId);
	void modifyMenu(Admin admin);
	List<Admin> selectAll(int userId);
}
