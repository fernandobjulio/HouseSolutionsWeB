package com.house.solution.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HS_USUARIO")
@SequenceGenerator(name="seqUsuario",sequenceName="SEQ_USUARIO",allocationSize=1)
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqUsuario")
	@Column(name="CD_USUARIO")
	private int idUsuario;
	
	@Column(name="US_LOGIN",length=40)
	private String login;
	
	@Column(name="US_PASSWORD",length=40)
	private String senha;
	
	@Column(name="NM_USUARIO",length=40)
	private String nomeUsuario;
	
	
	//Construtor
	public Usuario(int idUsuario, String login, String senha, String nomeUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
	}
	
	//Get e Set
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}	
	
	

}
