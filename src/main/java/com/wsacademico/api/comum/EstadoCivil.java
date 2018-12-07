package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum EstadoCivil {

	SOLTEIRO(1, "SOL", "Solteiro(a)"),
	CASADO(2, "CAS", "Casado(a)"),
	DIVORCIADO(3, "DIV", "Divorciado(a)"),
	VIUVO(4, "VIU", "Viúvo(a)"),
	UNIAO_ESTAVEL(5, "UNI", "União Estavel"),
	DESQUITADO(6, "DES", "Desquitado"),
	NAO_INFORMADO(7, "NAO", "Não Informado");
	
	private Integer codigo;
	private String siglaEstadoCivil;
	private String descricaoCompleta;
	
	private EstadoCivil(Integer codigo, String siglaEstadoCivil, String descricaoCompleta) {
		this.codigo = codigo;
		this.siglaEstadoCivil = siglaEstadoCivil;
		this.descricaoCompleta = descricaoCompleta;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSiglaEstadoCivil() {
		return siglaEstadoCivil;
	}

	public void setSiglaEstadoCivil(String siglaEstadoCivil) {
		this.siglaEstadoCivil = siglaEstadoCivil;
	}

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}
	
	@Override
	public String toString() {
		return this.descricaoCompleta;
	}
	
	public static List<EstadoCivil> getTodosEstadosCivis(){
		List<EstadoCivil> estados = new ArrayList<EstadoCivil>();
		
		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			estados.add(estadoCivil);
		}
		return estados;
	}
}
