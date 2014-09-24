package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.entity.Item;
import com.house.solution.dao.ItemDAO;
import com.house.solution.dao.impl.ItemDAOImpl;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class ItemBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	ItemDAO itemDAO = new ItemDAOImpl(em);
	
	
	public void cadastarItem(Item item){
		try {
			itemDAO.insert(item);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarItem(Item item){
		try {
			itemDAO.update(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarItem(int codItem){
		try {
			itemDAO.delete(codItem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Item buscarItemPorID(int codItem){
		try {
			return itemDAO.findById(codItem);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












