package com.awsl.service;

import java.util.List;

import com.awsl.entity.User;

public interface UserService extends BaseServlce<User>{
	    /**
	     * 登陆
	     * @param username
	     * @param password
	     * @return
	     */
		public User login(String username,String password);
		
		//批量增加
		public void addMor(List<User> list);
		
		//查询所有数据
		public List<User> queryAll();
		
		/**
		 * 检查用户是否存在
		 * @param username
		 * @return
		 */
		public boolean checkUsername(String username);

}
