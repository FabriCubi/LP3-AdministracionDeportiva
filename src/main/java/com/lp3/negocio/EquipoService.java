package com.lp3.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.EquipoDAO;
import com.lp3.dto.PromedioSalarioDTO;
import com.lp3.modelo.Equipo;
import com.lp3.modelo.Jugador;

@Service
public class EquipoService {
	
	@Autowired
	private EquipoDAO equipoDAO;
	
	@Autowired
	private JugadorService jugadorService;
	
	
	public List<Equipo> listarTodosLosEquipos(){
		
		return equipoDAO.findAll();
		
	}
	public Equipo getById(String equipo) {
		
		return equipoDAO.findById(equipo).orElse(null);
	}
	public Equipo guardar(Equipo equipo) {
		
	    Equipo equipoEncontrado = equipoDAO.findById(equipo.getEquipo()).orElse(null);
	    if(equipoEncontrado!=null)
	    	equipo.setTorneo(equipoEncontrado.getTorneo());
	    
	    return equipoDAO.save(equipo);
	}
	
	public PromedioSalarioDTO listarPromedioPorEquipo(String equipo){
		
		PromedioSalarioDTO promedioSalario = new PromedioSalarioDTO();
		
		List<Jugador> jugadores = jugadorService.listarJugadoresPorEquipo(equipo);
	
		if(jugadores == null || jugadores.isEmpty()) {
			promedioSalario.setDescripcion("No Existe Equipo");
			return promedioSalario;
		}
		
		int promedio = 0;
		for(Jugador jugador : jugadores) {	
			promedio = promedio + jugador.getSalario();
		}
		double montoPromedio  =  promedio / jugadores.size();
		
		promedioSalario.setMontoPromedio(montoPromedio);
		promedioSalario.setDescripcion("Promedio del Equipo : " + equipo);
		
		return promedioSalario;
	}

}
