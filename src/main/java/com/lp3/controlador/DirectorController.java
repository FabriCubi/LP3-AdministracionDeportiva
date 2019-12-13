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

import com.lp3.modelo.Director;   //Importamos el modelo Director
import com.lp3.negocio.DirectorService;  // Y la clase de Negocio que tiene

@RestController
@RequestMapping(value = "director/")    /* RMapping para la clase persona DIRECTOR.*/
public class DirectorController {
    private static Logger logger  = LogManager.getLogger(DirectorController.class);
    
    @Autowired
    DirectorService directorService;
    /* GMapping Para consultar por C.I entre los Directores */
    @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object obtenerDirector(@RequestParam("ci") String cedula) {
	
    	try {
	            /*Retornamos la consulta si es que existe algun director con esa C.I*/
	        	return directorService.consultarDirector(cedula);

	        }catch (Exception e) {
		   /*Retornamos un error en caso de que no exista esa C.I*/
	            logger.error("Error al consultar director", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearDirector(@RequestBody Director director, HttpServletRequest httpRequest) {
	        try {
	            	/*Guardamos el Director en caso de que no hubo algun error.*/
	        	return directorService.guardarDirector(director);

	        }catch (Exception e) {
<<<<<<< HEAD
	            logger.error("Error al guardar director", e);
=======
			/*Hubo un error al guardar el archivo y retornamos su HTTP METHODS STATUS.*/
	            logger.error("Error al crear director", e);
>>>>>>> 704a0374a716d07e6e8016636858ae59f815206f
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
