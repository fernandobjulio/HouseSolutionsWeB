package com.house.solution.bo;

import javax.persistence.EntityManager;

import com.house.solution.entity.Usuario;
import com.house.solution.dao.UsuarioDAO;
import com.house.solution.dao.impl.UsuarioDAOImpl;
import com.house.solution.singleton.EntityManagerFactorySingleton;

public class UsuarioBO {

	EntityManager em = 
			EntityManagerFactorySingleton.getInstance().
								createEntityManager();
	
	UsuarioDAO usuarioDAO = new UsuarioDAOImpl(em);
	
	
	public void cadastarUsuario(Usuario usuario){
		try {
			usuarioDAO.insert(usuario);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarUsuario(Usuario usuario){
		try {
			usuarioDAO.update(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminarUsuario(int codUsuario){
		try {
			usuarioDAO.delete(codUsuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Usuario buscarUsuarioPorID(int codUsuario){
		try {
			return usuarioDAO.findById(codUsuario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}












