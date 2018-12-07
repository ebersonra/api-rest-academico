package com.wsacademico.api.comum;

import java.util.ArrayList;
import java.util.List;

public enum PessoaTipo {
	
	ALUNO(1, "ALU", "Aluno"),
	PROFESSOR(2, "PROF", "Professor(a)"),
	COORDENADOR(3, "COORD", "Coordenador(a)"),
	FUNCIONARIO(4, "FUN", "Funcionário(a)"),
	SUPORTE_TI(5, "SUP", "Suporte Dpto Tecnologia"),
	RESPONSAVEL(6, "RES", "Responsável Legal"),
	ALUNO_VETERANO(7, "ALU_VET", "Aluno Veterano"),
	ALUNO_CALOURO(8,"ALU_CAL","Aluno Calouro"),
	ALUNO_FIES(9,"ALU_FIES","Aluno FIES");
	
	private Integer codigo;
	private String siglaPessoaTipo;
	private String descricao;
	
	private PessoaTipo(Integer codigo, String siglaPessoaTipo, String descricao) {
		this.codigo = codigo;
		this.siglaPessoaTipo = siglaPessoaTipo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSiglaPessoaTipo() {
		return siglaPessoaTipo;
	}

	public void setSiglaPessoaTipo(String siglaPessoaTipo) {
		this.siglaPessoaTipo = siglaPessoaTipo;
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
	
	public static List<PessoaTipo> getTodosPessoaTipos(){
		List<PessoaTipo> tipos = new ArrayList<PessoaTipo>();
		
		for (PessoaTipo pessoaTipo : PessoaTipo.values()) {
			tipos.add(pessoaTipo);
		}
		return tipos;
	}

}
