package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado extends Persona {
   private Integer salario;
   private String cargo;
   
	   
	public Integer getSalario() {
		return salario;
	}
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", cargo=" + cargo + "]";
	}
	   
	   
   
   
}
