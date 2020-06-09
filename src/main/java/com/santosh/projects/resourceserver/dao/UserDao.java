package com.santosh.projects.resourceserver.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	public Collection<Map<String, Object>> getUsers();
	
}