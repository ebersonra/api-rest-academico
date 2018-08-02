package com.wsacademico.api.comum;

public enum Estado {
	
	/**
     * Código: 12, Nome: Acre, Sigla: AC
     */
    ACRE(12, "AC", "Acre"),
    /**
     * Código:27, Nome: Alagoas, Sigla: AL
     */
    ALAGOAS(27, "AL", "Alagoas"),
    /**
     * Código:16, Nome: Amapá, Sigla: AP
     */
    AMAPA(16, "AP", "Amapá"),
    /**
     * Código:13, Nome: Amazonas, Sigla: AM
     */
    AMAZONAS(13, "AM", "Amazonas"),
    /**
     * Código:29, Nome: Bahia, Sigla: BA
     */
    BAHIA(29, "BA", "Bahia"),
    /**
     * Código:23, Nome: Ceará, Sigla: CE
     */
    CEARA(23, "CE", "Ceará"),
    /**
     * Código:53, Nome: Distrito Federal, Sigla: DF
     */
    DISTRITO_FEDERAL(53, "DF", "Distrito Federal"),
    /**
     * Código:32, Nome: Espírito Santo, Sigla: ES
     */
    ESPIRITO_SANTO(32, "ES","Espírito Santo"),
    /**
     * Código:52, Nome: Goiás, Sigla: GO
     */
    GOIAS(52, "GO", "Goiás"),
    /**
     * Código:21, Nome: Maranhão, Sigla: MA
     */
    MARANHAO(21, "MA", "Maranhão"),
    /**
     * Código:51, Nome: Mato Grosso, Sigla: MT
     */
    MATO_GROSSO(51, "MT", "Mato Grosso"),
    /**
     * Código:50, Nome: Mato Grosso do Sul, Sigla: MS
     */
    MATO_GROSSO_DO_SUL(50, "MS", "Mato Grosso do Sul"),
    /**
     * Código:31, Nome: Minas Gerais, Sigla: MG
     */
    MINAS_GERAIS(31, "MG", "Minas Gerais"),
    /**
     * Código:15, Nome: Pará, Sigla: PA
     */
    PARA(15, "PA","Pará"),
    /**
     * Código:25, Nome: Paraíba, Sigla: PB
     */
    PARAIBA(25,"PB", "Paraíba"),
    /**
     * Código:41, Nome: Paraná, Sigla: PR
     */
    PARANA(41, "PR", "Paraná"),
    /**
     * Código:26, Nome: Pernambuco, Sigla: PE
     */
    PERNAMBUCO(26, "PE", "Pernambuco"),
    /**
     * Código:22, Nome: Piauí, Sigla: PI
     */
    PIAUI(22, "PI", "Piauí"),
    /**
     * Código:33, Nome: Rio de Janeiro, Sigla: RJ
     */
    RIO_DE_JANEIRO(33, "RJ", "Rio de Janeiro"),
    /**
     * Código:24, Nome: Rio Grande do Norte, Sigla: RN
     */
    RIO_GRANDE_DO_NORTE(24, "RN", "Rio Grande do Norte"),
    /**
     * Código:43, Nome: Rio Grande do Sul, Sigla: RS
     */
    RIO_GRANDE_DO_SUL(43, "RS", "Rio Grande do Sul"),
    /**
     * Código:11, Nome Rondônia, Silga: RO
     */
    RONDONIA(11, "RO", "Rondônia"),
    /**
     * Código:14, Nome: Roraima, Sigla: RO
     */
    RORAIMA(14, "RR", "Roraima"),
    /**
     * Código:42, Nome: Santa Catarina, Sigla: SC
     */
    SANTA_CATARINA(42, "SC", "Santa Catarina"),
    /**
     * Código:35, Nome: São Paulo, Sigla: SP
     */
    SAOPAULO(35, "SP", "São Paulo"),
    /**
     * Código: 28, Nome: Sergipe, Sigla: SE
     */
    SERGIPE(28, "SE", "Sergipe"),
    /**
     * Código:17, Nome: Tocantins, Sigla: TO
     */
    TOCANTINS(17, "TO", "Tocantins");
	
	private Integer codigo;
	private String sigla;
	private String descricao;
	
	private Estado(Integer codigo, String sigla, String descricao) {
		this.codigo = codigo;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
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
	
	/**
	 * Método responsável por retornar estado por código.
	 * @author eberson
	 * 
	 * @param codigo
	 * @return estado por codigo
	 * */
	public static Estado getEstadoPorCodigo(Integer codigo) {
		Estado estado = null;
		
		for(Estado value:Estado.values()) {
			
			if(value.getCodigo().intValue()==codigo.intValue()) {
				
				estado = value;
				break;
			}
		}
		return estado;
	}
	
	/**
	 * Método responsável por retornar estado por código.
	 * @author eberson
	 * 
	 * @param codigo
	 * @return estado por codigo
	 * */
	public static Estado getEstadoPorSigla(String siglaEstado) {
		Estado estado = null;
		
		for(Estado value:Estado.values()) {
			
			if(value.getSigla().equals(siglaEstado.toUpperCase())) {
				
				estado = value;
				break;
			}
		}
		return estado;
	}
}
