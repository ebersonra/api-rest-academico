package com.wsacademico.api.comum;

public enum PessoaReligiao {

	CATOLICA(1,"Igreja Católica Apostólica Romana"),
	CATOLICA_ORTODOXA(2,"Igreja Católica Ortodoxa"),
	BATISTA(3,"Igreja Batista"),
	LUTERANA(4,"Igreja Luterana"),
	PRESBITERIANA(5,"Igreja Presbiteriana"),
	METODISTA(6,"Igreja Metodista"),
	ASSEMBLEIA_DEUS(7,"Assembleia de Deus"),
	CONGREGRACAO_CRISTA_BRASIL(8,"Congregação Cristã do Brasil"),
	UNIVERSAL_REINO_DEUS(9,"Igreja Universal do Reino de Deus"),
	EVANGELHO_QUADRANGULAR(10,"Igreja do Evangelho Quadrangular"),
	DEUS_AMOR(11,"Igreja Deus é Amor"),
	OUTROS_PENTECOSTAIS_NEOPENTECOSTAIS(12,"Outros Pentecostais/Neopentecostais"),
	ADVENTISTA_SETIMO_DIA(13,"Igreja Adventista do Sétimo Dia"),
	TESTEMUNHAS_JEOVA(14,"Testemunhas de Jeová"),
	MORMONS(15,"Mórmons"),
	ESPIRITISMO(16,"Espiritismo"),
	UMBANDA(17,"Umbanda"),
	BUDISMO(18,"Budismo"),
	CANDOMBLE(19,"Candomblé"),
	MESSIANICA(20,"Igreja Messiânica"),
	JUDAISMO(21,"Judaísmo"),
	TRADICOES_ESOTERICAS(22,"Tradições Esotéricas"),
	ISLAMISMO(23,"Islamísmo"),
	CRENCAS_INDIGENAS(24,"Crenças Indígenas"),
	ORIENTAIS(25,"Bahaísmo, Hare Krishna, Hinduísmo, Taoísmo, Xintoísmo, Seicho-no-iê"),
	OUTRAS_RELIGIOES(26,"Outras Religiões"),
	SEM_DECLARACAO(27,"Sem Declaração/Não Determinadas"),
	SEM_RELIGIAO(28,"Sem Religião");
	
	private Integer codigo;
	private String descricao;
	
	private PessoaReligiao(Integer codigo, String descricao) {
		this.codigo=codigo;
		this.descricao=descricao;
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
