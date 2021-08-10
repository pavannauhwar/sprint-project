package com.cg.ofr.services;

import java.util.List;

import com.cg.ofr.entities.User;
import com.cg.ofr.exception.UserNotFoundException;

public interface IUserService {
	public User viewUser(int id) throws UserNotFoundException;
	public List<User> viewAllUser();
	public User validateUser(String username,String password) throws UserNotFoundException;
	public User addUser(User user);
	public User updateUser(User user);
	public User updatePassword(User user,String newpass);
	public User removeUser(User user);
}
