package com.wsacademico.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.wsacademico.api.model.comum.Pessoa;

@Entity
@Table(name="SEG_USUARIO")
public class Usuario extends Pessoa {

	private String senha;
	private String login;
	private String email;
	
	private List<Permissao> permissoes;

	@Override
	@Column(name="USUARIO_ID")
	public Long getIdent() {
		return super.getIdent();
	}

	@NotBlank
	@Column(name="PASSWORD")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@NotBlank
	@Column(name="LOGIN")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@NotBlank
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="SEG_USUARIO_PERMISSAO", joinColumns=@JoinColumn(name="USUARIO_ID"), 
		inverseJoinColumns = @JoinColumn(name="PERMISSAO_ID"))
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
}
