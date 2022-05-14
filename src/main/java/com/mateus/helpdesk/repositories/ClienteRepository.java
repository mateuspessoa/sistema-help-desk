package com.mateus.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateus.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
