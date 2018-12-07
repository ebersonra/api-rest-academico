package com.wsacademico.api.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="CAD_ALUNO")
public class Aluno extends Pessoa {
	
	private Long ident;
	private Long codigoAluno;
	private Long identUsuarioCadastrou;
	
	private String ra;
	private String codigoMatricula;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataCadastro;
	
	/*Um Aluno tem muitos contatos*/
	@OneToMany
	private List<ContatoAluno> contatos;
	
	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ALUNO_ID")
	public Long getIdent() {
		return this.ident;
	}
	@Override
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
	
}
