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
import com.wsacademico.api.model.comum.EntidadeComum;
import com.wsacademico.api.model.comum.Pessoa;

@Entity
@Table(name="CAD_CONTATO_PESSOA")
public class ContatoPessoa extends EntidadeComum {

	private Pessoa pessoa;
	private TipoEmail tipoEmail;
	private TipoTelefone tipoTelefone;
	private String email;
	private String telefone;
	
	/*Muitos contatos para uma Pessoa*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PESSOA_ID", referencedColumnName="PESSOA_ID")
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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
