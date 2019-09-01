package com.sura.misAliados.dominio.modelo;

import java.util.Date;

public class Independiente {

	private String apellidos;
	private String correo;
	private String estado;
	private Date fechaNacimiento;
	private String ingresosMensualesAprox;
	private String nombres;
	private String numeroDocumento;
	private String oficio;
	private String sexo;
	private String telefono;
	private String tipoDocumento;
	
	public Independiente(String apellidos, String correo, String estado, Date fechaNacimiento, String ingresosMensualesAprox,
			String nombres, String numeroDocumento, String oficio, String sexo, String telefono, String tipoDocumento) {
		this.apellidos = apellidos;
		this.correo = correo;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
		this.ingresosMensualesAprox = ingresosMensualesAprox;
		this.nombres = nombres;
		this.numeroDocumento = numeroDocumento;
		this.oficio = oficio;
		this.sexo = sexo;
		this.telefono = telefono;
		this.tipoDocumento = tipoDocumento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getIngresosMensualesAprox() {
		return ingresosMensualesAprox;
	}

	public String getNombres() {
		return nombres;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getOficio() {
		return oficio;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
}
