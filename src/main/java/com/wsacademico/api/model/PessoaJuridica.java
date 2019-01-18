package com.wsacademico.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wsacademico.api.model.comum.Pessoa;

@Entity
@Table(name="CAD_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String RazaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;

}
