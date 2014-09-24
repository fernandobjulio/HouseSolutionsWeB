package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.entity.Movel;
import com.house.solution.dao.MovelDAO;
import com.house.solution.dao.impl.MovelDAOImpl;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class MovelBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	MovelDAO movelDAO = new MovelDAOImpl(em);
	
	
	public void cadastarMovel(Movel movel){
		try {
			movelDAO.insert(movel);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMovel(Movel movel){
		try {
			movelDAO.update(movel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarMovel(int codMovel){
		try {
			movelDAO.delete(codMovel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Movel buscarMovelPorID(int codMovel){
		try {
			return movelDAO.findById(codMovel);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












