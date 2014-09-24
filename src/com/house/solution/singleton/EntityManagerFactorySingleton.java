package com.house.solution.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory factory;
	
	//Construtor privado para ninguem instanciar a classe
	private EntityManagerFactorySingleton(){
		super();
	}
	
	public static EntityManagerFactory getInstance(){
		
		if(factory == null){
			
			factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
			
		}
		
		return factory;
		
	}

}
