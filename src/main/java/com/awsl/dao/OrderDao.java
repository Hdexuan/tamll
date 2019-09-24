package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Order;


public interface OrderDao extends BaseDao<Order>{
	//登陆
	public Order login(String username,String password);
	
	//批量增加
	public void addMor(List<Order> list);
	
	//查询所有数据
	public List<Order> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
