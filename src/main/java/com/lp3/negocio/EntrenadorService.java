package com.lp3.negocio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.EntrenadorDAO;
import com.lp3.modelo.Entrenador;

@ Service
public class EntrenadorService {
	
    private static Logger logger  = LogManager.getLogger(EntrenadorService.class);

    @Autowired
    EntrenadorDAO entrenadorDAO;
    
	public Entrenador consultarEntrenador(String ci) {
		
		return entrenadorDAO.findById(ci).orElse(new Entrenador());
	}
	
	public Entrenador crearEntrenador(Entrenador entrenador) {
		return entrenadorDAO.save(entrenador);
	}

}
