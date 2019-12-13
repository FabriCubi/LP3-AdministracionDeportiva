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

import com.lp3.modelo.AsociacionEmpleados;
import com.lp3.modelo.Director;
import com.lp3.negocio.AsociacionService;

@RestController
@RequestMapping(value = "asociacion/")
public class AsociacionController {
	
    private static Logger logger  = LogManager.getLogger(AsociacionController.class);

	@Autowired
	AsociacionService asociacionService;
	
	 @PostMapping(value = "inscripcion", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object inscripcionAsociacion(@RequestBody AsociacionEmpleados asociacionEmpleados, HttpServletRequest httpRequest) {
		
	    	try {
		            
		        	return asociacionService.inscripcion(asociacionEmpleados);

		        }catch (Exception e) {
		            logger.error("Error al inscribir en asociacion empleados", e);
		            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
	  
}
