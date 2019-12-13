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

import com.lp3.modelo.Empleado;
import com.lp3.negocio.EmpleadoService;

@RestController
@RequestMapping(value = "empleado/")
public class EmpleadoController {
    private static Logger logger  = LogManager.getLogger(EmpleadoController.class);
    
    @Autowired
    EmpleadoService empleadoService;
    
      @GetMapping(value = "consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerEmpleado(@RequestParam("ci") String cedula) {
	        try {
	            
	        	return empleadoService.consultarEmpleado(cedula);

	        }catch (Exception e) {
	            logger.error("Error al consultar empleado", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
  
	 @PostMapping(value = "guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object crearEmpleado(@RequestBody Empleado empleado, HttpServletRequest httpRequest) {
	        try {
	            
	        	return empleadoService.crearEmpleado(empleado);

	        }catch (Exception e) {
	            logger.error("Error al guardar empleado", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 @GetMapping(value ="todos", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerTodosLosEmpleados() {
	        try {
	            
	        	return empleadoService.listarTodosLosEmpleados();

	        }catch (Exception e) {
	            logger.error("Error al consultar empleado", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	 

     @GetMapping(value = "promedio", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Object obtenerPromedioEmpleado(@RequestParam("cargo") String cargo) {
	        try {
	            
	        	return empleadoService.listarPromedioPorEmpleado(cargo);

	        }catch (Exception e) {
	            logger.error("Error al consultar empleado", e);
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
