package com.mateus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
