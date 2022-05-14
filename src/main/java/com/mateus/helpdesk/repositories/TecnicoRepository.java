package com.mateus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
