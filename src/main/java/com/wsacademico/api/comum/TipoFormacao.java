package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum TipoFormacao {

	GRADUACAO(0,"","Graduação"),
	POS_GRADUACAO(1,"","Pós Graduação"),
	TECNICO(2,"","Tecnico"),
	ENSINO_MEDIO(3,"","Ensino Medio"),
	ENSINO_FUNDAMENTAL(4,"","Ensino Fundamental"),
	DOUTORADO(5,"","Doutorado"),
	MESTRADO(6,"","Mestrado");
	
	private Integer codigo;
	private String descricaoBasica;
	private String descricaoCompleta;
	
	private TipoFormacao(Integer codigo, String descricaoBasica, String descricaoCompleta) {
		this.codigo = codigo;
		this.descricaoBasica = descricaoBasica;
		this.descricaoCompleta = descricaoCompleta;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricaoBasica() {
		return descricaoBasica;
	}
	public void setDescricaoBasica(String descricaoBasica) {
		this.descricaoBasica = descricaoBasica;
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
	
	public static List<TipoFormacao> getTodosTiposFormacoes(){
		List<TipoFormacao> tiposFormacoes = new ArrayList<TipoFormacao>();
		
		for (TipoFormacao tipoFormacao : TipoFormacao.values()) {
			tiposFormacoes.add(tipoFormacao);
		}
		return tiposFormacoes;
	}
}
