package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.dao.ComodoDAO;
import com.house.solution.dao.impl.ComodoDAOImpl;
import com.house.solution.entity.Comodo;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class ComodoBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	ComodoDAO comodoDAO = new ComodoDAOImpl(em);
	
	
	public void cadastarComodo(Comodo comodo){
		try {
			comodoDAO.insert(comodo);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarComodo(Comodo comodo){
		try {
			comodoDAO.update(comodo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarComodo(int codComodo){
		try {
			comodoDAO.delete(codComodo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Comodo buscarComodoPorID(int codComodo){
		try {
			return comodoDAO.findById(codComodo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












