package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Orderitem;


public interface OrderitemDao extends BaseDao<Orderitem>{
	//登陆
	public Orderitem login(String username,String password);
	//批量增加
	public void addMor(List<Orderitem> list);
	
	//查询所有数据
	public List<Orderitem> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
