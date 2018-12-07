package com.wsacademico.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class InformacoesPessoa {

	/*Documentação*/
	private String cpf;
	private String cnpj;
	private String rg;
	private String pis;
	private String cnh;
	private String cpfPai;
	private String cpfMae;
	
	/*Atributos especificos sobre a pessoa*/
	private String nome;
	private String sobrenome;
	private String habilidadeMotora;
	private String rne;
	private String idiomaNativo;
	private String necessidadeEspecial;
	private String nomeMae;
	private String nomePai;
	
	private Long quantidadeDependentes;
	private Long idade;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataNascimento;
	
	/*Dados RG*/
	private String orgaoEmissorRG;
	private String estadoOrgaoEmissorRG;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataEmissaoRG;
	
	/*Titulo Eleitor*/
	private String numeroTituloEleitor;
	private String zonaTituloEleitor;
	private String sessaoTituloEleitor;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataEmissaoTituloEleitor;
	
	public String getOrgaoEmissorRG() {
		return orgaoEmissorRG;
	}
	public void setOrgaoEmissorRG(String orgaoEmissorRG) {
		this.orgaoEmissorRG = orgaoEmissorRG;
	}

	public String getEstadoOrgaoEmissorRG() {
		return estadoOrgaoEmissorRG;
	}
	public void setEstadoOrgaoEmissorRG(String estadoOrgaoEmissorRG) {
		this.estadoOrgaoEmissorRG = estadoOrgaoEmissorRG;
	}

	public LocalDate getDataEmissaoRG() {
		return dataEmissaoRG;
	}
	public void setDataEmissaoRG(LocalDate dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}

	public String getNumeroTituloEleitor() {
		return numeroTituloEleitor;
	}
	public void setNumeroTituloEleitor(String numeroTituloEleitor) {
		this.numeroTituloEleitor = numeroTituloEleitor;
	}

	public String getZonaTituloEleitor() {
		return zonaTituloEleitor;
	}
	public void setZonaTituloEleitor(String zonaTituloEleitor) {
		this.zonaTituloEleitor = zonaTituloEleitor;
	}

	public String getSessaoTituloEleitor() {
		return sessaoTituloEleitor;
	}
	public void setSessaoTituloEleitor(String sessaoTituloEleitor) {
		this.sessaoTituloEleitor = sessaoTituloEleitor;
	}

	public LocalDate getDataEmissaoTituloEleitor() {
		return dataEmissaoTituloEleitor;
	}
	public void setDataEmissaoTituloEleitor(LocalDate dataEmissaoTituloEleitor) {
		this.dataEmissaoTituloEleitor = dataEmissaoTituloEleitor;
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
	
	@Column(name = "PIS")
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	
	@Column(name = "CNH")
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	@NotNull
	@CPF
	@Column(name = "CPF_PAI")
	public String getCpfPai() {
		return cpfPai;
	}
	public void setCpfPai(String cpfPai) {
		this.cpfPai = cpfPai;
	}
	
	@NotNull
	@CPF
	@Column(name = "CPF_MAE")
	public String getCpfMae() {
		return cpfMae;
	}
	public void setCpfMae(String cpfMae) {
		this.cpfMae = cpfMae;
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
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="DATA_NASCIMENTO")
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
