package com.wsacademico.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsacademico.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
