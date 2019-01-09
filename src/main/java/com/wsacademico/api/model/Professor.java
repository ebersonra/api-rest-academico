package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wsacademico.api.comum.ProfessorTitulacao;

@Entity
@Table(name = "CAD_PROFESSOR")
public class Professor extends Pessoa {

	private Long ident;
	
	private Long codigoProfessor;
	
	private ProfessorTitulacao professorTitulacao;
	
	private Pessoa pessoa;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROFESSOR_ID")
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="PROFESSOR_TITULACAO")
	public ProfessorTitulacao getProfessorTitulacao() {
		return professorTitulacao;
	}
	public void setProfessorTitulacao(ProfessorTitulacao professorTitulacao) {
		this.professorTitulacao = professorTitulacao;
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
