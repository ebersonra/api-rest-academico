package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum RacaCor {

	BRANCA(1, "BRA", "Branca"),
	PRETA(2, "PRE", "Preta"),
	PARDA(3, "PAR", "Parda"),
	AMARELA(4, "AMA", "Amarela"),
	INDIGENA(5, "IND", "Indígena"),
	NAO_DISPOE_INFORMACAO(6, "NDI", "Não dispõe da informação"),
	NAO_INFORMADO(7, "NI", "[Aluno/Docente] Não quis declarar a cor/raça");
	
	private Integer codigo;
	private String siglaRacaCor;
	private String descricao;
	
	
	private RacaCor(Integer codigo, String siglaRacaCor, String descricao) {
		this.codigo = codigo;
		this.siglaRacaCor = siglaRacaCor;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getSiglaRacaCor() {
		return siglaRacaCor;
	}
	public void setSiglaRacaCor(String siglaRacaCor) {
		this.siglaRacaCor = siglaRacaCor;
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
	
	public static List<RacaCor> getTodasRacasCores(){
		List<RacaCor> racas = new ArrayList<RacaCor>();
		
		for (RacaCor racaCor : RacaCor.values()) {
			racas.add(racaCor);
		}
		return racas;
	}
	
}
