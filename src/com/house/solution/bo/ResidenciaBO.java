package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.entity.Residencia;
import com.house.solution.dao.ResidenciaDAO;
import com.house.solution.dao.impl.ResidenciaDAOImpl;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class ResidenciaBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	ResidenciaDAO residenciaDAO = new ResidenciaDAOImpl(em);
	
	
	public void cadastarResidencia(Residencia residencia){
		try {
			residenciaDAO.insert(residencia);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarResidencia(Residencia residencia){
		try {
			residenciaDAO.update(residencia);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarResidencia(int codResidencia){
		try {
			residenciaDAO.delete(codResidencia);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Residencia buscarResidenciaPorID(int codResidencia){
		try {
			return residenciaDAO.findById(codResidencia);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












