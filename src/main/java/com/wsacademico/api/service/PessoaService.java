package com.wsacademico.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.wsacademico.api.model.Pessoa;
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
	public Pessoa atualizar(Long id, Pessoa pessoa) {
		
		Pessoa pessoaPesquisada = pessoaPorCodigo(id);
		BeanUtils.copyProperties(pessoa, pessoaPesquisada, "id");
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
		
		Pessoa pessoaPesquisada = pessoaRepository.findOne(id);
		if(pessoaPesquisada == null) {
			
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaPesquisada;
	}

}
