package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Review;


public interface ReviewDao extends BaseDao<Review>{
	//登陆
	public Review login(String username,String password);
	//批量增加
	public void addMor(List<Review> list);
	
	//查询所有数据
	public List<Review> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
