package com.awsl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awsl.entity.Product;
import com.awsl.service.ProductService;

public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService service=   (ProductService) context.getBean("productService");
		Product product=service.queryById(Product.class, 87);
		System.out.println(product);
	}

}
