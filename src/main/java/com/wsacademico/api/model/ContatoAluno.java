package com.wsacademico.api.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;

@Entity
@Table(name="CAD_CONTATO_ALUNO")
public class ContatoAluno {

	private Long ident;
	
	@ManyToOne
	private Aluno aluno;
	private TipoEmail tipoEmail;
	private TipoTelefone tipoTelefone;
	private String email;
	private String telefone;
	
}
