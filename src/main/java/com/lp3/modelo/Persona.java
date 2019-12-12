package com.lp3.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@Id
	private String cedulaIdentidad;
	private String nombreApellido;
	private String fechaNacimiento;
	private String telefono;
	private String domicilio;
	
	
	public String getCedulaIdentidad() {
		return cedulaIdentidad;
	}
	public void setCedulaIdentidad(String cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		return "Persona [cedulaIdentidad=" + cedulaIdentidad + ", nombreApellido=" + nombreApellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
	}
}
