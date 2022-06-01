package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IPersonaService;
import com.example.demo.service.PersonaServiceImpl;


@SpringBootApplication
public class Demorichie2Application implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(Demorichie2Application.class);
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(Demorichie2Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.print("Hola este es un Mensaje");
		
		//LOG.info("esta es otra parte");
		//LOG.warn("esto es un warning richie");
		service.registrar("Ricardo Delgado");
	}

}