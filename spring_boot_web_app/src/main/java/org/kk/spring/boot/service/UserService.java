package org.kk.spring.boot.service;

import java.util.List;

import org.kk.spring.boot.model.User;

public interface UserService {

	public Long saveUser(User user);
	
	public List<User> getAllUser();
	
	public void deleteUserById(Long userId);
	
	public void updateUser(User user);
	
	public User getUserById(Long uid);
}
