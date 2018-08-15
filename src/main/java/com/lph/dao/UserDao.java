package com.lph.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lph.entities.User;
@Repository
public interface UserDao {
	public User getUserById(String id);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(String id);
	public List<User> userList();
}
