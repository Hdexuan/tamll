package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Propertyvalue;


public interface PropertyvalueDao extends BaseDao<Propertyvalue>{
	//登陆
	public Propertyvalue login(String username,String password);
	
	
	
	
	//批量增加
	public void addMor(List<Propertyvalue> list);
	
	//查询所有数据
	public List<Propertyvalue> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
