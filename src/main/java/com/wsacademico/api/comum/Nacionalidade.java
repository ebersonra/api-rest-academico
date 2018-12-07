package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum Nacionalidade {

	ARGENTINO(1,"Argentina", "Argentino"),
	BRASILEIRO(2, "Brasil", "Brasileiro"),
	PORTUGUES(3, "Portugal", "Português"),
	INGLES(4, "Inglaterra", "Inglês"),
	AMERICANO(5, "Estados Unidos","Americano"),
	CANADENSE(6, "Canadá", "Canadense");
	
	private Integer codigo;
	private String pais;
	private String descricaoNacionalidade;
	
	private Nacionalidade(Integer codigo, String pais, String descricaoNacionalidade) {
		this.codigo = codigo;
		this.pais = pais;
		this.descricaoNacionalidade = descricaoNacionalidade;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDescricaoNacionalidade() {
		return descricaoNacionalidade;
	}
	public void setDescricaoNacionalidade(String descricaoNacionalidade) {
		this.descricaoNacionalidade = descricaoNacionalidade;
	}
	
	@Override
	public String toString() {
		return this.descricaoNacionalidade;
	}
	
	public static List<Nacionalidade> getTodasNacionalidades(){
		List<Nacionalidade> nacionalidades = new ArrayList<Nacionalidade>();
		
		for (Nacionalidade nacionalidade : Nacionalidade.values()) {
			nacionalidades.add(nacionalidade);
		}
		return nacionalidades;
	}
}
