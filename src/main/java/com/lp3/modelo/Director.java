package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class Director extends Persona {
    private String salario;

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Director [salario=" + salario + "]";
	}
    
    
}
