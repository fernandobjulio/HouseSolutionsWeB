package com.house.solution.dao.impl;

import javax.persistence.EntityManager;

import com.house.solution.dao.ItemDAO;
import com.house.solution.entity.Item;

public class ItemDAOImpl extends DAOImpl<Item, Integer> implements ItemDAO{

	public ItemDAOImpl(EntityManager em) {
		super(em);
	}

}
