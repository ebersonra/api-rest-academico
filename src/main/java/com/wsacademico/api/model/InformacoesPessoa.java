package com.wsacademico.api.model;

import java.time.LocalDate;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class InformacoesPessoa {

	
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
	
	private String habilidadeMotora;
	private String rne;
	private Long quantidadeDependentes;
	private String idiomaNativo;
	private String necessidadeEspecial;

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
}
