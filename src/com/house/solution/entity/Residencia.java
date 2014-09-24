package com.house.solution.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HS_RESIDENCIA")
@SequenceGenerator(name="seqResidencia",sequenceName="SEQ_RESIDENCIA",allocationSize=1)
public class Residencia {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqResidencia")
	@Column(name="CD_RESIDENCIA")
	private int idResidencia;
	
	@Column(name="NM_RESIDENCIA",length=40)
	private int nomeResidencia;
	
	@Column(name="TP_RESIDENCIA",length=40)
	private String tipoResidencia;
	
	@Column(name="DS_RESIDENCIA",length=256)
	private String descricaoResidencia;
	
	@Column(name="DS_ENDERECO",length=256)
	private String enderecoResidencia;
	
	@Column(name="NM_PROPRIETARIO",length=256)
	private String proprietarioResidencia;

	
	//Construtor
	public Residencia(int idResidencia, int nomeResidencia,
			String tipoResidencia, String descricaoResidencia,
			String enderecoResidencia, String proprietarioResidencia) {
		super();
		this.idResidencia = idResidencia;
		this.nomeResidencia = nomeResidencia;
		this.tipoResidencia = tipoResidencia;
		this.descricaoResidencia = descricaoResidencia;
		this.enderecoResidencia = enderecoResidencia;
		this.proprietarioResidencia = proprietarioResidencia;
	}

	
	//Get e Set
	public int getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(int idResidencia) {
		this.idResidencia = idResidencia;
	}

	public int getNomeResidencia() {
		return nomeResidencia;
	}

	public void setNomeResidencia(int nomeResidencia) {
		this.nomeResidencia = nomeResidencia;
	}

	public String getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	public String getDescricaoResidencia() {
		return descricaoResidencia;
	}

	public void setDescricaoResidencia(String descricaoResidencia) {
		this.descricaoResidencia = descricaoResidencia;
	}

	public String getEnderecoResidencia() {
		return enderecoResidencia;
	}

	public void setEnderecoResidencia(String enderecoResidencia) {
		this.enderecoResidencia = enderecoResidencia;
	}

	public String getProprietarioResidencia() {
		return proprietarioResidencia;
	}

	public void setProprietarioResidencia(String proprietarioResidencia) {
		this.proprietarioResidencia = proprietarioResidencia;
	}
	
	
	
	
}
