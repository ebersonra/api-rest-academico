package com.wsacademico.api.model;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaReligiao;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;
import com.wsacademico.api.comum.TipoFormacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Boolean> ativo;
	public static volatile SingularAttribute<Pessoa, Endereco> endereco;
	public static volatile SingularAttribute<Pessoa, RacaCor> racaCor;
	public static volatile SingularAttribute<Pessoa, PessoaReligiao> pessoaReligiao;
	public static volatile SingularAttribute<Pessoa, Long> ident;
	public static volatile SingularAttribute<Pessoa, PessoaTipo> pessoaTipo;
	public static volatile SingularAttribute<Pessoa, EstadoCivil> estadoCivil;
	public static volatile SingularAttribute<Pessoa, InformacoesPessoa> informacoesPessoa;
	public static volatile SingularAttribute<Pessoa, Nacionalidade> nacionalidade;
	public static volatile SingularAttribute<Pessoa, PessoaSexo> pessoaSexo;
	public static volatile SingularAttribute<Pessoa, TipoFormacao> tipoFormacao;
	public static volatile SingularAttribute<Pessoa, PessoaGrauParentesco> pessoaGrauParentesco;

	public static final String ATIVO = "ativo";
	public static final String ENDERECO = "endereco";
	public static final String RACA_COR = "racaCor";
	public static final String PESSOA_RELIGIAO = "pessoaReligiao";
	public static final String IDENT = "ident";
	public static final String PESSOA_TIPO = "pessoaTipo";
	public static final String ESTADO_CIVIL = "estadoCivil";
	public static final String INFORMACOES_PESSOA = "informacoesPessoa";
	public static final String NACIONALIDADE = "nacionalidade";
	public static final String PESSOA_SEXO = "pessoaSexo";
	public static final String TIPO_FORMACAO = "tipoFormacao";
	public static final String PESSOA_GRAU_PARENTESCO = "pessoaGrauParentesco";

}

