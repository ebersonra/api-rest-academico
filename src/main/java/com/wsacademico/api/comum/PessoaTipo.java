package com.wsacademico.api.comum;

public enum PessoaTipo {
	
	ALUNO(1, "ALU", "Aluno"),
	PROFESSOR(2, "PROF", "Professor(a)"),
	COORDENADOR(3, "COORD", "Coordenador(a)"),
	FUNCIONARIO(4, "FUN", "Funcionário(a)"),
	SUPORTE_TI(5, "SUP", "Suporte Dpto Tecnologia");
	
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

}