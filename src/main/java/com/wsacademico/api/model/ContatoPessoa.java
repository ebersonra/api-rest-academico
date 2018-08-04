package com.wsacademico.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.wsacademico.api.comum.TipoEmail;
import com.wsacademico.api.comum.TipoTelefone;

@Entity
@Table(name="CAD_CONTATO_PESSOA")
public class ContatoPessoa {

	private Long ident;
	
	private Pessoa pessoa;
	private TipoEmail tipoEmail;
	private TipoTelefone tipoTelefone;
	private String email;
	private String telefone;
	
}
