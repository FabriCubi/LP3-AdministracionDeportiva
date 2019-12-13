package com.lp3.negocio;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.EmpleadoDAO;
import com.lp3.dto.PromedioSalarioDTO;
import com.lp3.dto.PromedioSalarioDTO;
import com.lp3.modelo.Empleado;
import com.lp3.modelo.Jugador;

@ Service
public class EmpleadoService {
    private static Logger logger  = LogManager.getLogger(EmpleadoService.class);

    @Autowired
    EmpleadoDAO empleadoDAO;
    
	public Empleado consultarEmpleado(String ci) {
		
		return empleadoDAO.findById(ci).orElse(new Empleado());
	}
	
	public Empleado crearEmpleado(Empleado empleado) {
		try {
			return empleadoDAO.save(empleado);
			
		}catch(Exception e) {
			logger.error("Error al guardar empleado", e);
			throw e;
		}
		
	}
	
	public List<Empleado> listarTodosLosEmpleados(){
		
		return empleadoDAO.findAll();
		
	}


	public PromedioSalarioDTO listarPromedioPorEmpleado(String cargo){
		
		PromedioSalarioDTO promedioSalario = new PromedioSalarioDTO();
		
		List<Empleado> empleados = empleadoDAO.findByCargo(cargo);
	
		if(empleados == null || empleados.isEmpty()) {
			promedioSalario.setDescripcion("No Existe Cargo");
			return promedioSalario;
		}
		
		int promedio = 0;
		for(Empleado empleado : empleados) {	
			promedio = promedio + empleado.getSalario();
		}
		double montoPromedio  =  promedio / empleados.size();
		
		promedioSalario.setMontoPromedio(montoPromedio);
		promedioSalario.setDescripcion("Promedio por Cargo : " + cargo);
		
		return promedioSalario;
		
	}
	
}
