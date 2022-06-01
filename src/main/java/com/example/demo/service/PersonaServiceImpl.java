package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPersonaRepo;


@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	@Qualifier("dos")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		repo.registrar(nombre);
	}
	
	
	
}
