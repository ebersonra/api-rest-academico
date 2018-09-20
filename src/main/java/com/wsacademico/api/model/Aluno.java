package com.wsacademico.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CAD_ALUNO")
public class Aluno extends Pessoa {
	
	private Long codigoAluno;
	
	private String ra;
	private String codigoMatricula;
	
	/*Um Aluno tem muitos contatos*/
	@OneToMany
	private List<ContatoAluno> contatos;
	
	@NotNull
	@Column(name="codigo_aluno")
	public Long getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Long codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
}
