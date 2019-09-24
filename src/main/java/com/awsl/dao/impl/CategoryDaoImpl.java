package com.awsl.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.awsl.dao.CategoryDao;
import com.awsl.entity.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{

	
	@Override
	public Category login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMor(List<Category> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
