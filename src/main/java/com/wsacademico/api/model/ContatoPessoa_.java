package com.wsacademico.api.model;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;
import com.wsacademico.api.model.comum.Pessoa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContatoPessoa.class)
public abstract class ContatoPessoa_ extends com.wsacademico.api.model.comum.EntidadeComum_ {

	public static volatile SingularAttribute<ContatoPessoa, TipoTelefone> tipoTelefone;
	public static volatile SingularAttribute<ContatoPessoa, String> telefone;
	public static volatile SingularAttribute<ContatoPessoa, Pessoa> pessoa;
	public static volatile SingularAttribute<ContatoPessoa, TipoEmail> tipoEmail;
	public static volatile SingularAttribute<ContatoPessoa, String> email;

	public static final String TIPO_TELEFONE = "tipoTelefone";
	public static final String TELEFONE = "telefone";
	public static final String PESSOA = "pessoa";
	public static final String TIPO_EMAIL = "tipoEmail";
	public static final String EMAIL = "email";

}

