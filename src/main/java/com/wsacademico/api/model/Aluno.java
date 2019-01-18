package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.wsacademico.api.model.comum.Pessoa;

@Entity
@Table(name="CAD_ALUNO")
public class Aluno extends Pessoa {
	
	private Long codigoAluno;
	
	private String ra;
	private String codigoMatricula;
	
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
}
