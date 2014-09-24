package com.house.solution.dao;

public interface DAO <T,K>{
	
	void insert(T entity);
	void update(T entity);
	void delete(K id);
	T findById(K id);

}
