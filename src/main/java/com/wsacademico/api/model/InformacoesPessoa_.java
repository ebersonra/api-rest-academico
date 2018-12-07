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

}

