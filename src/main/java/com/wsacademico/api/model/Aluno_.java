package com.wsacademico.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile SingularAttribute<Aluno, Long> codigoAluno;
	public static volatile SingularAttribute<Aluno, Long> ident;
	public static volatile SingularAttribute<Aluno, LocalDate> dataNascimento;

}

