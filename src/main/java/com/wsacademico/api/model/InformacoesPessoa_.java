package com.wsacademico.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InformacoesPessoa.class)
public abstract class InformacoesPessoa_ {

	public static volatile SingularAttribute<InformacoesPessoa, String> sessaoTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, LocalDate> dataEmissaoTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, String> orgaoEmissor;
	public static volatile SingularAttribute<InformacoesPessoa, String> zonaTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, LocalDate> dataEmissaoRg;
	public static volatile SingularAttribute<InformacoesPessoa, String> numeroTituloEleitor;
	public static volatile SingularAttribute<InformacoesPessoa, String> estadoOrgaoEmissorRG;

}

