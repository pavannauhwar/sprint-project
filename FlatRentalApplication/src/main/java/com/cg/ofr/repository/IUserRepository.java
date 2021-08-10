package com.cg.ofr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.ofr.entities.User;
import com.cg.ofr.exception.UserNotFoundException;

@Repository("userRepo")
public interface IUserRepository extends JpaRepository <User, Integer>{
	
	@ExceptionHandler(UserNotFoundException.class)
	public User viewUser(int id) throws UserNotFoundException;
	
	@Query("SELECT user FROM userTable user")
	public List<User> viewAllUser();
	
	@ExceptionHandler(UserNotFoundException.class)
	public User validateUser(String username,String password) throws UserNotFoundException;
	
	public User addUser(User user);
	public User updateUser(User user);
	public User updatePassword(User user,String newpass);
	public User removeUser(User user);	
}