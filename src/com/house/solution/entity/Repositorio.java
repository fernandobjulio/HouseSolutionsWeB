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
@Table(name="HS_REPOSITORIO")
@SequenceGenerator(name="seqRepositorio",sequenceName="SEQ_REPOSITORIO",allocationSize=1)
public class Repositorio {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqRepositorio")
	@Column(name="CD_REPOSITORIO")
	private int idRepositorio;
	
	@Column(name="NM_REPOSITORIO",length=40)
	private String nomeRepositorio;
	
	@Column(name="DS_REPOSITORIO",length=256)
	private String descricaoRepositorio;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Movel movel;
	
	
	//Construtor
	public Repositorio(int idRepositorio, String nomeRepositorio,
			String descricaoRepositorio) {
		super();
		this.idRepositorio = idRepositorio;
		this.nomeRepositorio = nomeRepositorio;
		this.descricaoRepositorio = descricaoRepositorio;
	}
	
	
	//Get e Set
	public int getIdRepositorio() {
		return idRepositorio;
	}

	public void setIdRepositorio(int idRepositorio) {
		this.idRepositorio = idRepositorio;
	}

	public String getNomeRepositorio() {
		return nomeRepositorio;
	}

	public void setNomeRepositorio(String nomeRepositorio) {
		this.nomeRepositorio = nomeRepositorio;
	}

	public String getDescricaoRepositorio() {
		return descricaoRepositorio;
	}

	public void setDescricaoRepositorio(String descricaoRepositorio) {
		this.descricaoRepositorio = descricaoRepositorio;
	}


	public Movel getMovel() {
		return movel;
	}


	public void setMovel(Movel movel) {
		this.movel = movel;
	}
	
	
	
	
}
