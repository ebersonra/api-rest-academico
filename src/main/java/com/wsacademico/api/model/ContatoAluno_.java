package com.wsacademico.api.model;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContatoPessoa.class)
public abstract class ContatoAluno_ {

	public static volatile SingularAttribute<ContatoPessoa, Aluno> aluno;
	public static volatile SingularAttribute<ContatoPessoa, TipoTelefone> tipoTelefone;
	public static volatile SingularAttribute<ContatoPessoa, String> telefone;
	public static volatile SingularAttribute<ContatoPessoa, Long> ident;
	public static volatile SingularAttribute<ContatoPessoa, TipoEmail> tipoEmail;
	public static volatile SingularAttribute<ContatoPessoa, String> email;

	public static final String ALUNO = "aluno";
	public static final String TIPO_TELEFONE = "tipoTelefone";
	public static final String TELEFONE = "telefone";
	public static final String IDENT = "ident";
	public static final String TIPO_EMAIL = "tipoEmail";
	public static final String EMAIL = "email";

}

