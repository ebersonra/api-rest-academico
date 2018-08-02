package com.wsacademico.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wsacademico.api.event.RecursoCriadoEvent;
import com.wsacademico.api.model.Pessoa;
import com.wsacademico.api.repository.PessoaRepository;
import com.wsacademico.api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Pessoa> pessoas(){
		
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> nova(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response){
		
		Pessoa pessoaNovo = pessoaRepository.save(pessoa);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, pessoaNovo.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaNovo);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> pessoaPorId(@PathVariable Long id){
		
		Pessoa pessoa = pessoaRepository.findOne(id);
		
		if(!(pessoa == null)) {
			
			return ResponseEntity.ok(pessoa);
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		
		pessoaRepository.delete(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @Valid @RequestBody Pessoa pessoa){
		
		Pessoa pessoaAtualizada = pessoaService.atualizar(id, pessoa);
		return ResponseEntity.ok(pessoaAtualizada);
	}
	
	@PutMapping("/{id}/ativo")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizarPropriedadeAtivo(@PathVariable Long id, @RequestBody Boolean ativo) {
		
		pessoaService.atualizarPropriedadeAtivo(id, ativo);
	}
}
