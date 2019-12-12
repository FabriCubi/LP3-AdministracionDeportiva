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

import com.lp3.modelo.Entrenador;
import com.lp3.negocio.EntrenadorService;

@RestController
@RequestMapping(value = "entrenador/")
public class EntrenadorController {
    private static Logger logger  = LogManager.getLogger(EntrenadorController.class);
    
    @Autowired
    EntrenadorService entrenadorService;
    
      @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerEntrenador(@RequestParam("ci") String cedula) {
	        try {
	            
	        	return entrenadorService.consultarEntrenador(cedula);

	        }catch (Exception e) {
	            logger.error("Error al crear entrenador", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearPersona(@RequestBody Entrenador entrenador, HttpServletRequest httpRequest) {
	        try {
	            
	        	return entrenadorService.crearEntrenador(entrenador);

	        }catch (Exception e) {
	            logger.error("Error al crear entrenador", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
