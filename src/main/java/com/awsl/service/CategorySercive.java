package com.awsl.service;

import java.util.List;

import com.awsl.entity.Category;

public interface CategorySercive extends BaseServlce<Category>{
	/**
	 * 登陆
	 * @param username
	 * @param password
	 * @return
	 */
	public Category login(String username,String password);
	
	/**
	 * 批量增加
	 * @param list
	 */
	public void addMor(List<Category> list);
	
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Category> queryAll();
	
	/**
	 * 检查用户是否存在
	 * @param username
	 * @return
	 */
	public boolean checkUsername(String username);

}
