package com.wsacademico.api.comum;

public enum TipoEmail {
	
	COMERCIAL(0,"Comercial"),
	TRABALHO(1,"Trabalho"),
	PESSOAL(2,"Pessoal"),
	SITE(3,"Site"),
	OUTROS(4,"Outros");
	
	private Integer codigo;
	private String descricao;
	
	private TipoEmail(Integer codigo, String descricao) {
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

}
