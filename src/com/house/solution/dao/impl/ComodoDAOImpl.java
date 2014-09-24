package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.dao.ComodoDAO;
import com.house.solution.entity.Comodo;

public class ComodoDAOImpl extends DAOImpl<Comodo, Integer> implements ComodoDAO {

	public ComodoDAOImpl(EntityManager em) {
		super(em);
	}

}
