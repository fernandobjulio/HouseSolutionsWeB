package com.house.solution.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HS_COMODO")
@SequenceGenerator(name="seqComodo",sequenceName="SEQ_COMODO",allocationSize=1)
public class Comodo {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqComodo")
	@Column(name="CD_COMODO")
	private int idComodo;
	
	@Column(name="NM_COMODO",length=40)
	private String nomeComodo;
	
	@Column(name="DS_COMODO",length=256)
	private String descricaoComodo;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Residencia residencia;
	
	//Construtor
	public Comodo(int idComodo, String nomeComodo, String descricaoComodo) {
		super();
		this.idComodo = idComodo;
		this.nomeComodo = nomeComodo;
		this.descricaoComodo = descricaoComodo;
	}
	
	
	//Get e Set
	public int getIdComodo() {
		return idComodo;
	}

	public void setIdComodo(int idComodo) {
		this.idComodo = idComodo;
	}

	public String getNomeComodo() {
		return nomeComodo;
	}

	public void setNomeComodo(String nomeComodo) {
		this.nomeComodo = nomeComodo;
	}

	public String getDescricaoComodo() {
		return descricaoComodo;
	}

	public void setDescricaoComodo(String descricaoComodo) {
		this.descricaoComodo = descricaoComodo;
	}


	public Residencia getResidencia() {
		return residencia;
	}


	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
	
	
}
