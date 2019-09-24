package com.awsl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awsl.entity.Category;
import com.awsl.service.CategorySercive;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CategorySercive service= (CategorySercive) context.getBean("categoryService");
		Category cate=service.queryById(Category.class, 60);
		System.out.println(cate);
	}

}
