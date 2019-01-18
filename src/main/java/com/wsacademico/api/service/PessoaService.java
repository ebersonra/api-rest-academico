package com.wsacademico.api.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.wsacademico.api.model.comum.Pessoa;
import com.wsacademico.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	/**
	 * Método responsável por atualizar entidade pessoa.
	 * @author eberson
	 * 
	 * @param id
	 * @param pessoa
	 * 
	 * @return entidade pessoa atualizada.
	 * */
	public Pessoa atualizar(Long ident, Pessoa pessoa) {
		
		Pessoa pessoaPesquisada = pessoaPorCodigo(ident);
		BeanUtils.copyProperties(pessoa, pessoaPesquisada, "ident");
		return pessoaRepository.save(pessoaPesquisada);
	}
	
	/**
	 * Método responsável por atualizar a propriedade ativo.
	 * @author eberson
	 * 
	 * @param id
	 * @param ativo
	 * */
	public void atualizarPropriedadeAtivo(Long id, boolean ativo) {
		
		Pessoa pessoaPesquisada = pessoaPorCodigo(id);
		pessoaPesquisada.setAtivo(ativo);
		pessoaRepository.save(pessoaPesquisada);
	}
	
	private Pessoa pessoaPorCodigo(Long id) {
		
		Optional<Pessoa> pessoaPesquisada = pessoaRepository.findById(id);
		if(!pessoaPesquisada.isPresent()) {
			
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaPesquisada.get();
	}

}
