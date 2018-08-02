package com.wsacademico.api.comum;

public enum EstadoCivil {

	SOLTEIRO(1, "SOL", "Solteiro(a)"),
	CASADO(2, "CAS", "Casado(a)"),
	DIVORCIADO(3, "DIV", "Divorciado(a)"),
	VIUVO(4, "VIU", "Viúvo(a)");
	
	private Integer codigo;
	private String siglaEstadoCivil;
	private String descricaoCompleta;
	
	private EstadoCivil(Integer codigo, String siglaEstadoCivil, String descricaoCompleta) {
		this.codigo = codigo;
		this.siglaEstadoCivil = siglaEstadoCivil;
		this.descricaoCompleta = descricaoCompleta;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSiglaEstadoCivil() {
		return siglaEstadoCivil;
	}

	public void setSiglaEstadoCivil(String siglaEstadoCivil) {
		this.siglaEstadoCivil = siglaEstadoCivil;
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
}
