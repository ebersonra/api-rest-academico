package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CAD_ALUNO")
public class Aluno extends Pessoa {
	
	private Long ident;
	private Long codigoAluno;
	
	private String ra;
	private String codigoMatricula;
	
	private Pessoa pessoa;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ALUNO_ID")
	public Long getIdent() {
		return this.ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	@NotNull
	@Column(name="CODIGO_ALUNO")
	public Long getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Long codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getCodigoMatricula() {
		return codigoMatricula;
	}
	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}
	
	@ManyToOne
	@JoinColumn(name="PESSOA_ID", referencedColumnName="PESSOA_ID")
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
