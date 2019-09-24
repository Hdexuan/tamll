package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Property;


public interface PropertyDao extends BaseDao<Property>{
	//登陆
	public Property login(String username,String password);
	
	
	//批量删除数据
	//有主机编号拼接成的字符串，用逗号隔开，格式："1,2,3"
	public void deleteMore(String ids);
	
	
	//批量增加
	public void addMor(List<Property> list);
	
	//查询所有数据
	public List<Property> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
