package com.wsacademico.api.model;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ContatoAluno.class)
public abstract class ContatoAluno_ {

	public static volatile SingularAttribute<ContatoAluno, Aluno> aluno;
	public static volatile SingularAttribute<ContatoAluno, TipoTelefone> tipoTelefone;
	public static volatile SingularAttribute<ContatoAluno, String> telefone;
	public static volatile SingularAttribute<ContatoAluno, Long> ident;
	public static volatile SingularAttribute<ContatoAluno, TipoEmail> tipoEmail;
	public static volatile SingularAttribute<ContatoAluno, String> email;

}

