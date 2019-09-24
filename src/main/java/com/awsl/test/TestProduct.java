package com.awsl.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awsl.entity.Product;
import com.awsl.service.ProductService;

public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService service=   (ProductService) context.getBean("productService");
		List<Product> list =service.queryCid(83);
		for(Product p:list) {
			System.out.println(p);
		}
	}

}
