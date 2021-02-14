package org.kk.spring.boot.service.impl;

import java.util.List;

import org.kk.spring.boot.model.User;
import org.kk.spring.boot.repository.UserRepository;
import org.kk.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public Long saveUser(User user) {
		return userRepository.save(user).getUserId();
	}

	@Transactional (readOnly = true)
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Transactional
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}

	@Transactional
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Transactional (readOnly = true)
	public User getUserById(Long uid) {
		return userRepository.getOne(uid);
	}

	
}
