package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum ProfessorTitulacao {

	ESPECIALISTA(0,"Especialista"),
	MESTRE(1,"Mestre"),
	DOUTOR(2,"Doutor");
	
	private Integer codigo;
	private String descricao;
	
	private ProfessorTitulacao(Integer codigo, String descricao) {
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
	
	public static List<ProfessorTitulacao> getTodosProfessorTitulacao(){
		List<ProfessorTitulacao> titulacoes = new ArrayList<ProfessorTitulacao>();
		for(ProfessorTitulacao titulacao : ProfessorTitulacao.values()) {
			titulacoes.add(titulacao);
		}
		return titulacoes;
	}
	
}
