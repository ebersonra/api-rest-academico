package com.wsacademico.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsacademico.api.event.RecursoCriadoEvent;
import com.wsacademico.api.model.Aluno;
import com.wsacademico.api.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Aluno> alunos(){
		
		return alunoRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Aluno> novo(@Valid @RequestBody Aluno aluno, HttpServletResponse response) {
		
		Aluno alunoNovo = alunoRepository.save(aluno);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, alunoNovo.getId()));
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoNovo);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> alunoPorId(@PathVariable Long id) {
		
		Aluno aluno = alunoRepository.findOne(id);
		if(!(aluno == null)) {
			
			return ResponseEntity.ok(aluno);
		}
		
		return ResponseEntity.notFound().build();
	}
}
