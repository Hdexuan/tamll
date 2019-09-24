package com.awsl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awsl.entity.User;
import com.awsl.service.UserService;

public class TestUser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service=  (UserService) context.getBean("userService");
		User user=service.queryById(User.class, 1);
		System.out.println(user);
	}

}
