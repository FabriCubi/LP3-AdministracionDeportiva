package com.lp3.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="torneos")
public class Torneo {
	
	@Id
	private String torneo;
	private String tipo;
	private String fechaInicio;
	private String fechaFin;
	private String ganador;
	private String puntos;

	
	@JsonProperty(access = Access.READ_ONLY)
	@OneToMany(mappedBy = "torneo")
	private List<Equipo> participantes;

	public String getTorneo() {
		return torneo;
	}

	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	public List<Equipo> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Equipo> participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Torneo [torneo=" + torneo + ", tipo=" + tipo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", ganador=" + ganador + "]";
	}
}
