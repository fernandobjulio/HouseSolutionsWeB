package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.dao.RepositorioDAO;
import com.house.solution.entity.Repositorio;

public class RepositorioDAOImpl extends DAOImpl<Repositorio, Integer> implements RepositorioDAO{

	public RepositorioDAOImpl(EntityManager em) {
		super(em);
	}

}
