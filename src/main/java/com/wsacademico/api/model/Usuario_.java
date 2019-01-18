package com.wsacademico.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ extends com.wsacademico.api.model.comum.Pessoa_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile ListAttribute<Usuario, Permissao> permissoes;
	public static volatile SingularAttribute<Usuario, Long> ident;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile SingularAttribute<Usuario, String> email;

	public static final String SENHA = "senha";
	public static final String PERMISSOES = "permissoes";
	public static final String IDENT = "ident";
	public static final String LOGIN = "login";
	public static final String EMAIL = "email";

}

