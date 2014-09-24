package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.entity.Repositorio;
import com.house.solution.dao.RepositorioDAO;
import com.house.solution.dao.impl.RepositorioDAOImpl;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class RepositorioBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	RepositorioDAO repositorioDAO = new RepositorioDAOImpl(em);
	
	
	public void cadastarRepositorio(Repositorio repositorio){
		try {
			repositorioDAO.insert(repositorio);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarRepositorio(Repositorio repositorio){
		try {
			repositorioDAO.update(repositorio);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarRepositorio(int codRepositorio){
		try {
			repositorioDAO.delete(codRepositorio);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Repositorio buscarRepositorioPorID(int codRepositorio){
		try {
			return repositorioDAO.findById(codRepositorio);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












