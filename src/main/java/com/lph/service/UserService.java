package com.lph.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lph.entities.User;

@Service
public interface UserService {
	public User getUserById(String id);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(String id);
	public List<User> userList();
}
