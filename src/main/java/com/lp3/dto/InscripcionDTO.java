package com.lp3.dto;

public class InscripcionDTO {
	
	private String torneo;
	private String equipo;
	public String getTorneo() {
		return torneo;
	}
	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "InscripcionDTO [torneo=" + torneo + ", equipo=" + equipo + "]";
	}	

}
