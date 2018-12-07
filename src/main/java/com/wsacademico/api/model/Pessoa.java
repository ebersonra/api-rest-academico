package com.wsacademico.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaReligiao;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;

@MappedSuperclass
public class Pessoa {

	private Long ident;
	
	private EstadoCivil estadoCivil;
	private PessoaSexo pessoaSexo;
	private PessoaTipo pessoaTipo;
	private RacaCor racaCor;
	private Nacionalidade nacionalidade;
	private PessoaGrauParentesco pessoaGrauParentesco;
	private PessoaReligiao pessoaReligiao;
	
	private Endereco endereco;
	private InformacoesPessoa informacoesPessoa;
	
	//ATIVO=true ou INATIVO=false
	private Boolean status;
	//Default é false
	//Flag para informar se o perfil é estrangeiro (Irá obrigar informar o CPF ou RNE)
	private Boolean estrangeiro;
	//Default é false. Sera usado para identificar cadastro de pessoa Juridica
	//e exibir campo CNPJ na tela
	private Boolean pessoaJuridica;
	
	private String observacao;
	
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="ESTADO_CIVIL")
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="PESSOA_SEXO")
	public PessoaSexo getPessoaSexo() {
		return pessoaSexo;
	}
	public void setPessoaSexo(PessoaSexo pessoaSexo) {
		this.pessoaSexo = pessoaSexo;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="PESSOA_TIPO")
	public PessoaTipo getPessoaTipo() {
		return pessoaTipo;
	}
	public void setPessoaTipo(PessoaTipo pessoaTipo) {
		this.pessoaTipo = pessoaTipo;
	}
		
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="RACA_COR")
	public RacaCor getRacaCor() {
		return racaCor;
	}
	public void setRacaCor(RacaCor racaCor) {
		this.racaCor = racaCor;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="NACIONALIDADE")
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="PESSOA_GRAU_PARENTESCO")
	public PessoaGrauParentesco getPessoaGrauParentesco() {
		return pessoaGrauParentesco;
	}
	public void setPessoaGrauParentesco(PessoaGrauParentesco pessoaGrauParentesco) {
		this.pessoaGrauParentesco = pessoaGrauParentesco;
	}
	
	@Embedded
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Embedded
	public InformacoesPessoa getInformacoesPessoa() {
		return informacoesPessoa;
	}
	public void setInformacoesPessoa(InformacoesPessoa informacoesPessoa) {
		this.informacoesPessoa = informacoesPessoa;
	}
	
	@NotNull
	@Column(name="ATIVO", columnDefinition="boolean default false", insertable=false, updatable=true)
	public Boolean getAtivo() {
		return status;
	}
	public void setAtivo(Boolean status) {
		this.status = status;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "PESSOA_RELIGIAO")
	public PessoaReligiao getPessoaReligiao() {
		return pessoaReligiao;
	}
	public void setPessoaReligiao(PessoaReligiao pessoaReligiao) {
		this.pessoaReligiao = pessoaReligiao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ident == null) ? 0 : ident.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (ident == null) {
			if (other.ident != null)
				return false;
		} else if (!ident.equals(other.ident))
			return false;
		return true;
	}
}
