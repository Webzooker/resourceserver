package com.santosh.projects.resourceserver.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.santosh.projects.resourceserver.dao.UserDao;
import com.santosh.projects.resourceserver.model.User;
import com.santosh.projects.resourceserver.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		
		Collection<Map<String, Object>> users = userDao.getUsers();
		
		List<User> userList = new ArrayList<User>();
		users.stream().map((row) -> {
			User user = new User();
			user.setUserId(String.valueOf(row.get("user_id")));
			user.setFirstName((String) row.get("first_name"));
			user.setLastName((String) row.get("last_name"));
			user.setEmailId((String) row.get("email_id"));
			user.setMobile((String) row.get("mobile"));
			user.setCountry((String) row.get("country"));
			user.setUserType((String) row.get("user_type"));
			return user;
		}).forEach((user) -> {
			userList.add(user);
		});
		return userList;
	}

}
