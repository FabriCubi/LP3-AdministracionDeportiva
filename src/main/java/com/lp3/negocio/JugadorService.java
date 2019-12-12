package com.lp3.negocio;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.JugadorDAO;
import com.lp3.dto.PromedioSalarioDTO;
import com.lp3.modelo.Jugador;

@Service
public class JugadorService {
	private static Logger logger = LogManager.getLogger(JugadorService.class);
	
	@Autowired
	JugadorDAO jugadorDAO;
	
	public Jugador consultarJugador(String ci) {
		return jugadorDAO.findById(ci).orElse(null);
	}
	
	public Jugador guardarJugador(Jugador jugador) {
		return jugadorDAO.save(jugador);
     }
	
	public List<Jugador> listarJugadoresPorEquipo(String equipo){
	
		return jugadorDAO.findByEquipo(equipo);
		
	}
	
	public PromedioSalarioDTO promedioPorJugador(String puesto) {
		
		PromedioSalarioDTO promedioSalario = new PromedioSalarioDTO();
		
		List<Jugador> jugadores = jugadorDAO.findByPuesto(puesto);
		
		if(jugadores == null || jugadores.isEmpty()) {
			promedioSalario.setDescripcion("No Existe puesto");
			return promedioSalario;
		}
		
		int promedio = 0;
		
		for(Jugador jugador : jugadores) {	
			promedio = promedio + jugador.getSalario();
		}
		
		double montoPromedio  =  promedio / jugadores.size();
		
		promedioSalario.setMontoPromedio(montoPromedio);
		
		promedioSalario.setDescripcion("Promedio del Equipo : " + puesto);
		
		return promedioSalario;
		
	}
}
