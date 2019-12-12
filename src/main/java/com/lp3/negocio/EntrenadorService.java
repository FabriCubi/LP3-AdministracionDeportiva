package com.lp3.negocio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.lp3.modelo.Entrenador;

@ Service
public class EntrenadorService {
	
    private static Logger logger  = LogManager.getLogger(EntrenadorService.class);

	public Entrenador consultarEntrenador(String ci) {
		
		return new Entrenador();
	}
	
	public String crearEntrenador(Entrenador entrenador) {
		
		return "";
	}

}
