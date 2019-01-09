package com.wsacademico.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ extends com.wsacademico.api.model.Pessoa_ {

	public static volatile SingularAttribute<Aluno, Long> codigoAluno;
	public static volatile SingularAttribute<Aluno, String> codigoMatricula;
	public static volatile SingularAttribute<Aluno, Pessoa> pessoa;
	public static volatile SingularAttribute<Aluno, Long> ident;
	public static volatile SingularAttribute<Aluno, String> ra;

	public static final String CODIGO_ALUNO = "codigoAluno";
	public static final String CODIGO_MATRICULA = "codigoMatricula";
	public static final String PESSOA = "pessoa";
	public static final String IDENT = "ident";
	public static final String RA = "ra";

}

