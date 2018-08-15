package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CAD_ALUNO")
public class Aluno extends Pessoa {
	
	private Long codigoAluno;
	
	private String ra;
	private String codigoMatricula;
	
	@NotNull
	@Column(name="codigo_aluno")
	public Long getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Long codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
}
