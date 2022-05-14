package com.mateus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
