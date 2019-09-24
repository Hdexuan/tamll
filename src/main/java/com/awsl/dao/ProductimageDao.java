package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Productimage;


public interface ProductimageDao extends BaseDao<Productimage>{
	//登陆
	public Productimage login(String username,String password);
	
	//批量增加
	public void addMor(List<Productimage> list);
	
	//查询所有数据
	public List<Productimage> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
