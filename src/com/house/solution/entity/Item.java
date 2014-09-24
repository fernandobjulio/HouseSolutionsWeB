package com.house.solution.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HS_ITEM")
@SequenceGenerator(name="seqItem",sequenceName="SEQ_ITEM",allocationSize=1)
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqItem")
	@Column(name="CD_ITEM")
	private int idItem;
	
	@Column(name="NM_ITEM",length=40)
	private String nomeItem;
	
	@Column(name="TP_ITEM",length=40)
	private String tipoItem;
	
	@Lob
	@Column(name="IM_ITEM")
	private byte[] fotoItem;
	
	@Column(name="DS_ITEM",length=256)
	private String descricaoItem;
	
	@Column(name="OB_OBSERVACAO",length=512)
	private String observacao;
	
	@Column(name="DT_INICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtInicio;
	
	@Column(name="DT_FIM")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtFim;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Repositorio repositorio;

	
	//Construtor
	public Item(int idItem, String nomeItem, String tipoItem, byte[] fotoItem,
			String descricaoItem, String observacao, Calendar dtInicio,
			Calendar dtFim) {
		super();
		this.idItem = idItem;
		this.nomeItem = nomeItem;
		this.tipoItem = tipoItem;
		this.fotoItem = fotoItem;
		this.descricaoItem = descricaoItem;
		this.observacao = observacao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	
	//Get e Set
	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}

	public byte[] getFotoItem() {
		return fotoItem;
	}

	public void setFotoItem(byte[] fotoItem) {
		this.fotoItem = fotoItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Calendar getDtFim() {
		return dtFim;
	}

	public void setDtFim(Calendar dtFim) {
		this.dtFim = dtFim;
	}
		
	
	
	
}
