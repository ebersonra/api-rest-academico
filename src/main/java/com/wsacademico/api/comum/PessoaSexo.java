package com.wsacademico.api.comum;

public enum PessoaSexo {
	
	MASCULINO(1, "MAS", "Masculino"),
	FEMININO(2, "FEM", "Feminino"),
	OUTROS(3, "OUT", "Prefiro não informar");
	
	private Integer codigo;
	private String siglaSexo;
	private String descricaoCompleta;
	
	private PessoaSexo(Integer codigo, String siglaSexo, String descricaoCompleta) {
		this.codigo = codigo;
		this.siglaSexo = siglaSexo;
		this.descricaoCompleta = descricaoCompleta;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSiglaSexo() {
		return siglaSexo;
	}

	public void setSiglaSexo(String siglaSexo) {
		this.siglaSexo = siglaSexo;
	}

	public String getDescricao() {
		return descricaoCompleta;
	}

	public void setDescricao(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}
	
	@Override
	public String toString() {
		return this.descricaoCompleta;
	}
}
