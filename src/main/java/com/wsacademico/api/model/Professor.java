package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.wsacademico.api.comum.ProfessorTitulacao;

@Entity
@Table(name = "CAD_PROFESSOR")
public class Professor extends PessoaFisica {

	private Long codigoProfessor;
	
	private ProfessorTitulacao professorTitulacao;
	
	@Column(name="CODIGO_PROFESSOR")
	public Long getCodigoProfessor() {
		return codigoProfessor;
	}
	public void setCodigoProfessor(Long codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}

	@Enumerated(EnumType.STRING)
	@Column(name="PROFESSOR_TITULACAO")
	public ProfessorTitulacao getProfessorTitulacao() {
		return professorTitulacao;
	}
	public void setProfessorTitulacao(ProfessorTitulacao professorTitulacao) {
		this.professorTitulacao = professorTitulacao;
	}
}
