package com.wsacademico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsacademico.api.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
}
