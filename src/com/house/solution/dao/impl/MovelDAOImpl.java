package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.dao.MovelDAO;
import com.house.solution.entity.Movel;

public class MovelDAOImpl extends DAOImpl<Movel, Integer> implements MovelDAO{

	public MovelDAOImpl(EntityManager em) {
		super(em);
	}

}
