package com.mateus.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mateus.helpdesk.domain.Chamado;
import com.mateus.helpdesk.domain.Cliente;
import com.mateus.helpdesk.domain.Tecnico;
import com.mateus.helpdesk.domain.enums.Perfil;
import com.mateus.helpdesk.domain.enums.Prioridade;
import com.mateus.helpdesk.domain.enums.Status;
import com.mateus.helpdesk.repositories.ChamadoRepository;
import com.mateus.helpdesk.repositories.ClienteRepository;
import com.mateus.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Fernando Marques", "098.435.330-54", "fernando@mail.com", encoder.encode("1234"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Mateus Pessoa", "690.223.720-49", "mateus@mail.com", encoder.encode("1234"));
		Tecnico tec3 = new Tecnico(null, "Maria da Silva", "775.989.700-68", "maria@mail.com", encoder.encode("1234"));
		Tecnico tec4 = new Tecnico(null, "João Silva", "836.121.560-39", "joao@mail.com", encoder.encode("1234"));
		
		
		Cliente cli1 = new Cliente(null, "Cristinao Freitas", "28076829011", "criatiano@mail.com", encoder.encode("1234"));
		Cliente cli2 = new Cliente(null, "Lucas Souza", "348.080.210-99", "lucas@mail.com", encoder.encode("1234"));
		Cliente cli3 = new Cliente(null, "Felipe Paes", "972.530.890-57", "felipe@mail.com", encoder.encode("1234"));
		Cliente cli4 = new Cliente(null, "Jorge Torres", "273.565.910-06", "jorge@mail.com", encoder.encode("1234"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
