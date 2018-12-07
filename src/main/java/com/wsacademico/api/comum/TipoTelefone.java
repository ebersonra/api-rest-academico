package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum TipoTelefone {

	COMERCIAL(0, "Comercial"),
	CELULAR(1, "Celular"),
	FIXO(2,"Fixo"),
	FAX(3,"Fax"),
	TRABALHO(4,"Trabalho"),
	OUTROS(5,"Outros");
	
	private Integer codigo;
	private String descricao;
	
	private TipoTelefone(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
	public static List<TipoTelefone> getTodosTiposTelefones(){
		List<TipoTelefone> tiposTelefones = new ArrayList<>();
		
		for (TipoTelefone tipoTelefone : TipoTelefone.values()) {
			tiposTelefones.add(tipoTelefone);
		}
		return tiposTelefones;
	}
}