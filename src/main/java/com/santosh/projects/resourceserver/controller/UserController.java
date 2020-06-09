package com.santosh.projects.resourceserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santosh.projects.resourceserver.service.UserService;
import com.santosh.projects.resourceserver.util.AppUtil;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = AppUtil.FETCH_USERS_URI, method = RequestMethod.GET)
	public ResponseEntity<Object> getUsers() {
		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}
	//fetchUsers
	//newUser
	//modifyUser
	//removeUesr
}
