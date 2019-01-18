package com.wsacademico.api.model.comum;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EntidadeComum.class)
public abstract class EntidadeComum_ {

	public static volatile SingularAttribute<EntidadeComum, LocalDate> dataUltimoAcesso;
	public static volatile SingularAttribute<EntidadeComum, LocalDate> dataExclusao;
	public static volatile SingularAttribute<EntidadeComum, Long> ident;
	public static volatile SingularAttribute<EntidadeComum, Long> idUsuarioCadastrou;
	public static volatile SingularAttribute<EntidadeComum, LocalDate> dataDesativacao;
	public static volatile SingularAttribute<EntidadeComum, LocalDate> dataCadastro;

	public static final String DATA_ULTIMO_ACESSO = "dataUltimoAcesso";
	public static final String DATA_EXCLUSAO = "dataExclusao";
	public static final String IDENT = "ident";
	public static final String ID_USUARIO_CADASTROU = "idUsuarioCadastrou";
	public static final String DATA_DESATIVACAO = "dataDesativacao";
	public static final String DATA_CADASTRO = "dataCadastro";

}

