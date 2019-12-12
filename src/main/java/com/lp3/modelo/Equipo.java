package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "equipo")
public class Equipo {
	
	@Id
	private String equipo;
	private String entrenador;
	
	
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public String toString() {
		return "Equipo [entrenador=" + entrenador + ", equipo=" + equipo +"]";
	}
	

}
