package com.santosh.projects.resourceserver.dao.Impl;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.santosh.projects.resourceserver.dao.UserDao;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Collection<Map<String, Object>> getUsers() {
		Collection<Map<String, Object>> users = jdbcTemplate.queryForList(DaoUtil.GET_ALL_USERS_QUERY);
		return users;
	}
}
