package com.lp3.negocio;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.AsociacionDAO;
import com.lp3.modelo.AsociacionEmpleados;

@Service
public class AsociacionService {
	
	@Autowired
	AsociacionDAO asociacionEmpleadosDAO;
	
	public AsociacionEmpleados inscripcion(AsociacionEmpleados asociacionEmpleados) {
		asociacionEmpleados.setFechaAsociacion(new Date().toString());
		return asociacionEmpleadosDAO.save(asociacionEmpleados);
	}

}
