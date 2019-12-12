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

import com.lp3.modelo.Persona;
import com.lp3.negocio.PersonaService;

@RestController
@RequestMapping(value = "persona/")
public class PersonaController {
    private static Logger logger  = LogManager.getLogger(PersonaController.class);
    
    @Autowired
    PersonaService personaService;
    
      @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerPersona(@RequestParam("ci") String cedula) {
	        try {
	            
	        	return personaService.consultarPersona(cedula);

	        }catch (Exception e) {
	            logger.error("Error al crear persona", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearPersona(@RequestBody Persona persona, HttpServletRequest httpRequest) {
	        try {
	            
	        	return personaService.crearPersona(persona);

	        }catch (Exception e) {
	            logger.error("Error al crear persona", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
