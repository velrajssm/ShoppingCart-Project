package com.niit.ElectronicsCart.backend.com.niit.ElectronicsCart.backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ElectronicsCart.backend.dao.UserDao;
import com.niit.ElectronicsCart.backend.model.User;

public class UserTest {

	public static void main(String[] args) {
		
	
		
				AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
				context.scan("com.niit");
				context.refresh();
				
				
				UserDao userDao=(UserDao)context.getBean("userDao");
				User user=(User)context.getBean("user");
				
				
				user.setId(20);
				user.setName("raj");
				user.setPassword("123");
				user.setMobile("8187007009");
				user.setRole("A");
				
				
				//List<User> u= userDao.list();
				//for(User m: u)
				//	System.out.println(m.getId()+" \t"+m.getName()+"\t"+m.getMobile()+"\t"+m.getPassword());
				//userDao.save(user);
				userDao.save(user);
				//userDao.update(user);
			
			}


	}

