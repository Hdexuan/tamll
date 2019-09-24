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
	public Product queryCid(int cid) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("id", cid);
		return  (Product) getSqlSession().selectCursor(namespace+".queryCid", map);
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
