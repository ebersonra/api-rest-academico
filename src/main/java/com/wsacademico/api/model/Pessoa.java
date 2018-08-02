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

import org.springframework.format.annotation.DateTimeFormat;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;

@Entity
@Table(name="cad_pessoa")
public class Pessoa {

	private Long id;
	private String nome;
	private String sobrenome;
	private String nomeMae;
	private String nomePai;
	
	private String cpf;
	private String rg;
	private String pis;
	private String cnh;
	
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
	private Boolean ativo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Column(name="estado_civil")
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="pessoa_sexo")
	public PessoaSexo getPessoaSexo() {
		return pessoaSexo;
	}
	public void setPessoaSexo(PessoaSexo pessoaSexo) {
		this.pessoaSexo = pessoaSexo;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="pessoa_tipo")
	public PessoaTipo getPessoaTipo() {
		return pessoaTipo;
	}
	public void setPessoaTipo(PessoaTipo pessoaTipo) {
		this.pessoaTipo = pessoaTipo;
	}
		
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="raca_cor")
	public RacaCor getRacaCor() {
		return racaCor;
	}
	public void setRacaCor(RacaCor racaCor) {
		this.racaCor = racaCor;
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="nacionalidade")
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="pessoa_grau_parentesco")
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
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
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
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="data_nascimento")
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
