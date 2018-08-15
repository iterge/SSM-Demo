package com.lph.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lph.dao.UserDao;
import com.lph.entities.User;
import com.lph.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao ud;
	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return ud.getUserById(id);
	}
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return ud.insertUser(user);
	}
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return ud.updateUser(user);
	}
	@Override
	public int deleteUser(String id) {
		// TODO Auto-generated method stub
		return ud.deleteUser(id);
	}
	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return ud.userList();
	}
	
}
