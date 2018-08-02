package com.wsacademico.api.model;

import java.time.LocalDate;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class InformacoesPessoa {

	
	/*Dados RG*/
	private String orgaoEmissor;
	private String estado;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataEmissaoRg;
	
	/*Titulo Eleitor*/
	private String numeroTituloEleitor;
	private String zonaTituloEleitor;
	private String sessaoTituloEleitor;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataEmissaoTituloEleitor;

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getDataEmissaoRg() {
		return dataEmissaoRg;
	}
	public void setDataEmissaoRg(LocalDate dataEmissaoRg) {
		this.dataEmissaoRg = dataEmissaoRg;
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
