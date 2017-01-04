package com.niit.ElectronicsCart.backend.dao;

import java.util.List;

import com.niit.ElectronicsCart.backend.model.User;

public interface UserDao 
{
 
	public List<User> list();
	//getting user list//
	public User get(String id);
	//to get the id details//
	public User validate (String id,String password);
	//if it is true,value it will return user..else it will return null//
	public boolean save(User user);
	//to save user//
	public boolean update (User user);
	
	
	
	
	
	
	
	
}
