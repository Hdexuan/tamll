package com.awsl.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.awsl.dao.ProductDao;
import com.awsl.entity.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {

	private final String namespace="Product";

	@Override
	public List<Product> queryCid(int cid) {
		return  getSqlSession().selectList(namespace+".queryCid", cid);
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
