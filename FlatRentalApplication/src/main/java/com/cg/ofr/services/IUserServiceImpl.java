package com.cg.ofr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ofr.entities.User;
import com.cg.ofr.exception.UserNotFoundException;
import com.cg.ofr.repository.IUserRepository;

@Service
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository userRepo;
	
	@Override
	public User viewUser(int id) throws UserNotFoundException {
		return null;
	}

	@Override
	public List<User> viewAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User validateUser(String username, String password) throws UserNotFoundException {
		return userRepo.validateUser(username, password);
	}

	@Override
	public User addUser(User user) {
		return userRepo.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.updateUser(user);
	}

	@Override
	public User updatePassword(User user, String newpass) {
		return userRepo.updatePassword(user, newpass);
	}

	@Override
	public User removeUser(User user) {
		return userRepo.removeUser(user);
	}

}