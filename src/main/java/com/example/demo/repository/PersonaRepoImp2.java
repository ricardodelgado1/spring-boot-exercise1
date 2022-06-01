package com.example.demo.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.Demorichie2Application;


@Repository
@Qualifier("dos")
public class PersonaRepoImp2 implements IPersonaRepo{

	
	private static Logger LOG = LoggerFactory.getLogger(Demorichie2Application.class);
	
	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		LOG.info("SE REGISTRO EL NOMBRE IMPLEMENTACION 2"+ nombre);
	}
}
