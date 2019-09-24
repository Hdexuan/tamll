package com.awsl.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.awsl.dao.BaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T>{

	
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public void add(T t) {//getSimpleName() 获取 使用类（T）的类名
		getSqlSession().insert(t.getClass().getSimpleName()+".add",t);
		
	}

	@Override
	public void update(T t) {
		getSqlSession().insert(t.getClass().getSimpleName()+".update",t);
		
	}

	@Override
	public void deleteById(Class<?> cls, Serializable id) {
		getSqlSession().delete(cls.getSimpleName()+".deleteById",id);
		
	}

	@Override
	public T queryById(Class<?> cls, Serializable id) {
		return getSqlSession().selectOne(cls.getSimpleName()+".queryById",id);
		
	}

	@Override
	public List<T> queryByPage(Class<?> cls, Map<String, Integer> map) {
		// TODO Auto-generated method stub
		 return getSqlSession().selectList(cls.getSimpleName()+".queryByPage", map);
	}

	@Override
	public int getTotals(Class<?> cls) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(cls.getSimpleName()+".getTotals");
	}

	@Override
	public void deleteMore(String ids) {
		// TODO Auto-generated method stub
		
	}

}
