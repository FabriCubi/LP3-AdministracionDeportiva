package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jugador")
public class Jugador extends Persona{
	private String puesto;
	private Integer salario;
	private String equipo;
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Jugador [puesto=" + puesto + ", salario=" + salario + ", equipo=" + equipo + "]";
	}
	
	
	
}
