package com.wsacademico.api.model;

import com.wsacademico.api.comum.EstadoCivil;
import com.wsacademico.api.comum.Nacionalidade;
import com.wsacademico.api.comum.PessoaGrauParentesco;
import com.wsacademico.api.comum.PessoaSexo;
import com.wsacademico.api.comum.PessoaTipo;
import com.wsacademico.api.comum.RacaCor;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Boolean> ativo;
	public static volatile SingularAttribute<Pessoa, Endereco> endereco;
	public static volatile SingularAttribute<Pessoa, Long> ident;
	public static volatile SingularAttribute<Pessoa, PessoaTipo> pessoaTipo;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile SingularAttribute<Pessoa, EstadoCivil> estadoCivil;
	public static volatile SingularAttribute<Pessoa, InformacoesPessoa> informacoesPessoa;
	public static volatile SingularAttribute<Pessoa, PessoaSexo> pessoaSexo;
	public static volatile SingularAttribute<Pessoa, Long> idade;
	public static volatile SingularAttribute<Pessoa, String> rg;
	public static volatile SingularAttribute<Pessoa, RacaCor> racaCor;
	public static volatile SingularAttribute<Pessoa, String> cpf;
	public static volatile SingularAttribute<Pessoa, String> nomePai;
	public static volatile SingularAttribute<Pessoa, String> pis;
	public static volatile SingularAttribute<Pessoa, String> sobrenome;
	public static volatile SingularAttribute<Pessoa, Nacionalidade> nacionalidade;
	public static volatile SingularAttribute<Pessoa, String> cnh;
	public static volatile SingularAttribute<Pessoa, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Pessoa, String> nomeMae;
	public static volatile SingularAttribute<Pessoa, PessoaGrauParentesco> pessoaGrauParentesco;

}

