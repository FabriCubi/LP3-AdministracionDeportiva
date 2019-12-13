package com.lp3.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aso_empleados")
public class AsociacionEmpleados {
	@Id
	private String ci;
	private String fechaAsociacion;
	private String descripcion;
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getFechaAsociacion() {
		return fechaAsociacion;
	}
	public void setFechaAsociacion(String fechaAsociacion) {
		this.fechaAsociacion = fechaAsociacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "AsociacionEmpleados [ci=" + ci + ", fechaAsociacion=" + fechaAsociacion + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
