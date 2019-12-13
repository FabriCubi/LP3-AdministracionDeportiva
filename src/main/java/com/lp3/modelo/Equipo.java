package com.lp3.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name = "equipo")
public class Equipo {
	
	@Id
	private String equipo;
	private String entrenador;
	
	@JsonProperty(access = Access.READ_ONLY)
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "equipo_torneo", 
        joinColumns = { @JoinColumn(name = "equipo") }, 
        inverseJoinColumns = { @JoinColumn(name = "torneo") }
    )
	private List<Torneo> torneo;
	
	
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

	public List<Torneo> getTorneo() {
		return torneo;
	}
	public void setTorneo(List<Torneo> torneo) {
		this.torneo = torneo;
	}
	@Override
	public String toString() {
		return "Equipo [entrenador=" + entrenador + ", equipo=" + equipo +"]";
	}
	

}
