package com.wsacademico.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PessoaFisica.class)
public abstract class PessoaFisica_ extends com.wsacademico.api.model.comum.Pessoa_ {

	public static volatile SingularAttribute<PessoaFisica, String> orgaoEmissorRG;
	public static volatile SingularAttribute<PessoaFisica, String> zonaTituloEleitor;
	public static volatile SingularAttribute<PessoaFisica, LocalDate> dataEmissaoRG;
	public static volatile SingularAttribute<PessoaFisica, String> nome;
	public static volatile SingularAttribute<PessoaFisica, String> estadoOrgaoEmissorRG;
	public static volatile SingularAttribute<PessoaFisica, String> sessaoTituloEleitor;
	public static volatile SingularAttribute<PessoaFisica, String> cpfMae;
	public static volatile SingularAttribute<PessoaFisica, LocalDate> dataEmissaoTituloEleitor;
	public static volatile SingularAttribute<PessoaFisica, Long> idade;
	public static volatile SingularAttribute<PessoaFisica, String> rg;
	public static volatile SingularAttribute<PessoaFisica, String> cpfPai;
	public static volatile SingularAttribute<PessoaFisica, String> cpf;
	public static volatile SingularAttribute<PessoaFisica, String> nomePai;
	public static volatile SingularAttribute<PessoaFisica, String> pis;
	public static volatile SingularAttribute<PessoaFisica, String> cnh;
	public static volatile SingularAttribute<PessoaFisica, String> sobrenome;
	public static volatile SingularAttribute<PessoaFisica, LocalDate> dataNascimento;
	public static volatile SingularAttribute<PessoaFisica, String> numeroTituloEleitor;
	public static volatile SingularAttribute<PessoaFisica, String> nomeMae;

	public static final String ORGAO_EMISSOR_RG = "orgaoEmissorRG";
	public static final String ZONA_TITULO_ELEITOR = "zonaTituloEleitor";
	public static final String DATA_EMISSAO_RG = "dataEmissaoRG";
	public static final String NOME = "nome";
	public static final String ESTADO_ORGAO_EMISSOR_RG = "estadoOrgaoEmissorRG";
	public static final String SESSAO_TITULO_ELEITOR = "sessaoTituloEleitor";
	public static final String CPF_MAE = "cpfMae";
	public static final String DATA_EMISSAO_TITULO_ELEITOR = "dataEmissaoTituloEleitor";
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

