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

import com.lp3.dto.InscripcionDTO;
import com.lp3.modelo.Persona;
import com.lp3.modelo.Torneo;
import com.lp3.negocio.TorneoService;

@RestController
@RequestMapping(value = "torneo/")
public class TorneoController {
	
    private static Logger logger  = LogManager.getLogger(TorneoController.class);

	@Autowired
	TorneoService torneoService;
	
	 @GetMapping(value = "promedio", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerJugador(@RequestParam("torneo") String torneo) {
	        try {
	            
	        	return torneoService.promedioSalarioPorTorneo(torneo);

	        }catch (Exception e) {
	            logger.error("Error al obtener promedio", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearTorneo(@RequestBody Torneo torneo, HttpServletRequest httpRequest) {
	        try {
	            
	        	return torneoService.guardarTorneo(torneo);

	        }catch (Exception e) {
	            logger.error("Error al crear torneo", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 
	 @PostMapping(value = "inscripcion", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object inscripcionEquipo(@RequestBody InscripcionDTO inscripcion, HttpServletRequest httpRequest) {
	        try {
	            
	        	return torneoService.inscripcion(inscripcion);

	        }catch (Exception e) {
	            logger.error("Error al crear torneo", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	

}
