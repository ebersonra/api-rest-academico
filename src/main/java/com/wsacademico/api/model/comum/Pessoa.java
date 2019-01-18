package com.wsacademico.api.model.comum;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaReligiao;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;
import com.wsacademico.api.comum.TipoFormacao;
import com.wsacademico.api.model.Endereco;
import com.wsacademico.api.model.InformacoesPessoa;

@MappedSuperclass
public abstract class Pessoa extends EntidadeComum {

	private EstadoCivil estadoCivil;
	private PessoaSexo pessoaSexo;
	private PessoaTipo pessoaTipo;
	private RacaCor racaCor;
	private Nacionalidade nacionalidade;
	private PessoaGrauParentesco pessoaGrauParentesco;
	private PessoaReligiao pessoaReligiao;
	private TipoFormacao tipoFormacao;
	
	private Endereco endereco;
	
	//ATIVO=true ou INATIVO=false
	private Boolean ativo;
	//Default é false
	//Flag para informar se o perfil é estrangeiro (Irá obrigar informar o CPF ou RNE)
	private Boolean estrangeiro;
	
	private String observacao;
	
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_FORMACAO")
	public TipoFormacao getTipoFormacao() {
		return tipoFormacao;
	}
	public void setTipoFormacao(TipoFormacao tipoFormacao) {
		this.tipoFormacao = tipoFormacao;
	}
	
	@Embedded
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Column(name="ATIVO", columnDefinition="boolean default true", insertable=false, updatable=true)
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	@Column(name="ESTRANGEIRO", columnDefinition="boolean default false", insertable=false, updatable=true)
	public Boolean getEstrangeiro() {
		return estrangeiro;
	}
	public void setEstrangeiro(Boolean estrangeiro) {
		this.estrangeiro = estrangeiro;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "PESSOA_RELIGIAO")
	public PessoaReligiao getPessoaReligiao() {
		return pessoaReligiao;
	}
	public void setPessoaReligiao(PessoaReligiao pessoaReligiao) {
		this.pessoaReligiao = pessoaReligiao;
	}
	
	@Lob
	@Column(name="OBSERVACAO")
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
