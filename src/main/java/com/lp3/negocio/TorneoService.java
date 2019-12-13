package com.lp3.negocio;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp3.dao.TorneoDAO;
import com.lp3.dto.ErrorDTO;
import com.lp3.dto.InscripcionDTO;
import com.lp3.dto.PromedioSalarioDTO;
import com.lp3.modelo.Equipo;
import com.lp3.modelo.Torneo;

@Service
public class TorneoService {
	
    private static Logger logger  = LogManager.getLogger(TorneoService.class);

    @Autowired
    TorneoDAO torneoDAO;
    
    @Autowired
    EquipoService equipoService;
    
    
    public Object guardarTorneo(Torneo torneo) {
    	
    	Torneo torneoEncontrado = torneoDAO.findById(torneo.getTorneo()).orElse(null);
    	
    	if(torneoEncontrado != null)
    		torneo.setParticipantes(torneoEncontrado.getParticipantes());
    	
    	return torneoDAO.save(torneo);
    }
    
    public List<PromedioSalarioDTO> promedioSalarioPorTorneo(String torneo){
    	
    	
    	List<PromedioSalarioDTO> promedios = new ArrayList();
        
   
    	Torneo torneoEncontrado = torneoDAO.findById(torneo).orElse(null);
    	
    	
    	if(torneoEncontrado == null )
    		return promedios;
    	
    	
    	for(Equipo equipo: torneoEncontrado.getParticipantes())
    		promedios.add(equipoService.listarPromedioPorEquipo(equipo.getEquipo()));
    		
    	
    	return promedios;
    	
    }
    
    public Object inscripcion(InscripcionDTO inscripcion) {
    	
    	if(inscripcion == null || inscripcion.getEquipo() == null || inscripcion.getTorneo()==null)
    		return new ErrorDTO("ERROR", "No se eviaron los datos requeridos: Equipo o CodigoTorneo");
    		
    	Torneo torneo = torneoDAO.findById(inscripcion.getTorneo()).orElse(null);
    	
    	if(torneo == null) return new ErrorDTO("ERROR","No existe el torneo especificado");
    	
    	Equipo equipo = equipoService.getById(inscripcion.getEquipo());
    	
    	if(equipo == null) return new ErrorDTO ("ERROR", "No existe el equipo especificado");
    	
    	torneo.getParticipantes().add(equipo);
    	
    	return torneoDAO.save(torneo);
    	
    }

}
