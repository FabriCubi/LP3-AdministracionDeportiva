package com.lp3.negocio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.DirectorDAO;
import com.lp3.modelo.Director;

@ Service
public class DirectorService {
	
    private static Logger logger  = LogManager.getLogger(DirectorService.class);

	@Autowired
	DirectorDAO directorDAO;
	
	public Director consultarDirector(String ci) {
		//Retorna un Director por CI o null si no existe
		return directorDAO.findById(ci).orElse(null);
	}
	
	public Director guardarDirector(Director director) {
		try
		{
			return directorDAO.save(director);
			
		}catch(Exception e) {
			logger.error("Error guardando Director :", e);
			throw e;
		}
	}

}
