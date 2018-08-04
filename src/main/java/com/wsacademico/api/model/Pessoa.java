package com.wsacademico.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaReligiao;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;

@Entity
@Table(name="CAD_PESSOA")
public class Pessoa {

	private Long ident;
	private String nome;
	private String sobrenome;
	private String nomeMae;
	private String nomePai;
	
	private String cpf;
	private String rg;
	private String pis;
	private String cnh;
	private String cpfPai;
	private String cpfMae;
	
	private Long idade;
	
	private LocalDate dataNascimento;
	
	private EstadoCivil estadoCivil;
	private PessoaSexo pessoaSexo;
	private PessoaTipo pessoaTipo;
	private RacaCor racaCor;
	private Nacionalidade nacionalidade;
	private PessoaGrauParentesco pessoaGrauParentesco;
	private Endereco endereco;
	private InformacoesPessoa informacoesPessoa;
	private PessoaReligiao pessoaReligiao;
	
	private Boolean ativo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdent() {
		return ident;
	}
	public void setIdent(Long ident) {
		this.ident = ident;
	}
	
	@NotNull
	@Size(min= 5, max=50)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@NotNull
	@Size(min= 5, max=50)
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@NotNull
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	
	@NotNull
	@CPF
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@NotNull
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	@Column(name="ativo", columnDefinition="boolean default false", insertable=false, updatable=true)
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	@NotNull
	@Column(name="NOME_MAE")
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	@NotNull
	@Column(name="NOME_PAI")
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_NASCIMENTO")
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
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
