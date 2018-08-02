package com.wsacademico.api.comum;

public enum PessoaGrauParentesco {
	
	FILHO(0,"Filho"),
	FILHA(1,"Filha"),
	PAI(2,"Pai"),
	MAE(3,"Mãe"),
	IRMA(4,"Irmã"),
	IRMAO(5,"Irmão"),
	CUNHADO(6,"Cunhado"),
	CUNHADA(7,"Cunhada"),
	TIO(8,"Tio"),
	TIA(9,"Tia"),
	PRIMA(10,"Prima"),
	PRIMO(11,"Primo"),
	AVO_F(12,"Avó"),
	AVO_M(13,"Avô"),
	SOGRO(14,"Sogro"),
	SOGRA(15,"Sogra"),
	NETO(16,"Neto"),
	NETA(17,"Neta"),
	SOBRINHO(18,"Sobrinho"),
	SOBRINHA(19,"Sobrinha"),
	BISNETO(20,"Bisneto"),
	BISNETA(21,"Bisneta");
	
	private Integer codigo;
	private String descricao;
	
	private PessoaGrauParentesco(Integer codigo, String descricao) {
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
