package com.awsl.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.awsl.dao.UserDao;
import com.awsl.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	private final String namespace="User";
	
	/**
	 * 用户登陆
	 */
	@Override
	public User login(String username, String password) {
		Map<String, String> map=new  HashMap<>();
		map.put("username", username);
		map.put("password", password);
		return getSqlSession().selectOne(namespace+".login",map);
	}

	@Override
	public void addMor(List<User> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
