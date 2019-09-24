package com.awsl.dao;

import java.util.List;

import com.awsl.entity.User;


public interface UserDao extends BaseDao<User>{
	//登陆
	public User login(String username,String password);
	
	//批量增加
	public void addMor(List<User> list);
	
	//查询所有数据
	public List<User> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
