package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.entity.Residencia;
import com.house.solution.dao.ResidenciaDAO;

public class ResidenciaDAOImpl extends DAOImpl<Residencia, Integer> implements ResidenciaDAO{

	public ResidenciaDAOImpl(EntityManager em) {
		super(em);
	}

}
