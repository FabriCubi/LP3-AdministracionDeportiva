package com.lp3.negocio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.PersonaDAO;
import com.lp3.modelo.Persona;

@ Service
public class PersonaService {
    private static Logger logger  = LogManager.getLogger(PersonaService.class);

	@Autowired
	PersonaDAO personaDAO;
	
	public Persona consultarPersona(String ci) {
		//Retorna una persona por CI, y vacio si no existe
		return personaDAO.findById(ci).orElse(new Persona());
	}
	
	public Persona crearPersona(Persona persona) {
		try {
			
			return personaDAO.save(persona);
			
		}catch(Exception e) {
			logger.error("Error creando Persona: ", e);
			throw e;
		}
	}

}
