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
@Table(name="HS_MOVEL")
@SequenceGenerator(name="seqMovel",sequenceName="SEQ_MOVEL",allocationSize=1)
public class Movel {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqMovel")
	@Column(name="CD_MOVEL")
	private int idMovel;
	
	@Column(name="NM_MOVEL",length=40)
	private String nomeMovel;
	
	@Column(name="DS_MOVEL",length=256)
	private String descricaoMovel;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Comodo comodo;
	
	
	//Construtor
	public Movel(int idMovel, String nomeMovel, String descricaoMovel) {
		super();
		this.idMovel = idMovel;
		this.nomeMovel = nomeMovel;
		this.descricaoMovel = descricaoMovel;
	}
	
	
	//Get e Set
	public int getIdMovel() {
		return idMovel;
	}

	public void setIdMovel(int idMovel) {
		this.idMovel = idMovel;
	}

	public String getNomeMovel() {
		return nomeMovel;
	}

	public void setNomeMovel(String nomeMovel) {
		this.nomeMovel = nomeMovel;
	}

	public String getDescricaoMovel() {
		return descricaoMovel;
	}

	public void setDescricaoMovel(String descricaoMovel) {
		this.descricaoMovel = descricaoMovel;
	}


	public Comodo getComodo() {
		return comodo;
	}


	public void setComodo(Comodo comodo) {
		this.comodo = comodo;
	}
	
	
	
	
}
