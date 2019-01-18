package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEG_PERMISSAO")
public class Permissao {
	
	private Long ident;
	private String descricao;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PERMISSAO_ID")
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}

	@Column(name="DESCRICAO")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
