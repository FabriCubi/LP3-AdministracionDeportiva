package com.lp3.controlador;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lp3.negocio.EquipoService;



@RestController
@RequestMapping(value = "equipo/")
public class EquipoController {
    private static Logger logger  = LogManager.getLogger(EquipoController.class);

	@Autowired
	EquipoService equipoService;
	
	@GetMapping(value = "promedio", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerEquipos(@RequestParam("equipo") String equipo) {
	        try {
	            
	        	return equipoService.listarPromedioPorEquipo(equipo);

	        }catch (Exception e) {
	            logger.error("Error al crear entrenador", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}