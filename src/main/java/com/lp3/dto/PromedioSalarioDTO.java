package com.lp3.dto;

public class PromedioSalarioDTO {
	
	private Double montoPromedio;
	private String descripcion;
	public Double getMontoPromedio() {
		return montoPromedio;
	}
	public void setMontoPromedio(Double montoPromedio) {
		this.montoPromedio = montoPromedio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "PromedioSalario [montoPromedio=" + montoPromedio + ", descripcion=" + descripcion + "]";
	}

}
