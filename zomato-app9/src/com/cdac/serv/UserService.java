package com.cdac.serv;

import com.cdac.dto.User;

public interface UserService {
	void addUser(User user);
	boolean findUser(User user);
	String forgotPassword(String userName);
}
