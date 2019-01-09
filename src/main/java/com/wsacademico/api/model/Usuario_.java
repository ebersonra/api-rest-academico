package com.wsacademico.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, LocalDate> dataUltimoAcesso;
	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile ListAttribute<Usuario, Permissao> permissoes;
	public static volatile SingularAttribute<Usuario, Boolean> ativo;
	public static volatile SingularAttribute<Usuario, Long> ident;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, LocalDate> dataDesativacao;
	public static volatile SingularAttribute<Usuario, String> login;
	public static volatile SingularAttribute<Usuario, LocalDate> dataCadastro;
	public static volatile SingularAttribute<Usuario, String> email;

	public static final String DATA_ULTIMO_ACESSO = "dataUltimoAcesso";
	public static final String SENHA = "senha";
	public static final String PERMISSOES = "permissoes";
	public static final String ATIVO = "ativo";
	public static final String IDENT = "ident";
	public static final String NOME = "nome";
	public static final String DATA_DESATIVACAO = "dataDesativacao";
	public static final String LOGIN = "login";
	public static final String DATA_CADASTRO = "dataCadastro";
	public static final String EMAIL = "email";

}

