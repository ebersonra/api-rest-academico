package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;

@Entity
@Table(name="CAD_CONTATO_ALUNO")
public class ContatoAluno {

	private Long ident;
	private Aluno aluno;
	private TipoEmail tipoEmail;
	private TipoTelefone tipoTelefone;
	private String email;
	private String telefone;
	
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	/*Muitos contatos para um Aluno*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ALUNO_ID", referencedColumnName="ALUNO_ID")
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_EMAIL")
	public TipoEmail getTipoEmail() {
		return tipoEmail;
	}
	public void setTipoEmail(TipoEmail tipoEmail) {
		this.tipoEmail = tipoEmail;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_TELEFONE")
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="TELEFONE")
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
