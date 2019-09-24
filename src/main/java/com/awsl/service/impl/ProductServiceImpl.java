package com.awsl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.awsl.dao.ProductDao;
import com.awsl.entity.Product;
import com.awsl.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{

	@Resource
	private ProductDao productDao;
	
	@Override
	public Product queryCid(int cid) {
		// TODO Auto-generated method stub
		return productDao.queryCid(cid);
	}

	@Override
	public void addMor(List<Product> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
