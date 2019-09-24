package com.awsl.dao;

import java.util.List;

import com.awsl.entity.Product;


public interface ProductDao extends BaseDao<Product>{
	
	/**
	 * 根据category 的id 与cid 匹对，显示不同产品
	 * @param cid
	 * @return
	 */
	public Product queryCid(int cid);
	
	//批量增加
	public void addMor(List<Product> list);
	
	//查询所有数据
	public List<Product> queryAll();
	
	//检查用户是否存在
	public boolean checkUsername(String username);

}
