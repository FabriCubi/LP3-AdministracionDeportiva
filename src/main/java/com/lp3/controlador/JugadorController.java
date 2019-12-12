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

import com.lp3.modelo.Jugador;
import com.lp3.negocio.JugadorService;

@RestController
@RequestMapping(value = "jugador/")
public class JugadorController {
    private static Logger logger  = LogManager.getLogger(JugadorController.class);
    
    @Autowired
    JugadorService jugadorService;
    
      @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerJugador(@RequestParam("ci") String cedula) {
	        try {
	            
	        	return jugadorService.consultarJugador(cedula);

	        }catch (Exception e) {
	            logger.error("Error al crear jugador", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object creaJugador(@RequestBody Jugador jugador, HttpServletRequest httpRequest) {
	        try {
	            
	        	return jugadorService.guardarJugador(jugador);

	        }catch (Exception e) {
	            logger.error("Error al crear jugador", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
