package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entrenador")
public class Entrenador extends Persona{
	
	private String salario;
	private String equipo;
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
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
		return "Entrenador [salario=" + salario + ", equipo=" + equipo + "]";
	}


}
