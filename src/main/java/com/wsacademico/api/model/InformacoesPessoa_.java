package com.wsacademico.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InformacoesPessoa.class)
public abstract class InformacoesPessoa_ {

	public static volatile SingularAttribute<InformacoesPessoa, String> orgaoEmissorRG;
	public static volatile SingularAttribute<InformacoesPessoa, String> zonaTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, LocalDate> dataEmissaoRG;
	public static volatile SingularAttribute<InformacoesPessoa, String> nome;
	public static volatile SingularAttribute<InformacoesPessoa, String> estadoOrgaoEmissorRG;
	public static volatile SingularAttribute<InformacoesPessoa, String> sessaoTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, LocalDate> dataEmissaoTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, String> cpfMae;
	public static volatile SingularAttribute<InformacoesPessoa, Long> idade;
	public static volatile SingularAttribute<InformacoesPessoa, String> rg;
	public static volatile SingularAttribute<InformacoesPessoa, String> cpfPai;
	public static volatile SingularAttribute<InformacoesPessoa, String> cpf;
	public static volatile SingularAttribute<InformacoesPessoa, String> nomePai;
	public static volatile SingularAttribute<InformacoesPessoa, String> pis;
	public static volatile SingularAttribute<InformacoesPessoa, String> cnh;
	public static volatile SingularAttribute<InformacoesPessoa, String> sobrenome;
	public static volatile SingularAttribute<InformacoesPessoa, LocalDate> dataNascimento;
	public static volatile SingularAttribute<InformacoesPessoa, String> numeroTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, String> nomeMae;

	public static final String ORGAO_EMISSOR_RG = "orgaoEmissorRG";
	public static final String ZONA_TITULO_ELEITOR = "zonaTituloEleitor";
	public static final String DATA_EMISSAO_RG = "dataEmissaoRG";
	public static final String NOME = "nome";
	public static final String ESTADO_ORGAO_EMISSOR_RG = "estadoOrgaoEmissorRG";
	public static final String SESSAO_TITULO_ELEITOR = "sessaoTituloEleitor";
	public static final String DATA_EMISSAO_TITULO_ELEITOR = "dataEmissaoTituloEleitor";
	public static final String CPF_MAE = "cpfMae";
	public static final String IDADE = "idade";
	public static final String RG = "rg";
	public static final String CPF_PAI = "cpfPai";
	public static final String CPF = "cpf";
	public static final String NOME_PAI = "nomePai";
	public static final String PIS = "pis";
	public static final String CNH = "cnh";
	public static final String SOBRENOME = "sobrenome";
	public static final String DATA_NASCIMENTO = "dataNascimento";
	public static final String NUMERO_TITULO_ELEITOR = "numeroTituloEleitor";
	public static final String NOME_MAE = "nomeMae";

}

