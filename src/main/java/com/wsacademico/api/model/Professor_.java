package com.wsacademico.api.model;

import com.wsacademico.api.comum.ProfessorTitulacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Professor.class)
public abstract class Professor_ extends com.wsacademico.api.model.Pessoa_ {

	public static volatile SingularAttribute<Professor, ProfessorTitulacao> professorTitulacao;
	public static volatile SingularAttribute<Professor, Pessoa> pessoa;
	public static volatile SingularAttribute<Professor, Long> ident;

	public static final String PROFESSOR_TITULACAO = "professorTitulacao";
	public static final String PESSOA = "pessoa";
	public static final String IDENT = "ident";

}

