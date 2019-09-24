package com.awsl.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.awsl.entity.Category;
import com.awsl.service.CategorySercive;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategorySercive{

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
