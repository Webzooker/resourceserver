package com.santosh.projects.resourceserver.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.santosh.projects.resourceserver.model.User;

@Service
public interface UserService {

	public List<User> getUsers();
	 

}
