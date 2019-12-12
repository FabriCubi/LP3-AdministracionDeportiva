package com.lp3.controlador;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lp3.modelo.Director;
import com.lp3.negocio.DirectorService;

@RestController
@RequestMapping(value = "director/")
public class DirectorController {
    private static Logger logger  = LogManager.getLogger(DirectorController.class);
    
    @Autowired
    DirectorService directorService;
    
    @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object obtenerDirector(@RequestParam("ci") String cedula) {
	
    	try {
	            
	        	return directorService.consultarDirector(cedula);

	        }catch (Exception e) {
	            logger.error("Error al consultar director", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearDirector(@RequestBody Director director, HttpServletRequest httpRequest) {
	        try {
	            
	        	return directorService.guardarDirector(director);

	        }catch (Exception e) {
	            logger.error("Error al crear director", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
