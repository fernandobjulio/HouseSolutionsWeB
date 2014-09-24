package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.dao.UsuarioDAO;
import com.house.solution.entity.Usuario;

public class UsuarioDAOImpl extends DAOImpl<Usuario, Integer> implements UsuarioDAO{

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}

}
